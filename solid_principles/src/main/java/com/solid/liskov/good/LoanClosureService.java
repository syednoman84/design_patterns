package com.solid.liskov.good;

/**
 * This is good we are bothered to provide secure loan type
 * so this will behave perfectly fine even if we substitute between parent
 * and child.
 */
public class LoanClosureService {
    private SecureLoan secureLoan;

    public LoanClosureService(SecureLoan secureLoan) {
        this.secureLoan = secureLoan;
    }

    // this is a custom business logic whatever we want to do before calling the foreCloseLoan() method
    public void foreCloseLoan() {
        secureLoan.foreCloseLoan();
    }
}