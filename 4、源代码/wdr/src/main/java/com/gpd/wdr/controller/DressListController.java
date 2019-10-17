package com.gpd.wdr.controller;

import com.gpd.wdr.entity.Weddingdress;
import com.gpd.wdr.service.ModelService;
import com.gpd.wdr.service.WeddingdressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class DressListController {
    @Autowired
    private WeddingdressService weddingdressService;
    @Autowired
    private ModelService modelService;
    @RequestMapping("/dressList")
    public String toDressList(Model model){
        List<com.gpd.wdr.entity.Model> resultMSA=modelService.selectAll();
        List<Weddingdress> resultWSBM;
        if (resultMSA!=null){
            for (com.gpd.wdr.entity.Model m:resultMSA){
                resultWSBM= weddingdressService.selectByModel( m.getModelId());
                model.addAttribute("weddingDressList"+m.getModelId(),resultWSBM);
            }
        }
        List<Weddingdress> resultWSBN=weddingdressService.selectByNum();
        model.addAttribute("hotWeddingDressList",resultWSBN);
        return "dressList";
    }
}
