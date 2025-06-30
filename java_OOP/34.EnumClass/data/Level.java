package hollow.special.operation.data;

public enum Level {

    // kebiasannya menggunakan huruf besar
    STANDARD("standard level"),
    PREMIUM("premium level"),
    VIP("VIP level");

    private String description;

    //membuat constructor dengan enum (dilarang set ke publik)
    Level(String getDescription){
        this.description = getDescription;
    }
    public String getDescription(){
        return description;
    }

}

/*
Enum Class:
- saat kita membuat aplikasi, kadang kita akan bertemu dengan jenis-jenis data yang nilainya terbatas
- misal, gender, ada male dan female, atau tipe customer, ada standar, premium atau vip, dan lain-lain
- dalam kasus seperti ini, kita bisa menggunakan enum class, yaitu class yang berisikan nilai terbatas yang susah ditentukan
- saat membuat enum class, secara otomatis dia akan meng-extend class java.len.Enum, oleh karena itu class enum tidak bisa extends class lain, namun masih tetap  bisa implement interface
 */
