public class Person {
        //field
        String name;
        String address;
        final String country = "indonesia";

        //Constructor overloading
        Person(String paramName, String paramAddress){
                name = paramName;
                address =  paramAddress;
        }

//        Person(String paramname){
//                name = paramname;
//        }
        // dari pada membuat constructor yang sama dengan kodingannya, lebih baik kita memanggil constructor sebelumnya
        Person(String paramName){
                this(paramName, null);
        }


//        Person(){
//
//        }
        Person(){
                this(null);
        }

        //method
        void sayHello(String paramName){
                System.out.println("hello " + paramName + " my name is " + name);
        }

}

