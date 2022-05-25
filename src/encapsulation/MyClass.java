package encapsulation;

public class MyClass {

    public static void main(String[] args) {
        MyPrivateClass myPrivateClass = new MyPrivateClass();
        myPrivateClass.setStr("Updated my string");
        myPrivateClass.printString();
//        System.out.println(myPrivateClass.getStr());
    }
}
