package com.examples;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.testng.annotations.Test;

/**
 * Created by Harsha on 12/11/2016.
 */
public class log4jTest {


public static Logger log=Logger.getLogger(log4jTest.class.getName());

    @Test
    public static void test() {
log.setLevel(Level.WARN);






//        log.trace("Trace Message!");
        log.debug("Debug Message!");
        log.info("Info Message!");
        log.warn("Warn Message!");
        log.error("Error Message!");
        log.fatal("Fatal Message!");


    }




}
