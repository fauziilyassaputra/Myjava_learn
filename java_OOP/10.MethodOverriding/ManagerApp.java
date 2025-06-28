 class ManagerApp {
     public static void main(String[] args) {

         var manager = new Manager();
         manager.name = "wise";
         manager.sayHello("ellen");

         var vp = new VicePresident();
         vp.name = "belle";
         vp.sayHello("jane");
     }
}

/*
 method overriding :
- method overriding adalah kemampuan mendeklarasikan ulang method di child class, yang sudah ada di parent class
- saat kita melakukan proses overriding tersebut, secara otomatis ketika kita membuat object dari class child,
method di class parent tidak bisa diakses lagi

 */
