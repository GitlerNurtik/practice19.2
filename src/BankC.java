public class BankC extends Bank{
    private int Balance;

    public BankC(int balance) {
        Balance = balance;
    }

    @Override
    public void getBalance() {
        System.out.println("На вашем балансе: "+ Balance+ "$");
    }
}
