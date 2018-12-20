package com.sxdx.oa_service.response;

public enum ResponseCode {
    SUCCESS(200, "Success!"),
    UNAUTHORIZED(401, "Unauthorized!"),
    INVALID_VERIFY_CODE(9004, "验证码无效"),
    BAD_CREDENTIAL(90005, "用户名或密码错误");

    private int code;
    private String message;

    ResponseCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage(){
        return this.message;
    }

}
