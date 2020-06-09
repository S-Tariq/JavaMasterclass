package scope;

public class ScopeCheck {

    public int publicVar = 0;
    private int var1 = 1;

    public ScopeCheck(){
        System.out.println("ScopeCheck created, publicVar is " + publicVar + " and var1 is " + var1);
    }

    public int getVar1() {
        return var1;
    }

    public void timesTwo(){
        int var2 = 2;
        for(int i = 0; i < 10; i++){
            System.out.println(i + " x " + var2 + " = " + i * var2);
        }
    }

    public void useInner(){
        InnerClass innerClass = new InnerClass();
        System.out.println("Outer class scope for var3: " + innerClass.var3);
    }

    public class InnerClass {
        public int var3 = 3;

        public InnerClass() {
            System.out.println("InnerClass created, var1 is " + var1 + " and var3 is " + var3);
        }

        public void timesTwo(){
            System.out.println("Inner class scope for var1: " + var1);
            for(int i = 0; i < 10; i++){
                System.out.println(i + " x " + var3 + " = " + i * var3);
            }
        }
    }
}
