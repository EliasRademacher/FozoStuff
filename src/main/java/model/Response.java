package model;

import java.util.List;

/**
 * Created by Elias on 12/3/2016.
 */
public class Response {

    private List<String> errors;

    private String message;

    private Object payload;

    public Response() {
    }

    public Response(List<String> errors) {
        this.errors = errors;
    }

    public Response(String message) {
        this.message = message;
    }

    public Response(String message, Object payload) {
        this.message = message;
        this.payload = payload;
    }

    public Response(List<String> errors, String message, Object payload) {
	this.errors = errors;
        this.message = message;
        this.payload = payload;
    }

   public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getPayload() {
        return payload;
    }

    public void setPayload(Object payload) {
        this.payload = payload;
    }

    public Boolean hasErrors() {
        return !errors.isEmpty();
    }
}
