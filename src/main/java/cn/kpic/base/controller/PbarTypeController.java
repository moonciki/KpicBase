package cn.kpic.base.controller;

import cn.kpic.base.domain.PbarType;
import cn.kpic.base.service.PbarTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by bjsunqinwen on 2016/6/17.
 */
@Controller
public class PbarTypeController {

    @Autowired
    private PbarTypeService pbarTypeService;

    @RequestMapping(value = "/pbar/types")
    public String pbarTypeIndex(Model model){
        List<PbarType> result = this.pbarTypeService.getAllPbarType();
        model.addAttribute("types", result);
        return "/pbar_types/types";
    }

    @RequestMapping(value = "/pbar/types/index")
    @ResponseBody
    public Boolean index(Long id, Integer num){
        try{
            if(id == null || num == null){
                return false;
            }
            PbarType pbarType = new PbarType();
            pbarType.setId(id);
            pbarType.setIsIndex(num);
            this.pbarTypeService.update(pbarType);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @RequestMapping(value = "/pbar/types/update")
    @ResponseBody
    public Boolean update(PbarType pbarType){
        try{
            if(pbarType == null){
                return false;
            }
            this.pbarTypeService.update(pbarType);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

}
