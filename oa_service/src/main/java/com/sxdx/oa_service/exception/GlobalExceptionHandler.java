package com.sxdx.oa_service.exception;

import com.sxdx.oa_service.bootTest.exception.UserNotExistException;
import com.sxdx.oa_service.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    //1、客户端返回的都是json
    @ResponseBody
    @ExceptionHandler(UserNotExistException.class)
    public Response handleException(Exception e){
        logger.error(e.toString());
        return new Response(2001,e.getMessage());
    }
}
