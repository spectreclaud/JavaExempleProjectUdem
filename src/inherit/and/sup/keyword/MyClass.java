package inherit.and.sup.keyword;

public class MyClass {

    public static void main(String[] args) {
        MySubClass mySubClass = new MySubClass("Constructor string from mySuperClass");
        mySubClass.superClassMethod();
        System.out.println(mySubClass.superStr);
        mySubClass.subClassMethod();
        mySubClass.printCommonString();
        mySubClass.printCommonMethod();
    }
}
