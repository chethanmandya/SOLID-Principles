package com.chethan.solidprinciples.OpenClosed.AfterRefactor;


public class JsonParser implements Parser {

    @Override
    public String Parse(Object object) {
        return "Json Parser is called";
    }
}
