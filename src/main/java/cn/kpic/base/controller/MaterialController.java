package cn.kpic.base.controller;

import cn.kpic.base.domain.Material;
import cn.kpic.base.domain.vo.UploadTokenInfo;
import cn.kpic.base.qiniu.kpic2.QiniuService;
import cn.kpic.base.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by bjsunqinwen on 2016/6/17.
 */
@Controller
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    @Autowired
    private QiniuService qiniuService;

    @RequestMapping(value = "/material/upload")
    public String materialUpload(@RequestParam(value = "page", defaultValue = "0",required = false)int page, Model model){
        model.addAttribute("materials", this.materialService.getAllMaterial(page * 10));
        model.addAttribute("page", page);
        return "/material/materials";
    }

    /** 获取uptoken*/
    @RequestMapping(value = "/material/uptoken")
    @ResponseBody
    public Map<String, Object> upload(){
        Map<String, Object> map = new HashMap();

        try {
            UploadTokenInfo uploadTokenInfo = qiniuService.generateUploadToken();
            map.put("success", true);
            map.put("uptoken", uploadTokenInfo.getToken());
        } catch(Throwable t){
            map.put("success", false);
            map.put("message", t.getMessage());
        }

        return map;
    }

    @RequestMapping(value = "/material/uuid")
    @ResponseBody
    public Map<String, Object> uuid(){
        Map<String, Object> map = new HashMap();

        try {
            String uuid = "sucai/"+qiniuService.generateUUID() + ".jpg";
            map.put("success", true);
            map.put("uuid", uuid);
        } catch(Throwable t){
            map.put("success", false);
        }

        return map;
    }

    @RequestMapping(value = "/material/add")
    @ResponseBody
    public Boolean materialUpload(Material material){
        try{
            material.setCreateTime(new Date());
            this.materialService.insert(material);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

}
