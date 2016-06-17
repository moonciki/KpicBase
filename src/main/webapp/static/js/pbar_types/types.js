function index(id, num){
    $.post("/pbar/types/index",{'id':id, 'num':num},function(data){
        if(data){
            location.reload();
        }else{
            alert("操作错误！请重试");
        }
    })
}

function qx(){
    $("#fc").hide();
}

function edit(id, name, picUrl, weight, isIndex){
    $("#fc").show();
    $("#typeId").val(id);
    $("#name").val(name);
    $("#picUrl").val(picUrl)
    $("#weight").val(weight);
    $("#isIndex").val(isIndex);
}

function tj(){
    var id = $("#typeId").val();
    var name = $("#name").val();
    var picUrl = $("#picUrl").val();
    var weight = $("#weight").val();
    var isIndex = $("#isIndex").val();

    $.post("/pbar/types/update", {'id':id,'name':name,'picUrl':picUrl, 'weight':weight,'isIndex':isIndex}, function(data){
        if(data){
            location.reload();
        }else{
            alert("操作错误！请重试");
        }
    });
}