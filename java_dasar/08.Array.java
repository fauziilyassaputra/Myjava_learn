public class Array {
    public static void main(String[] args) {

        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "hoshimi";
        stringArray[1] = "miyabi";
        stringArray[2] = "family";

        // mengambil arraynya
        System.out.println(stringArray[0]);
        System.out.println(stringArray[2]);

        //Array initializer
        String[] namaMember = {
                "miyabi", "harumasa","shoukaku"
        };

        int[] arrayInt = new int[]{
                1,2,3,4,5
        };

        //mengubah data array
        namaMember[2] = "harumasa"; //menggantikan shoukaku
        System.out.println(namaMember[2]);

        //menghitung panjang array
        System.out.println(namaMember.length);  // output

        // array didalam array
        String[][] pubsecc = {
                {"zhuyuan", "qingyi"},
                {"seth", "jane doe"}
        };
        System.out.println(pubsecc[0][0]);
        System.out.println(pubsecc[0][1]);


    }
}

/*
tidak ada pengapusan di dalam array, ganti valuenya dengan 0 atau null.



 */
