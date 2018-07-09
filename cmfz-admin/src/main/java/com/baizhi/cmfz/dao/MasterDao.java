package com.baizhi.cmfz.dao;

import com.baizhi.cmfz.entity.Master;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by fu on 2018/7/7.
 */
@Repository
public interface MasterDao {
    public List<Master> selectMaster(@Param("begin") int begin, @Param("showSize") int showSize, @Param("sele") String sele, @Param("masterName") String masterName);
    public int countMaster(@Param("sele") String sele,@Param("masterName") String masterName);
    public boolean updateMaster(Master master);
    public boolean deleteMaster(Master master);
    public boolean insertMaster(Master master);

    public  List<Master> selectAll();


}
