package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean success() {
        return success;
    }

    private boolean success;


    private message message;

    public com.example.consumingrest.data data() {
        return data;
    }

    private data data;

    public Quote() {
    }



    public message message() {
        return message;
    }

    public void setMessage(message message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "type='" + success + '\'' +
                ", value=" + message +
                '}';
    }
}
