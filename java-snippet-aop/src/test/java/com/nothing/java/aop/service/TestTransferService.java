package com.nothing.java.aop.service;

import com.nothing.java.apo.service.TransferService;
import com.nothing.java.apo.service.impl.TransferServiceImpl;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * @author chenliu, create at 11/23/14 20:54
 */

public class TestTransferService {
    private static TransferService transferService;

    @BeforeClass
    public static void init() {
        transferService = new TransferServiceImpl();
    }

    @Test
    public void testTransfer() {
        String translatedText = transferService.transfer("I'm a test case");
        assertEquals("我是一个测试用例",translatedText);
    }
}
