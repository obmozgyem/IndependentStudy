package Before.Java_OOP.Restore.impl;

import Before.Java_OOP.Restore.Account;

public class DefualtAccount implements Account {

    private final String email;
    private final boolean active;
    private String code;

    public DefualtAccount(String email, boolean active) {
        this.email = email;
        this.active = active;
    }

    @Override
    public boolean isNotActive() {
        return !active;
    }

    @Override
    public void setCode(String code) {
        this.code = code;
    }

    public String getEmail() {
        return email;
    }
}
