package stariq.staticfinal;

public class ExtendedPassword extends Password{

    private int decryptedPassowrd;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassowrd = password;
    }

//    @Override
//    public void storePassword() {
//        System.out.println("Saving password as " + this.decryptedPassowrd);
//    }
}
