public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Hoshimi", "HSO");

//        person1.country = "new eridu"; //error

        //memanggil method sayHello
        person1.sayHello("shoukaku");

        // memanggil methos sayhello tanpa adanya name (akan mengaoutput null)
        Person person3;
        person3 = new Person("yanagi", "HSO");
        person3.sayHello("harumasa");



    }
}
