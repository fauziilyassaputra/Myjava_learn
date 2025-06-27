public class Person {
        //field
        String name;
        String address;
        final String country = "indonesia";

        //Constructor
        Person(String paramName, String paramAddress){
                name = paramName;
                address =  paramAddress;
        }

        //method
        void sayHello(String paramName){
                System.out.println("hello " + paramName + " my name is " + name);
        }

}

/*
- constructor adalah method yang akan dipanggil saat pertama kali object dibuat
- nama constructor harus sama dengan nama class, dan tidak membutuhkan kata kunci void atau return value
 */
