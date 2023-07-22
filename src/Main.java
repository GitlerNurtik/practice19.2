public class Main {
    public static void main(String[] args) {
    BankA bankA = new BankA(100);
    BankB bankB = new BankB(150);
    BankC bankC = new BankC(200);

    bankA.getBalance();
    bankB.getBalance();
    bankC.getBalance();
    }
}