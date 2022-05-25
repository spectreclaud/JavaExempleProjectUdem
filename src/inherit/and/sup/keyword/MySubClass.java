package inherit.and.sup.keyword;

public class MySubClass extends MySuperClass{

    String commonString = "Sub common string";
    public MySubClass(String constructorStr) {
        super(constructorStr);
        System.out.println("Sub class constructor");
    }

    public void subClassMethod() {
        System.out.println("Sub class method");
    }

    public void printCommonString() {
        System.out.println(commonString);
        System.out.println(super.commonString);
    }

    public void commonMethod() {
        System.out.println("Sub common method");
    }

    public void printCommonMethod() {
        commonMethod();
        super.commonMethod();
    }
}
