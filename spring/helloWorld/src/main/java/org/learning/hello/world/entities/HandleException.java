package org.learning.hello.world.entities;

import org.springframework.http.HttpStatus;

public class HandleException {

    private HttpStatus status;
    private String message;
    private String resolution;
    private String exception;

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public String getException() {
        return exception;
    }

    private HandleException() {

    }

    public HandleException(HttpStatus status, String message, String resolution, String exception) {
        this.status = status;
        this.message = message;
        this.resolution = resolution;
        this.exception = exception;
    }

    public HandleException(HttpStatus status, String message, String resolution) {
        this.status = status;
        this.message = message;
        this.resolution = resolution;
    }

    public HandleException(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }
}
