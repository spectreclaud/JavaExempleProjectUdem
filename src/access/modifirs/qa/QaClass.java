package access.modifirs.qa;

public class QaClass {
    protected String str = "";

    protected void myMethod() {
        System.out.println("Qa class myMethod");
    }

    private void myMethod1() {
        myMethod();
        System.out.println(str);
    }
}
