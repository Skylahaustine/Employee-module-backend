package com.hellostart.Springbootframework.error;

public class DepartmentNotFoundExemption extends Exception {
    public DepartmentNotFoundExemption() {
        super();
    }

    public DepartmentNotFoundExemption(String message) {
        super(message);
    }

    public DepartmentNotFoundExemption(String message, Throwable cause) {
        super(message, cause);
    }

    public DepartmentNotFoundExemption(Throwable cause) {
        super(cause);
    }

    protected DepartmentNotFoundExemption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
