package com.z.Test;

import com.z.Test_Log4j.dao.DemoLog4jDao;
import com.z.Test_Log4j.service.DemoLog4jService;
import org.junit.Test;

public class TestLog4j {


    @Test
    public void tts(){
        DemoLog4jDao demoLog4jDao = new DemoLog4jDao();
        demoLog4jDao.ttee();

        DemoLog4jService demoLog4jService = new DemoLog4jService();
        demoLog4jService.ttee();

    }
}
