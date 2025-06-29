package hollow.special.operation.data;

public class Category {

    private String id;
    private  boolean expensive;


    // buat fungsi Getter & Setternya

    public String getId() {
        return id;
    }

    public void setId(String id) {
        // memvalidasi id
        if(id != null){
            this.id = id;
        }

    }

    public boolean isExpensive() {
        return expensive;
    }

    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }
}

/*
Getter dan Setter
- di java, process encapsulation sudah dibuat standarisasinya, dimana kita bisa menggunakan getter dan setter method
- Getter adalah function yang dibuat untuk mengambil data field
- setter adalah function untuk mengubah data field
 */
