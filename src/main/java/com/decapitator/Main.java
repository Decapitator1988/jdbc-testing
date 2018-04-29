package com.decapitator;


import java.sql.*;

public class Main {
    private static String USERNAME = "postgres";
    private static String PASSWORD = "postgres";
    private static  String URL = "jdbc:postgresql://localhost:5432/exampleN";
    public static void main(String[] args) throws SQLException {
        DBProcessor dbProcessor = new DBProcessor();
        Connection connection = dbProcessor.getConnection(URL, USERNAME, PASSWORD);
        String query = "select * from productentity where id>3";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()){
            int id;
            String brand;
            double price;
            id = resultSet.getInt("id");
            brand = resultSet.getString("name");
            price = resultSet.getDouble("price");
            Product product = new Product(id, brand, price);
            System.out.println(product);
        }

        statement.close();
        connection.close();
    }


}
