package com.z.Test_Log4j.service;

import org.apache.log4j.Logger;

public class DemoLog4jService {

    private static final Logger logger = Logger.getLogger(DemoLog4jService.class);

    public void ttee(){
        logger.info("Service信息");
        logger.debug("Service信息");
        logger.warn("Service信息");
        logger.error("Service信息");
        logger.fatal("Service信息");
    }
}
