package Before.Java_OOP.Restore;

public interface AccountRepository {

    Account findByEmail(String email);

    void update(Account account);
}
