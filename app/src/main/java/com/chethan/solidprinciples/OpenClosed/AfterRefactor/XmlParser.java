package com.chethan.solidprinciples.OpenClosed.AfterRefactor;

public class XmlParser implements Parser {
    @Override
    public String Parse(Object object) {
        return "Xml parser is called";
    }
}
