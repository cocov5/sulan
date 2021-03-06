package com.yilanjiaju.sulan.common.aop;

import com.yilanjiaju.sulan.common.base.ResponseVO;
import com.yilanjiaju.sulan.common.utils.ResponseUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ControllerAdviceHandler {

    @ExceptionHandler(value =Exception.class)
    @ResponseBody
    public ResponseVO exceptionHandler(Exception e){
        System.out.println("异常原因是:" + e);
        return ResponseUtil.errorRun();
    }
}
