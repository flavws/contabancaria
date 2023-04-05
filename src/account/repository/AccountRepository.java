package account.repository;

import account.model.Account;

public interface AccountRepository {

    public void findByNumber(int number);
    public void findAll();
    public void create(Account account);
    public void update(Account account);
    public void delete(int number);

    public void withdraw(int numero, float valor);
    public void deposit(int numero, float valor);
    public void transfer(int numeroOrigem, int numeroDestino, float valor);
}
