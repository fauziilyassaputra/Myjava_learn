package hollow.special.operation.app;

import hollow.special.operation.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("hoshimi","...");
        System.out.println("suksess");
    }

    //kita membuat method connectDatabasenya
    public static void connectDatabase(String username, String password){
        if (username == null || password == null){
            throw new DatabaseError("tidak bisa connet ke database");
        }
    }
}
