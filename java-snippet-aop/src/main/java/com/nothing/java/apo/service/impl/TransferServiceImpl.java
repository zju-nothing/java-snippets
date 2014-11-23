package com.nothing.java.apo.service.impl;

import com.memetix.mst.language.Language;
import com.memetix.mst.translate.Translate;
import com.nothing.java.apo.service.TransferService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author chenliu, create at 11/22/14 22:23
 */
public class TransferServiceImpl implements TransferService {
    private static final Logger logger = LoggerFactory.getLogger(TransferServiceImpl.class);
    public String transfer(String input) {
        logger.info("Start translating...");
        // Set your Windows Azure Marketplace client info - See http://msdn.microsoft.com/en-us/library/hh454950.aspx
        Translate.setClientId("d704f4c0-3308-42e5-9032-e7d0eaedf3c6");
        Translate.setClientSecret("VZBWvBQCvG4y6zBgcEHOj/vmXYH88Jog6pNbp7vJkl4");
        String translatedText = null;
        try {
            translatedText = Translate.execute(input, Language.ENGLISH, Language.CHINESE_SIMPLIFIED);
        } catch (Exception e) {
            logger.error(e.toString());
        }
        logger.info("End translate.");
        return translatedText;
    }

}
