package nabil.spring.core;

public class Database {
    private static Database databse;

    public static Database getInstance() {
        if (databse == null) {
            databse = new Database();
        }
        return databse;
    }


    private Database(){

    }
}
