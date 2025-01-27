package CRUD;


import java.util.Scanner;
import java.sql.*;

public class CreateData {

	public static void createData(Connection con) {
	
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t*Please Remember 'Your ID' number for further Updatation.....");
        System.out.print("\t\t\tEnter employee ID number : ");
        int id = sc.nextInt();
        System.out.print("\t\t\tEnter employee name : ");
        String name = sc.next();
        System.out.print("\t\t\tEnter employee department : ");
        String department = sc.next();
        System.out.print("\t\t\tEnter employee Location : ");
        String location = sc.next();


        String query="INSERT INTO user (id, name, department, location) values ('"+id+"','"+name+"','"+department+"','"+location+"')";

        try{
            
            Statement stmt = con.createStatement();
            int rows = stmt.executeUpdate(query);
            if(rows==1) {
                System.out.println("\t\t\t rows affected....");
            }else {
                System.out.println("\t\t\tSomething is Wrong.....!! ");
            }
            EmployeeManagement.menu();


        }catch (Exception e){
            e.printStackTrace();

        }

	}

}
