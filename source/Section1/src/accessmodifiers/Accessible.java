package accessmodifiers;
// Challenge given:
// In the following interface declaration, what is the visibility of:
//
// 1. the Accessible interface?
//    package-private
// 2. the int variable SOME_CONSTANT?
//    public
// 3. methodA()?
//    public
// 4. methodB() and methodC()?
//    public

interface Accessible {

    int SOME_CONSTANT = 100;
    public void methodA();
    void methodB();
    boolean methodC();

}
