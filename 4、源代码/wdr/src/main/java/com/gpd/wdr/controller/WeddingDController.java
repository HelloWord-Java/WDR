package com.gpd.wdr.controller;

import com.gpd.wdr.entity.Images;
import com.gpd.wdr.entity.Weddingdress;
import com.gpd.wdr.service.ImagesService;
import com.gpd.wdr.service.RentpriceService;
import com.gpd.wdr.service.WeddingdressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author Administrator
 */
@Controller
public class WeddingDController {
    @Autowired
    private WeddingdressService weddingdressService;
    @Autowired
    private ImagesService imagesService;
    @RequestMapping("weddingDressManager")
    public String toWeddingDressManager(Model model){
        List<Weddingdress> resultSA=weddingdressService.selectAll();
        model.addAttribute("resultList",resultSA);
        return "weddingDressManager";
    }
    @RequestMapping(value = "/addWeddingDress/do")
    @ResponseBody
    public int addWeddingDress(MultipartFile uploadFile, Weddingdress weddingdress, HttpServletRequest request)throws IOException {
        System.out.println("id"+weddingdress.getWeddingdressId());
        String fileName=uploadFile.getOriginalFilename();
        String format=fileName.substring(fileName.lastIndexOf(".") + 1);
        String fName=null;
        switch (format){
            case "jpg":
                fName="photo";
                break;
            case "png":
                fName="photo";
                break;
            default:
                return 2;
        }
        System.out.println("name="+fileName+"id"+weddingdress.getWeddingdressId());
        //        保存文件到服务器
        String url=request.getServletContext().getRealPath("upload/")+fName+weddingdress.getWeddingdressId()+"."+format;
        File file=new File(url);
        uploadFile.transferTo(file);
        //数据库修改
        Weddingdress resultWSK=weddingdressService.selectByPrimaryKey(weddingdress.getWeddingdressId());
        if (resultWSK==null){
            int resultWAS=weddingdressService.addSelective(weddingdress);
            Images images=new Images();
            images.setImgId(weddingdress.getWeddingdressId());
            images.setWeddingdressId(weddingdress.getWeddingdressId());
            images.setImgUrl("upload/"+fName+weddingdress.getWeddingdressId()+"."+format);
            if (imagesService.selectByPrimaryKey(images.getImgId())==null){
                imagesService.add(images);
            }
            return 1;
        }else {
            return -1;
        }
    }
    @RequestMapping("/updateWeddingDress/do")
    @ResponseBody
    public int updateWeddingDress(Weddingdress weddingdress){
        int result=weddingdressService.updateByPrimaryKeySelective(weddingdress);
        return result;
    }
    @RequestMapping("/deleteWeddingDress/do")
    @ResponseBody
    public int deleteWeddingDress(@RequestBody  Weddingdress weddingdress){
        int result=weddingdressService.deleteByPrimaryKey(weddingdress.getWeddingdressId());
        return result;
    }
}
