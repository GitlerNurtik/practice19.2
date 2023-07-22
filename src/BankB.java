public class BankB extends Bank{
    private int Balance;

    public BankB(int balance) {
        Balance = balance;
    }

    @Override
    public void getBalance() {
        System.out.println("На вашем балансе: "+ Balance+ "$");
    }
}
