 class ManagerApp {
     public static void main(String[] args) {

//         var manager = new Manager();
//         manager.name = "wise";
         var manager = new Manager("wise");
         manager.sayHello("ellen");
        
//         var vp = new VicePresident();
//         vp.name = "belle";
         var vp = new VicePresident("belle");
         vp.sayHello("jane");
     }
}

/*
 Super constructor:
 - kata kunci super juga bisa digunakan untuk mengakses constructor
 - namun untuk bisa mengakses parent class constructor, kita harus mengaksesnya di dalam  childconstructor
 - jika sebuah class parent tidak memiliki construcctor yang tidak ada parameternya(tidak memiliki default constructor), maka class child wajib mengakses constructor class parent tersebut

 */
