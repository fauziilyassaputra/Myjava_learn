package hollow.special.operation.error;

public class BlankException extends RuntimeException {
    public BlankException(String message) {
        super(message);
    }
}


/*
jenis exception :
- Checked exception, yaitu yang wajib menggunakan try dan catch
- Runtime exception
- Error (yang akan dibahas di materi selanjutnya

Runtime exception :
- exception tidak wajib di tangkap oleh try catch
- untuk  membuat class time exception, kita wajib mengextends class RuntimeException
- ada banyak di java yang merupakan runtime  exception, seperti NullpointerException, illegalArgumenException, dan lain-lain

 */
