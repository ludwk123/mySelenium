package com.lrb.qa.testcases;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ContactsPageTest {

    Logger log = Logger.getLogger(ContactsPageTest.class);

    @BeforeMethod
    public void setUp() throws Exception {
        log.info("*** Starting test cases execution ***");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        log.info("*** Ending test cases execution ***");
    }

    @Test
    public void testContactsPage() throws Exception {
        log.info("In testContactsPage method");
    }

}