package com.daxiao.designpattern.designpattern.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/11
 */
public class RuleConfigParserFactoryMap {

    private static Map<String, IRuleConfigParserFactory> cachedMap = new HashMap<>();

    static {
        cachedMap.put("json", new JsonRuleConfigParserFactory());
        cachedMap.put("xml", new XmlRuleConfigParserFactory());
        cachedMap.put("yaml", new YamlRuleConfigParserFactory());
        cachedMap.put("properties", new PropertiesRuleConfigParserFactory());
    }

    public static IRuleConfigParserFactory getRuleConfigParserFactory(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        return cachedMap.get(type);
    }
}
