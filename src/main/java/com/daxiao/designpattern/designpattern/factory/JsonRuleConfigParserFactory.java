package com.daxiao.designpattern.designpattern.factory;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/10
 */
public class JsonRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser create() {
        return new JsonIRuleConfigParser();
    }
}
