package com.z.Test_Log4j.dao;

import org.apache.log4j.Logger;

public class DemoLog4jDao {

//    引入log4j

    private static final Logger logger = Logger.getLogger(DemoLog4jDao.class);

    public void ttee(){
        logger.info("dao信息");
        logger.debug("dao信息");
        logger.warn("dao信息");
        logger.error("dao信息");
        logger.fatal("dao信息");
    }
}
