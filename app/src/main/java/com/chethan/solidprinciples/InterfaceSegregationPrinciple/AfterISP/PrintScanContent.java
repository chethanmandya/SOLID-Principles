package com.chethan.solidprinciples.InterfaceSegregationPrinciple.AfterISP;

public interface PrintScanContent {

    boolean printContent(String content);

    boolean scanContent(String content);

    boolean photoCopyContent(String content);
}
