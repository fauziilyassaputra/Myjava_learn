package hollow.special.operation.error;

public class DatabaseError extends Error {
    public DatabaseError(String message) {
        super(message);
    }
}

/*
Error :
- error adalah exception yang terakhir
- error adalah sebuah class di java, yang tidak direkomendasikan untuk try-catch
- biasanya error terjadi ketika ada masalah serius dan tidak direkomendasikan untuk try catch
- artinya direkomendasikan untuk mematikan aplikasi
- contoh. misalnya jika diawal aplikasi kita tidak bisa terkoneksi database. direkomendasikan untuk membuat exception jenis error,
dan menghentikan aplikasi
 */
