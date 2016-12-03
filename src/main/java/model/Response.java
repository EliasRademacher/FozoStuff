package model;

import java.util.List;

/**
 * Created by Elias on 12/3/2016.
 */
public class Response {

    private List<String> errors;

    private String message;

    private Object payload;


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
