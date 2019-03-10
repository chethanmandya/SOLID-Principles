package com.chethan.solidprinciples.InterfaceSegregationPrinciple.BeforeISP;

/**
 * Any new operation introduce in print task interface makes
 * all the client to implement newly added method.
 */
public interface PrintTasks {

    boolean printContent(String content);

    boolean scanContent(String content);

    boolean faxContent(String content);

    boolean photoCopyContent(String content);

    boolean printDuplexContent(String content);
}
