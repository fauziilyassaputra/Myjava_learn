public class Employee {
    String name;
    Employee(String name){
        this.name = name;
    }

    void sayHello(String name){
        System.out.println("hi " + name + " my name is employee " + this.name);
    }
}
