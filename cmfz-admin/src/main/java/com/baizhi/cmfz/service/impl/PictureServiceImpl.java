package com.baizhi.cmfz.service.impl;
import com.baizhi.cmfz.dao.PictureDao;
import com.baizhi.cmfz.entity.Picture;
import com.baizhi.cmfz.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

/**
 * Created by fu on 2018/7/5.
 */
@Service
@Transactional
public class PictureServiceImpl implements PictureService{

    @Autowired
    private PictureDao pictureDao;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public Map<String,Object> queryAllPic(int totalSize, int pageIndex) {
        List<Picture> pictures = pictureDao.selectAllPic((pageIndex - 1) * totalSize, totalSize);
        int i = pictureDao.countPic();
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("total",i);
        map.put("rows",pictures);
        return map;
    }



    @Override
    public boolean addPic(Picture picture) {
        boolean a=pictureDao.insertPic(picture);
        return a;
    }

    @Override
    public boolean modifyPic(Picture picture) {

            boolean a=pictureDao.updatePic(picture);
            return a;

    }

    @Override
    public boolean removePic(Picture picture) {
        return false;
    }
}
