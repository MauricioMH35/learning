package org.learning.hello.world.exceptions;

import org.learning.hello.world.entities.HandleException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {

    public ApplicationExceptionHandler() {

    }

    public ResponseEntity handlerException(HandleException handle) {
        return new ResponseEntity(handle, handle.getStatus());
    }

}
