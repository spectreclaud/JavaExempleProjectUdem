package access.modifirs.dev;

import access.modifirs.qa.QaClass;

public class MyClass extends QaClass {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.myClassMethod();
    }

    public void myClassMethod() {
        myMethod();
    }
}
