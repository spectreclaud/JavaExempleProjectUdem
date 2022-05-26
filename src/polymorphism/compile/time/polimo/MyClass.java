package polymorphism.compile.time.polimo;

public class MyClass {

    public static void main(String[] args) {
        MyOverloadingClass myOverloadingClass = new MyOverloadingClass();
        myOverloadingClass.myMethod(5);
        myOverloadingClass.myMethod("my string");
        myOverloadingClass.myMethod("my string1", 9);
    }
}
