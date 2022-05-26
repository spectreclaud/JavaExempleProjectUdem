package polymorphism.run.time.polimo;

public class MyClass {

    public static void main(String[] args) {
        Employee e = new FullTime();
        System.out.println("Full time employee salary is " + e.salary());

        FullTime f = new FullTime();
        f.myMethod();

        e = new Contractor();
        System.out.println("Contractor salary is " + e.salary());

        System.out.println(Employee.designation());
        System.out.println(FullTime.designation());
        System.out.println(Contractor.designation());
    }
}
