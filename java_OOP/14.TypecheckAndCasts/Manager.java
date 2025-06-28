 class Manager extends Employee{

    String company;

     Manager(String name){
         super(name);
     }



    void sayHello(String name){
        System.out.println("hi " + name + " my name is manager " + this.name);
    }
}
