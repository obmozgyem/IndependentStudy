package Java_OOP.Restore.impl;

import Java_OOP.Restore.AccountNotFoundByEmailHandler;

public final class DisplayAccountNotFoundByEmailHandler implements AccountNotFoundByEmailHandler {
    @Override
    public String handle(String email) {
        return "account_not_found.html?email" +email;
    }
}
