package account.controller;

import account.model.Account;
import account.repository.AccountRepository;

import java.util.ArrayList;

public class AccountController implements AccountRepository {

    private ArrayList<Account> accounts = new ArrayList<>();

    int number = 0;

    @Override
    public void findByNumber(int number) {

        var account = findInCollection(number);
        if (account != null){
            account.view();
        } else {
            System.out.println("\nA conta número: " + number + " não foi encontrada!");
        }
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
        var findAccount = findInCollection(account.getNumber());

        if (findAccount != null ){
            accounts.set(accounts.indexOf(findAccount), account);
            System.out.println("\nA conta número: " + account.getNumber() + " foi atualizada com sucesso!");
        } else {
            System.out.println("\nA conta número: " + account.getNumber() + " não foi encontrada!");
        }
    }

    @Override
    public void delete(int number) {
        var account = findInCollection(number);

        if (account != null){
            if (accounts.remove(account) == true)
                System.out.println("\nA conta número: " + number + " foi deletada com sucesso!");
        } else {
            System.out.println("\nA conta número: " + number + " não foi encontrada!");
        }
    }

    @Override
    public void withdraw(int number, float value) {
        var account = findInCollection(number);

        if (account != null){
            if (account.withdraw(value) == true){
                System.out.println("\nO saque na conta número: " + number + " foi efetuado com sucesso!");
            }
        } else {
            System.out.println("\nA conta número: " + number + " não foi encontrada!");
        }
    }

    @Override
    public void deposit(int number, float value) {
        var account = findInCollection(number);

        if (account != null){
            account.deposit(value);
            System.out.println("\nO depósito na conta numero: " + number + " foi efetuado com sucesso!");
        } else {
            System.out.println("\nA conta número: " + number + " não foi encontrada ou a conta destino não é uma conta corrente!");
        }
    }

    @Override
    public void transfer(int originNumber, int destinationNumber, float value) {
        var originAccount = findInCollection(originNumber);
        var destinationAccount = findInCollection(destinationNumber);

        if (originAccount != null && destinationAccount != null){
            if (originAccount.withdraw(value) == true){
                destinationAccount.deposit(value);
                System.out.println("\nA transferência foi efetuada com sucesso!");
            }
        } else {
            System.out.println("\nA conta de origem e/ou destino não foram encontradas!");
        }
    }

    public int generateNumber(){
        return ++ number;
    }

    public Account findInCollection(int number){
        for (var account : accounts){
            if (account.getNumber() == number){
                return account;
            }
        }
        return null;
    }

    public int returnType(int number){
        for (var account : accounts){
            if (account.getNumber() == number){
                return account.getType();
            }
        }

        return 0;
    }

}
