package hollow.special.operation.error;

// ini adalah error yang kita buat sendiri

public class ValidationException extends Throwable{
  
    public ValidationException(String message){
        super(message);
    }
}

/*
Exception :
- di java, error direpresentasikan dengan istilah exception, dan semua di representasikan dalam bentuk
class exception
- kita bisa menggunakan class exception sendiri, atau menggunakan yang sudah disediakan oleh java
- jika kita ingin membuat exception, maka kita harus membuat class ayng extends class throwable atau turanan-turunannya
 */
