public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person();
        person1.name = "hoshimi";
        person1.address = "HSO";
//        person1.country = "new eridu"; //error

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        //memanggil method sayHello
        person1.sayHello("shoukaku");

        // memanggil methos sayhello tanpa adanya name (akan mengaoutput null)
        Person person3;
        person3 = new Person();
        person3.sayHello("harumasa");



    }
}
