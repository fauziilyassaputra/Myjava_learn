public class VicePresident extends Manager{

    //super constructor
//    VicePresident(){
//
//    }
    VicePresident(String name){
         super(name);
    }

    void sayHello(String name){
        System.out.println("hi " + name + " my name is VP " + this.name);
    }
}
