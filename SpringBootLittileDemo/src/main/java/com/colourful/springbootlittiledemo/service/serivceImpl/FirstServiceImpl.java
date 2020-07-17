package com.colourful.springbootlittiledemo.service.serivceImpl;

import com.colourful.springbootlittiledemo.dao.DdlDemo;
import com.colourful.springbootlittiledemo.service.FirstSerivce;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Version
 * @Date 7/17/2020
 * @Author Gon
 */

@Slf4j
@Service
public class FirstServiceImpl implements FirstSerivce
{
    @Autowired
    DdlDemo ddlDemo;

    //mybatisDDL
    @Override
    public void DdlDemo()
    {
        log.info(String.valueOf(ddlDemo.getInfoTest("1")));
        Boolean bola = ddlDemo.ddlIsServiceCshuTableExist("gonglige");
        log.info(String.valueOf(bola));
        ddlDemo.createNewTableByName("music","gonglige");
        log.info(String.valueOf(ddlDemo.ddlIsServiceCshuTableExist("gonglige")));
    }
}
