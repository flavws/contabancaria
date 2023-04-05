package account.model;

public class DepositAccount extends Account{

    private int birthday;

    public DepositAccount(int number, int branch, int type, String holder, float balance, int birthday) {
        super(number, branch, type, holder, balance);
        this.birthday = birthday;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    @Override
    public void view() {
        super.view();
        System.out.println("Aniversário da conta: " + this.birthday);
    }
}
