package dbconnexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db_cnx {

    private static Connection connecter = null;
    private static String url;
    private static String driver;
    private static String user;
    private static String password;
    public static int identifier;
    public static String username;

    public static void connecter() {
        url = "jdbc:mysql://localhost:3306/locations";
        driver = "com.mysql.jdbc.Driver";
        user = "root";
        password = "";
        try {
            Class.forName(driver);

        } catch (ClassNotFoundException e) {
            System.out.println("erreur driver");
            System.out.println(e.getMessage());
        }

        try {
            connecter = DriverManager.getConnection(url, user, password);

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    static public void deconnecter() {
        try {
            connecter.close();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static Connection connect() {
        if (connecter == null) {
            connecter();
        }
        return connecter;
    }

}
