package com.daxiao.designpattern.designpattern.factory;

import org.springframework.util.StringUtils;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/10
 */

public class RuleConfigSource {

    public static RuleConfig getRuleConfig(String filePath) {
        String fileExtension = getFileExtension(filePath);
//        RuleConfigParser parser = RuleConfigParserFactory.create(fileExtension);
//        IRuleConfigParser parser = RuleConfigParserFactory.getSingleton(fileExtension);
        IRuleConfigParserFactory ruleConfigParserFactory = RuleConfigParserFactoryMap.getRuleConfigParserFactory(fileExtension);
        IRuleConfigParser parser = ruleConfigParserFactory.create();
        return parser.parse(filePath);
    }

    private static String getFileExtension(String filePath) {
        if (StringUtils.isEmpty(filePath)) {
            throw new RuntimeException("file path cannot be empty");
        }
        return filePath.substring(filePath.lastIndexOf(".") + 1);
    }
}



