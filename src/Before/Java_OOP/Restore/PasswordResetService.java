package Before.Java_OOP.Restore;



public final class PasswordResetService {

    private final AccountRepository accountRepository;
    private final AccountNotFoundByEmailHandler accountNotFoundByEmailHandler;
    private final AccountNotActiveHandler accountNotActiveHandler;
    private final VarificationCodeGenerator varificationCodeGenerator;
    private final EmailService emailService;

    public PasswordResetService(AccountRepository accountRepository,
                                AccountNotFoundByEmailHandler accountNotFoundByEmailHandler,
                                AccountNotActiveHandler accountNotActiveHandler,
                                VarificationCodeGenerator varificationCodeGenerator,
                                EmailService emailService) {
        this.accountRepository = accountRepository;
        this.accountNotFoundByEmailHandler = accountNotFoundByEmailHandler;
        this.accountNotActiveHandler = accountNotActiveHandler;
        this.varificationCodeGenerator = varificationCodeGenerator;
        this.emailService = emailService;
    }

    public String reset(String email) {
        Account account = accountRepository.findByEmail(email);
        if (account == null) {
            return accountNotFoundByEmailHandler.handle(email);
        } else if (account.isNotActive()) {
            String result = accountNotActiveHandler.handler(account);
            if (result != null) {
                return result;
            }
        }
        String code = varificationCodeGenerator.generate();
        account.setCode(code);
        accountRepository.update(account);

        emailService.sendPasswordResetEmail(email, code);
        return "Password_reset_success.html";
    }


}
