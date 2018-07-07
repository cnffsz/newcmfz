package com.baizhi.cmfz.service;


import com.baizhi.cmfz.entity.Picture;



import java.util.Map;

/**
 * Created by fu on 2018/7/5.
 */
public interface PictureService {

    public Map<String,Object> queryAllPic(int totalSize, int pageIndex);
    public boolean addPic(Picture picture);
    public boolean modifyPic(Picture picture);
    public boolean removePic(Picture picture);
}
