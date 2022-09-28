package Java_OOP.Restore.impl;

import Java_OOP.Restore.EmailService;

public final class StubEmailService implements EmailService {

    @Override
    public void sendPasswordResetEmail(String email, String code) {
        System.out.println("Send code=" +code+ " to "+email+" email");
    }
}
