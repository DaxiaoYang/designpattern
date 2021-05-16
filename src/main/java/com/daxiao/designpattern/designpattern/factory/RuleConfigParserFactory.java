package com.daxiao.designpattern.designpattern.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/10
 * 简单工厂（静态方法）
 */
public class RuleConfigParserFactory {

    private static Map<String, IRuleConfigParser> singletonMap = new HashMap<>();

    static {
        singletonMap.put("json", new JsonIRuleConfigParser());
        singletonMap.put("xml", new XmlIRuleConfigParser());
        singletonMap.put("yaml", new YamlIRuleConfigParser());
        singletonMap.put("properties", new PropertiesIRuleConfigParser());
    }

    /**
     * 每次都创建新的对象
     * @param fileExtension
     * @return
     */
    public static IRuleConfigParser create(String fileExtension) {
        IRuleConfigParser parser = null;
        if ("json".equals(fileExtension)) {
            parser = new JsonIRuleConfigParser();
        } else if ("xml".equals(fileExtension)) {
            parser = new XmlIRuleConfigParser();
        } else if ("yaml".equals(fileExtension)) {
            parser = new YamlIRuleConfigParser();
        } else if ("properties".equals(fileExtension)) {
            parser = new PropertiesIRuleConfigParser();
        } else {
            throw new RuntimeException("invalid fileExtension!");
        }
        return parser;
    }

    /**
     * 返回单例
     * @param fileExtension
     * @return
     */
    public static IRuleConfigParser getSingleton(String fileExtension) {
        return singletonMap.get(fileExtension);
    }
}
