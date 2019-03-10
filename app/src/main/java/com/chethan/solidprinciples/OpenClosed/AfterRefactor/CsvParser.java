package com.chethan.solidprinciples.OpenClosed.AfterRefactor;

public class CsvParser implements Parser {

    @Override
    public String Parse(Object object) {
        return "Csv parser is called";
    }

}
