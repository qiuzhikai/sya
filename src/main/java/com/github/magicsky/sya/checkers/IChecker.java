package com.github.magicsky.sya.checkers;

import com.github.magicsky.sya.model.CheckResult;

import java.util.List;

/**
 * @author 
 */
public interface IChecker {

    /**
     * 检查
     */
    public List<CheckResult> check(Object obj);
}
