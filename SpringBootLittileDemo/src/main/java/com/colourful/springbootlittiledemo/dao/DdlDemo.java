package com.colourful.springbootlittiledemo.dao;

import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @Description
 * @Version
 * @Date 7/17/2020
 * @Author Gon
 */
public interface DdlDemo
{
    Boolean ddlIsServiceCshuTableExist(@Param("tableName") String tableName);

    void createNewTableByName(@Param("dbName")String dbName, @Param("tableName") String tableName);

    Map getInfoTest(@Param ("id") String id);

    Boolean add();
}
