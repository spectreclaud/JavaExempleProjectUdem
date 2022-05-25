package encapsulation;

public class MyPrivateClass {
    private static String str = "My string";

    private String getStr() {
        return str;
    }

    public void setStr(String str) {
        MyPrivateClass.str = str;
    }

    public void printString() {
        System.out.println(str);
    }

    private void myMethod() {
        System.out.println("My method");
    }
}
