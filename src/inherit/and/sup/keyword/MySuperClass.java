package inherit.and.sup.keyword;

public class MySuperClass {
    String superStr = "super class string";
    String commonString = "Super common string";

    public MySuperClass(String constructorStr) {
        System.out.println("Super class constructor");
        System.out.println(constructorStr);
    }

    public void superClassMethod() {
        System.out.println("super class method");
    }

    public void commonMethod() {
        System.out.println("Super common method");
    }
}
