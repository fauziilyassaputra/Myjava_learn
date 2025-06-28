public class PolymorphismApp {
    public static void main(String[] args) {

        Employee employee = new Employee("rina");
        employee.sayHello("corin");
        // output : hi corin my name is employee rina

        employee = new Manager("rina");
        employee.sayHello("corin");
        // output : hi corin my name is manager rina

        employee = new VicePresident("rina");
        employee.sayHello("corin");
        // output :  hi corin my name is VP rina

        sayHello(new Employee("ellen"));
        sayHello(new Manager("von lycaon"));
        sayHello(new VicePresident("rina"));

    }

    //Polimorfisme method

    static void sayHello(Employee employee){
        System.out.println("hello " + employee.name);
    }

}

/*
Polymorfisme :
- polymorfisme berasal dari bahasa yunani yang berarti banyak bentuk
- dalam OOP, polymorfisme adalah kemampuan sebuah object berubah bentuk menjadi bentuk lain
- polymorfisme erat hubungannya dengan inheritence
 */
