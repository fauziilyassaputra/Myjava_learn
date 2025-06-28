public class ParentAdd {
    public static void main(String[] args) {

        Child child = new Child();
        child.name = "hoshimi";
        child.doIt();
        System.out.println(child.name);

        Parent parent = (Parent) child;
        parent.doIt(); // doIt parent yang akan dipanggil (overriding)
        System.out.println(parent.name); // null, karena variable name pada parent itu kosong.

    }
}
