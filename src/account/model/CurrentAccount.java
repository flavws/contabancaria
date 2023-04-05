package account.model;

public class CurrentAccount extends Account{
    private float limit;

    public CurrentAccount(int number, int branch, int type, String holder, float balance, float limit) {
        super(number, branch, type, holder, balance);
        this.limit = limit;
    }

    public float getLimit() {
        return limit;
    }

    public void setLimit(float limit) {
        this.limit = limit;
    }

    @Override
    public boolean withdraw(float value) {
        if(this.getBalance() + this.getLimit() < value) {
            System.out.println("\n Saldo Insuficiente!");
            return false;
        }

        this.setBalance(this.getBalance() - value);
        return true;
    }

    @Override
    public void view() {
        super.view();
        System.out.println("Limite de Crédito: " + this.limit);
    }
}
