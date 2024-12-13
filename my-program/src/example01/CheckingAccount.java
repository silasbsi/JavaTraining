package example01;

public class CheckingAccount {
    String accountNumber = "2001";
    String agencyNumber = "0107889-5";
    String clientName = "Michael";
    //String birthDate = "02/22/1988";
    Double accountBalance = 1000000.0;

    public void withdrawMoney(Double value) {
        System.out.println("You have withdrawn " + value + " dollars!");
        this.accountBalance -= value;
    }

    public void transferToAccount(Double value, String account, String agency) {
        System.out.println("You have transferred " + value + " dollars to the account below:");
        System.out.println("Account: " + account);
        System.out.println("Agency: " + agency);
        this.accountBalance -= value;
    }

    public void cancelAccount(String account, String agency) {
        if (account.equals(this.accountNumber) && agency.equals(this.agencyNumber)) {
            System.out.println("Current account canceled");
        } else {
            System.out.println("Unable to cancel your account");
        }
    }

    public void checkBalance() {
        System.out.println("===================================");
        System.out.println("Hi " + this.clientName + "!");
        System.out.println("Your balance is: " + this.accountBalance + " dollars.");
        System.out.println("===================================");
    }
}
