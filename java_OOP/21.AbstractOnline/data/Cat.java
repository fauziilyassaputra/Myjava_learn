package hollow.special.operation.data;

/*
- tanpa menambahkan abstract maka class bakal error
- jika kita ingin mengextend tanpa menjadikan class ini ikut mengabstrak, maka harus ditulis ulang

 */
public class Cat extends Animal {

    public void run(){
        System.out.println("Cat "+ name +" is  run!");
    }
}
