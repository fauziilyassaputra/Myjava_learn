public class VicePresident extends Manager{


    VicePresident(String name){
         super(name);
    }

    VicePresident(String name, String company){
        super(name);
        this.company = company;
    }

    void sayHello(String name){
        System.out.println("hi " + name + " my name is VP " + this.name);
    }
}
