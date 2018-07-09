package com.baizhi.cmfz.dao;

import com.baizhi.cmfz.entity.Article;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by fu on 2018/7/6.
 */
@Repository
public interface ArticleDao {
    public List<Article> selectArticle(@Param("begin") int begin, @Param("showSize") int showSize);
    public int countArticle();
    public boolean insertArticle(Article article);
    public boolean updateArticle(Article article);
    public boolean deleteArticle(Article article);
}
