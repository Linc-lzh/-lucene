package cn.itheima.service;

import cn.itheima.pojo.ResultModel;

/**
 *
 */
public interface SearchService {

    public ResultModel query(String queryString, String price, Integer page) throws Exception;
}
