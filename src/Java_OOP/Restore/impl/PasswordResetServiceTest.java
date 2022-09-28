package Java_OOP.Restore.impl;

import Java_OOP.Restore.PasswordResetService;

final class PasswordResetServiceTest {

    private final PasswordResetService service;

    public PasswordResetServiceTest(PasswordResetService service) {
        this.service = service;
    }

    public void test(String email) {
        System.out.println(email + " -> " + service.reset(email));
    }

    public static void main(String[] args) {
        PasswordResetServiceTest passwordResetServiceTest = new PasswordResetServiceTest(new PasswordResetService(
                new FromRamAccountRepository(),
                new DisplayAccountNotFoundByEmailHandler(),
                new DisableAccountNotActiveHandler(),
                new DefultNumberVarificationCodeGenerator(6),
                new StubEmailService()
        ));
        passwordResetServiceTest.test("test0@devonline.academy");
        passwordResetServiceTest.test("test1@devonline.academy");
        passwordResetServiceTest.test("test2@devonline.academy");
    }
}
