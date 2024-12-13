package example01;

public class AccountRun {
    public static void main (String[] args) {
        CheckingAccount myAccount = new CheckingAccount();
        myAccount.withdrawMoney(1200.0);
        myAccount.checkBalance();
        myAccount.transferToAccount(500000.0, "0101", "0187446-9");
        myAccount.checkBalance();
        myAccount.cancelAccount("2001", "0107889-5");
    }
}
