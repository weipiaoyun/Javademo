package com.example.consumingrest;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class message {

    private Long code;

    public void setCode(Long code) {
        this.code = code;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private String content;

    public message() {
    }

    public Long code() {
        return this.code;
    }

    public String content() {
        return this.content;
    }



    @Override
    public String toString() {
        return "Value{" +
                "id=" + code +
                ", content='" + content + '\'' +
                '}';
    }
}
