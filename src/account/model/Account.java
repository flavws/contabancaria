package account.model;

import account.util.Colors;

public class Account {
    private int number;
    private int branch;
    private int type;
    private String holder;
    private float balance;

    public Account(int number, int branch, int type, String holder, float balance) {
        this.number = number;
        this.branch = branch;
        this.type = type;
        this.holder = holder;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBranch() {
        return branch;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public boolean withdraw(float value) {

        if(this.getBalance() < value) {
            System.out.println("\n Saldo Insuficiente!");
            return false;
        }

        this.setBalance(this.getBalance() - value);
        return true;
    }

    public void deposit(float value) {

        this.setBalance(this.getBalance() + value);

    }

    public void view() {

        String tipo = "";

        switch(this.type) {
            case 1:
                tipo = "Current account";
                break;
            case 2:
                tipo = "Deposit account";
                break;
        }

        System.out.println(Colors.TEXT_GREEN_BOLD + Colors.ANSI_BLACK_BACKGROUND+
                "\n\n***********************************************************");
        System.out.println("Dados da conta:");
        System.out.println("***********************************************************");
        System.out.println("Numero da conta: " + this.number);
        System.out.println("Agência: " + this.branch);
        System.out.println("Tipo da conta: " + tipo);
        System.out.println("Titular: " + this.holder);
        System.out.println("Saldo: " + this.balance);

    }
}
