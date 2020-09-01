package stariq.accessmodifiers;

public class Main {

    public static void main(String[] args){

        Account annsAccount = new Account("Ann");
        annsAccount.deposit(1000);
        annsAccount.withdraw(500);
        annsAccount.withdraw(-200);
        annsAccount.deposit(-20);
        annsAccount.calculateBalance();

        System.out.println("Balance on account is " + annsAccount.getBalance());
    }
}
