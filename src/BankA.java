public class BankA extends Bank{
    private int Balance;

    public BankA(int balance) {
        Balance = balance;
    }

    @Override
    public void getBalance() {
        System.out.println("На вашем балансе: "+ Balance+ "$");
    }
}
