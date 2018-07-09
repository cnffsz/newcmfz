package com.baizhi.cmfz.service;

import com.baizhi.cmfz.entity.Article;
import com.baizhi.cmfz.entity.Master;


import java.util.Map;

/**
 * Created by fu on 2018/7/8.
 */
public interface ArticleService {
    public Map<String,Object> queryArticle(int totalSize, int pageIndex);
    public boolean addArticle(Article article);
    public boolean modifyArticle(Article article);

}
