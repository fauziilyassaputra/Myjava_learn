public class PersonApp {
    public static void main(String[] args) {

        // memanggil constructor overloading
        var person1 = new Person("Hoshimi", "HSO");
        System.out.println(person1.name);


        //memanggil method sayHello (yang shadowing)
        person1.sayHello("shoukaku");
        // output :  hello shoukaku my name is Hoshimi


    }
}

