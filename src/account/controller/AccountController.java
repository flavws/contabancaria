package account.controller;

import account.model.Account;
import account.repository.AccountRepository;

import java.util.ArrayList;

public class AccountController implements AccountRepository {

    private ArrayList<Account> accounts = new ArrayList<>();

    int number = 0;

    @Override
    public void findByNumber(int number) {

    }

    @Override
    public void findAll() {
        for (var account : accounts){
            account.view();
        }
    }

    @Override
    public void create(Account account) {
        accounts.add(account);
        System.out.println("\nA Conta número: " + account.getNumber() + " foi criada com sucesso!");
    }

    @Override
    public void update(Account account) {

    }

    @Override
    public void delete(int number) {

    }

    @Override
    public void withdraw(int numero, float valor) {

    }

    @Override
    public void deposit(int numero, float valor) {

    }

    @Override
    public void transfer(int numeroOrigem, int numeroDestino, float valor) {

    }

    public int generateNumber(){
        return ++ number;
    }
}
