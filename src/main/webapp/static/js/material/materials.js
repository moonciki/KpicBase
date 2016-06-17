/** 上传*/
$().ready(function() {

    Qiniu.uploader({
        runtimes: 'html5,flash,html4',
        browse_button: 'upload',
        uptoken_url: '/material/uptoken',
        domain: 'http://7xs5lv.com1.z0.glb.clouddn.com/',
        max_file_size: '10mb',
        multi_selection:false,
        flash_swf_url: 'static/js/plupload/Moxie.swf',
        max_retries: 5,
        chunk_size: '1mb',
        auto_start: true,
        filters: {
            mime_types: [
                {title: "Images files", extensions: "jpg,png,gif"},
            ],
            prevent_duplicates: true,
        },
        init: {
            'BeforeUpload': function (up, file) {
                var filename = file.name;
                var extStart = filename.lastIndexOf(".");
                var ext = filename.substring(extStart, filename.length).toUpperCase();
                console.log(up);
                if (ext != ".JPG" && ext != ".PNG" && ext != ".GIF") {
                    alert("上传文件只支持jpg、png、gif格式的图片！");
                    up.destroy();
                } else {}
            },
            'UploadProgress': function (up, file) {
            },
            'Error': function (up, err, errTip) {
                console.log(err);
                console.log(errTip);
                alert("上传出错 -_-# 可能出现以下错误：\n①网络连接失效\n②上传文件过大\n③后台程序出现未知错误");
            },
            'FileUploaded': function (up, file, info) {
                console.log(info);
                info = JSON.parse(info);
                $("#url").val("http://7xs5lv.com1.z0.glb.clouddn.com/"+info.key);
                $("#pic").append("<img src=\"http://7xs5lv.com1.z0.glb.clouddn.com/"+info.key+"?imageView2/1/w/100/h/100/q/95\"/>")
            },
            'Key': function (up, file) {
                var key = "";
                $.ajax({
                    url: "/material/uuid", async: false, context: document.body, success: function (data) {
                        if (data.success) {
                            key = data.uuid;
                        } else {

                        }
                    }, error: function () {
                    }, "dataType": "json"
                });

                return key;
            }
        }
    });
});


function tj(){
    var name = $("#name").val();
    var postfix = $("#postfix").val();
    var url = $("#url").val();

    $.post("/material/add", {'name':name, 'postfix':postfix, 'url':url}, function(data){
       if(data){
           location.reload();
       }else{
           alert("添加出错，请重试！");
       }
    });
}