package com.chethan.solidprinciples.InterfaceSegregationPrinciple.BeforeISP;


/**
 * Assume that CannonMG2470 doesn't support for fax operation.
 * In that scenario, having fax operation in the class doesn't make sense at all.
 * it is enforced to implement all the methods of Printer task interface. this is one of the major problem
 * that we encounter in day to today programming.
 *
 *
 */
public class CannonMG2470 implements PrintTasks {
    @Override
    public boolean printContent(String content) {
        return false;
    }

    @Override
    public boolean scanContent(String content) {
        return false;
    }

    @Override
    public boolean faxContent(String content) {
        return false;
    }

    @Override
    public boolean photoCopyContent(String content) {
        return false;
    }
}
