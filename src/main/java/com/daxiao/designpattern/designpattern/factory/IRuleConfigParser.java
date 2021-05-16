package com.daxiao.designpattern.designpattern.factory;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/10
 */
public interface IRuleConfigParser {
    RuleConfig parse(String filePath);
}
