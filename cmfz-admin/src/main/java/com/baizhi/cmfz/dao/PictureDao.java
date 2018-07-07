package com.baizhi.cmfz.dao;

import com.baizhi.cmfz.entity.Picture;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wu on 2018/7/5.
 */
@Repository
public interface PictureDao {

    public List<Picture> selectAllPic(@Param("begin") int begin, @Param("showSize") int showSize);
    public int countPic();
    public boolean updatePic(Picture picture);
    public boolean insertPic(Picture picture);
    public boolean deletePic(Picture picture);
}
