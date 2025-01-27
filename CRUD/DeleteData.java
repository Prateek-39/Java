package CRUD;

import java.util.Scanner;
import java.sql.*;

public class DeleteData {

	public static void deleteData(Connection con) {
		

	        System.out.print("\t\t\tEnter Employee ID number : ");
	        Scanner sc = new Scanner(System.in);
	        int id = sc.nextInt();
	        String query = "DELETE  FROM user where id ='"+id+"' ";

	       
	        try{
	           
	            Statement stmt = con.createStatement();
	            int rows = stmt.executeUpdate(query);
	            if(rows==1) {
	                System.out.println("\t\t\t rows affected....");
	            }else {
	                System.out.println("\t\t\tPlease enter correct ID number.....!! ");
	                deleteData(con);
	            }
	            EmployeeManagement.menu();

	        }catch (Exception e){
	            e.printStackTrace();
	        }
	}

}
