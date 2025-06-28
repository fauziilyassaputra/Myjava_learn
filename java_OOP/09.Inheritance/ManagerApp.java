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
- Inheritance atau pewarisan adalah kemampuan untuk menurunkan sebuah class ke classlain
- dalam artian, kita bisa membuat class  parent dan class child
- Class child, hanya bisa punya satu class parent, namun satu class parent bisa punya banyak class chjld
- saat sebuah class diturunkan, maka semua field dan method yang ada di class parent, secara otomatis akan dimiliki oleh class child
- untuk melakukan pewarisan , di class child, kita harus menggunakan kata kunci extends lalu diikuti dengan nama class parentnya
 */
