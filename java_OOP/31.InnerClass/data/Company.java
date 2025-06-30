package hollow.special.operation.data;

public class Company {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class Employee {
        private String name;

        //mengambil field  name di company tanpa harus membuat ulang dan bisa mengambil field privatenya
        public String getCompany(){
            return Company.this.name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

/*
Inner Class :
- dijava, kita bisa membuat class di dalam class, atau disebut sebagai inner class
- salah satu kasus kita membuat innerclass biasanya ketika kita butuh membuat beberapa class yang saling berhubungan, dimana sebuah class tidak bisa dibuat tanpa class lain
- misal kita perlu membuat class employee, dimana membutuhkan class company, maka kita bisa membuat class employee sebagai innerclass company
- cara membuat innerclass, cukup membuatnya di dalam block class outer classnya
 */
