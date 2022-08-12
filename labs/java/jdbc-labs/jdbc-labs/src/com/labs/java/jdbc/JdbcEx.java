package com.labs.java.jdbc;

import java.sql.*;

public class JdbcEx {
    public static void main(String[] args) {
        System.out.println("JDBC Demo...");

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

//        STEP #1: Load Driver classes and register the driver [optional for JDK 8 and above]
        try {
            System.out.println("Loading Driver...");
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded Successfully.");
        } catch (ClassNotFoundException e) {
            System.out.println("Error while loading the driver: " + e.getMessage());
            e.printStackTrace();
            return;
        }
//        STEP #2: Create Connection
        String db_url = "jdbc:mysql://localhost:3306/jdbctraining";

        try {
            System.out.println("Creating Connection...");
            con = DriverManager.getConnection(db_url, "training", "training");
            System.out.println("Connection created successfully.  " + con);
        } catch (SQLException e) {
            System.out.println("Error while creating connection: " + e.getMessage());
            e.printStackTrace();
            return;
        }
//        STEP #3: Create Statement and supply the query to be executed
        try {
            System.out.println("Creating Statement...");
            stmt = con.createStatement();
            System.out.println("Statement created successfully.  " + stmt);

        } catch (SQLException e) {
            System.out.println("Error while creating statement: " + e.getMessage());
            e.printStackTrace();
            return;
        }

//        STEP #4: Execute Query and Get Results
        String query = "SELECT * FROM employee";
        try {
            System.out.println("Executing Query...");
            rs = stmt.executeQuery(query);
            System.out.println("Executed Query and got results  " + rs);
        } catch (SQLException e) {
            System.out.println("Error while executing the query: " + e.getMessage());
            e.printStackTrace();
            return;
        }

//        STEP #5: Get ResultSet and access the data [applicable for SELECT]
        try {
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String designation = rs.getString("designation");
                String department = rs.getString("department");
                String country = rs.getString("country");
                System.out.println(id + "\t" + name + "\t" + age + "\t" + designation + "\t" + department + "\t" + country);
            }
        }catch (SQLException e) {
            System.out.println("Error while accessing the results: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
