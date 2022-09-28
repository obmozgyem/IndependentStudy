package Java_OOP.Restore.impl;

import Java_OOP.Restore.Account;
import Java_OOP.Restore.AccountRepository;

public final class FromRamAccountRepository implements AccountRepository {

    private final DefualtAccount[] accounts= {
            new DefualtAccount("test1@devonline.academy",true),
            new DefualtAccount("test2@devonline.academy",false)
    };
    @Override
    public Account findByEmail(String email) {
        for (DefualtAccount account : accounts) {
            if (email.equals(account.getEmail())) {
                return account;
            }

        }
        return null;
    }

    @Override
    public void update(Account account) {
    // do nothing
    }
}
