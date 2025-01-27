package CRUD;

import java.sql.*;

import CRUD.EmployeeManagement;

public class ReadData {

	public static void readData(Connection con) {
		
	
        String query = "select * from user";

       
        try {
          
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String department = rs.getString("department");
                String location = rs.getString("location");

                System.out.println("\t\t\tEmp ID : "+id+"  Name -->> "+name+"    Department -->> "+department+"    Location -->> "+location);
            }
            EmployeeManagement.menu();

        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}
