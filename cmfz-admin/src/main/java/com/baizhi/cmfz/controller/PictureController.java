package com.baizhi.cmfz.controller;

import com.baizhi.cmfz.entity.Picture;
import com.baizhi.cmfz.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

/**
 * Created by fu on 2018/7/5.
 */
@Controller
@RequestMapping("/picture")
public class PictureController {

    @Autowired
    private PictureService pictureService;

    @RequestMapping("/showPic")
    @ResponseBody
    public Map<String,Object> getPic(@RequestParam("rows")int totalSize, @RequestParam("page")int pageIndex){
        return pictureService.queryAllPic(totalSize,pageIndex);
    }

    @RequestMapping("/addPic")
    @ResponseBody
    public String addPic(Picture picture, MultipartFile myFile,HttpSession session) throws IOException {

        //String realPath=session.getServletContext().getRealPath("/upload");
        String realPath=session.getServletContext().getRealPath("").replace("cmfz#admin","upload");

        System.out.println("这是真实路径"+realPath);
        String fileName= UUID.randomUUID().toString().replace("-","");
        String oldName = myFile.getOriginalFilename();
        File dir = new File(realPath,oldName);
        if(!dir.exists()){
            dir.mkdirs();
        }
        myFile.transferTo(dir);
        Date date=new Date();
        picture.setPictureDate(date);
        picture.setPicturePath(oldName);
        picture.setPictureId(fileName);
        boolean a=pictureService.addPic(picture);
        if(a){
            return "success";
        }
        return "false";
    }

    @RequestMapping("/updatePic")
    @ResponseBody
    public String updatePic(String  pictureDescription,String pictureStatus,String pictureId) throws IOException {

        Picture picture = new Picture();
        picture.setPictureId(pictureId);
        picture.setPictureDescription(pictureDescription);
        picture.setPictureStatus(pictureStatus);
        boolean a=pictureService.modifyPic(picture);
        if(a){
            return "success";
        }
        return "false";
    }
}
