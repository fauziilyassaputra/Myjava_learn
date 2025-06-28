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


    static void sayHello(Employee employee){
        if (employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("hello VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("hello manager " + manager.name);
        } else {
            System.out.println("hello " + employee.name);
        }
    }

}

