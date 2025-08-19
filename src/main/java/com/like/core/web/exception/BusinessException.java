package com.like.core.web.exception;

public class BusinessException extends RuntimeException {
	
	private static final long serialVersionUID = -91603057290507859L;
	
	private ErrorCode errorCode;		
	
    public BusinessException(String message, ErrorCode errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getDefaultMessage());
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}
