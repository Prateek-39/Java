package CRUD;

import java.sql.*;
import java.util.Scanner;

public class UpdateData {

	public static void updateData(Connection con) {
		
		 
	        String query = null;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("\t\t\t1 - ID no. Updates");
	        System.out.println("\t\t\t2 - Name Updates");
	        System.out.println("\t\t\t3 - Location Updates");
	        System.out.println("\t\t\t4 - Department Updates");
	        System.out.print("\t\t Choose Option to Updates data -->> ");
	        int opt = sc.nextInt();
	        if(opt==1){
	            System.out.print("\n\t\t\tEnter name of Employee : ");
	            String name = sc.next();
	            System.out.print("\t\t\tEnter to updates ID number : ");
	            int id = sc.nextInt();
	            query = "UPDATE user SET id ='"+id+"' where name ='"+name+"' ";
	        }else if(opt==2){
	            System.out.print("\n\t\t\tEnter employee ID number : ");
	            int id = sc.nextInt();
	            System.out.print("\t\t\tEnter Names to Updates  : ");
	            String name = sc.next();
	            query = "UPDATE user SET name ='"+name+"' where id ='"+id+"' ";
	        }
	        else if(opt==3){
	            System.out.print("\n\t\t\tEnter employee ID number : ");
	            int id = sc.nextInt();
	            System.out.print("\t\t\tEnter Location to updates  : ");
	            String location = sc.next();
	            query = "UPDATE user SET location ='"+location+"' where id ='"+id+"' ";

	        }
	        else if(opt==4){
	            System.out.print("\n\t\t\tEnter employee ID number : ");
	            int id = sc.nextInt();
	            System.out.print("\t\t\tEnter Department Names to Updates  : ");
	            String department = sc.next();
	            query = "UPDATE user SET department ='"+department+"' where id ='"+id+"' ";
	        }
	        else {
	            System.out.println("\n\t\t\tChoose correct option ......");
	            updateData(con);
	        }
	        
	        try{
	            Statement stmt = con.createStatement();
	            int rows = stmt.executeUpdate(query);
	            if(rows==1) {
	                System.out.println("\t\t\t\t\t rows affected....");
	            }else {
	                System.out.println("\t\t\tPlease enter correct data .....!! ");
	                updateData(con);
	            }
	            EmployeeManagement.menu();
	        }catch (Exception e){
	            e.printStackTrace();
	        }

	}

}
