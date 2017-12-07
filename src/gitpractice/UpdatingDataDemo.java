package gitpractice;

import java.sql.*;

public class UpdatingDataDemo {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Testgitdb";
        String user = "root";
        String pass = "abc123";

        try{
            //1. Get a connection to database
            Connection myConn = DriverManager.getConnection(url, user, pass);

            //2. Create a statement
            Statement myStmt = myConn.createStatement();

            //3. Execute the SQL Query
            String sql = "update members"
                    + " set email= 'aarti@gmail.com'"
                    + " where id=2";

            myStmt.executeUpdate(sql);
            System.out.println("Update complete");

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}


