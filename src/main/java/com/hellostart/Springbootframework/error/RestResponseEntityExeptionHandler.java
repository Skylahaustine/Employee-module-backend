package com.hellostart.Springbootframework.error;

import com.hellostart.Springbootframework.entity.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus

public class RestResponseEntityExeptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(DepartmentNotFoundExemption.class)
    public ResponseEntity<ErrorMessage> departmentNotFoundException(DepartmentNotFoundExemption exemption,
                                                                    WebRequest request){
        ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND,
                exemption.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(message);

    }


}
