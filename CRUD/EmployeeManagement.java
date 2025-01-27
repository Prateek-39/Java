package CRUD;

import java.util.Scanner;

import CRUD.*;

import java.sql.*;

public class EmployeeManagement {
	
	public static void menu() {
		Connection con = DBConnection.dataConnection();
		
		System.out.println("\n\n\t\t\t --------- CRUD OPERATION USING JAVA --------\n");
        System.out.println("\t\t\t1 - Create Data ");
        System.out.println("\t\t\t2 - Read Data ");
        System.out.println("\t\t\t3 - Update Data ");
        System.out.println("\t\t\t4 - Delete Data ");
        System.out.println("\t\t\t5 - Exit");
        System.out.print("\t\t Select Option  ---->>>  ");
        Scanner sc = new Scanner(System.in);
        int select= sc.nextInt();
        switch (select) {
            case 1 -> {
                System.out.println("\n\n\t\t\t ------ Create Employee Data Carefully ------\n");
                CreateData.createData(con);
            }
            case 2 -> {
                System.out.println("\n\n\t\t\t\t\t ---------- Employee Data ---------\n");
                ReadData.readData(con);
            }
            case 3 -> {
                System.out.println("\n\n\t\t\t\t\t --------- Updates Employee Data ---------\n");
                UpdateData.updateData(con);
            }
            case 4 -> {
                System.out.println("\n\n\t\t\t\t\t ---------- Delete Employee Data ----------\n");
                DeleteData.deleteData(con);
            }
            case 5 -> {
                System.out.println("\t\t\t\t\t   Exiting....\n \t\t\t\t\t Thank You");
                System.exit(0);
            }
            default -> {
                System.out.println("Wrong Option...!");
                menu();
            }

	}
}

	public static void main(String[] args) {
		menu();
	}

}

	