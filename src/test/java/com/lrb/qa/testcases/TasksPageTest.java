package com.lrb.qa.testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TasksPageTest {

    Logger log = Logger.getLogger(TasksPageTest.class);

    @BeforeMethod
    public void setUp() throws Exception {
        log.info("*** Starting test cases execution ***");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        log.info("*** Ending test cases execution ***");
    }

    @Test
    public void testTasksPage() throws Exception {
        log.info("In testTasksPage method");
    }

//    @Test
//    public void testTasksPageFail() throws Exception {
//        log.info("In testTasksPageFail method");
//        Assert.fail();
//    }

}