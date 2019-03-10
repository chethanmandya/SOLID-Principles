package com.chethan.solidprinciples.InterfaceSegregationPrinciple.BeforeISP;


public class HpPrinterClientClass implements PrintTasks {
    @Override
    public boolean printContent(String content) {
        System.out.println(" Print done ");
        return true;
    }

    @Override
    public boolean scanContent(String content) {
        System.out.println(" Scan done ");
        return true;
    }

    @Override
    public boolean faxContent(String content) {
        System.out.println(" Fax done ");
        return true;
    }

    @Override
    public boolean photoCopyContent(String content) {
        System.out.println(" PhotoCopy done ");
        return true;
    }
}
