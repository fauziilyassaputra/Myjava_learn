 class Manager {

    String name;
    String company;

//    Manager(){
//
//    }

    Manager(String name){
        this.name = name;
    }

    void sayHello(String name){
        System.out.println("hi " + name + " my name is manager " + this.name);
    }
}
