package gitpractice;

import java.sql.*;

public class InsertingDataDemo {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Testgitdb";
        String user = "root";
        String pass = "password";
        try{
            //1. Get a connection to database
            Connection myConn = DriverManager.getConnection(url, user, pass);

            //2. Create a statement
            Statement myStmt = myConn.createStatement();

            //3. Execute the SQL Query
            String sql = "insert into members"
                    + "(id, name, phone, email, status)"
                    + "values(2, 'Aarti Pathania', '4252958539', 'aarti2@hotmail.com', 'Sleepy')";

            myStmt.executeUpdate(sql);

            System.out.println("Insertion Complete");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
