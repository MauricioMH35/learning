package org.learning.hello.world.controllers;

import org.learning.hello.world.entities.HandleException;
import org.learning.hello.world.entities.Message;
import org.learning.hello.world.exceptions.ApplicationExceptionHandler;
import org.springframework.context.ApplicationContextException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

    @GetMapping
    public ResponseEntity helloWorld() {
        Message message = new Message("Hello World!");

        try {
            return new ResponseEntity(message, HttpStatus.OK);
        }
        catch(RuntimeException e) {
            ApplicationExceptionHandler handler = new ApplicationExceptionHandler();
            HandleException ex;

            if(message.equals(null)) {
                ex = new HandleException(
                        HttpStatus.NOT_FOUND,
                        "Não foi possivel localizar a mensagem!");

                return handler.handlerException(ex);
            }
            else {
                ex = new HandleException(
                        HttpStatus.BAD_REQUEST,
                        "Não foi possivel entregar a requisição!");
                return handler.handlerException(ex);
            }
        }
    }
}
