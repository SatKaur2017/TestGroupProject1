package gitpractice;

import java.sql.*;


public class EmployeeDemo {

    public static void main(String[] args) {

        try{
            //1. Get a connection to database
            Connection myConn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Testgitdb", //change the database name
                    "root","password" // change the password
            );
            System.out.println("Connected to database");

            //2. Create a statement
            Statement myStmt = myConn.createStatement();

            //3. Execute SQL Query
            ResultSet myRs = myStmt.executeQuery("select * from members");

            //4. Process the Result Set
            while(myRs.next()){
                System.out.println(myRs.getString("id") + ", " +
                myRs.getString("name") + ", " +
                myRs.getString("phone")+ ", "+
                myRs.getString("email")+ ", "+
                myRs.getString("status")
                );
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
