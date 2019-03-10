package com.chethan.solidprinciples.OpenClosed.BeforeRefactor;

/**
 * Below is the class which violate OCP
 *
 * So in the below method, what if you want to introduce another parsing type, let’s say you
 * have to introduce CSV parsing. How do you do it ? you will say you simple put one more check in the
 * if statement.
 *
 * What is the issue if you simple extend with another if statement.
 * There are things which you need to address. This will allow you to recompile entire classes. You are
 * changing something which is already exist that may take you to retest ever thing .
 * If you see something like this in any of your code, be aware.
 */
public class Parser {

    public Parser() {
    }

    public String parse(Object obj, String type) {

        if ("json".equals(type)) {
            return "Json serializable";
        } else if ("xml".equals(type)) {
            return "Xml convert";
        }
        return "invalid type convert";
    }
}


