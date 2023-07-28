package dao;

import javax.swing.JOptionPane;

public class tables {

    public static void main(String[] args) {

        try {

            String userTable = "create table user(id int AUTO_INCREMENT primary key, name varchar(200), email varchar(200) UNIQUE, mobileNumber varchar(10), address varchar(200), password varchar(200), status varchar(20))";
            String adminDetails = "insert into user(name, email, mobileNumber, address, password,status) values('Admin', 'admin@gmail.com', '1234567890', 'Romania', 'admin', 'true')";
            String categoryTable = "create table category(id int AUTO_INCREMENT primary key, name varchar(200))";
            String productTable = "create table product(id int AUTO_INCREMENT primary key, name varchar(200), category varchar(200), price varchar(200))";
            String billTable = "create table bill(id int primary key, name varchar(200), mobileNumber varchar(200), email varchar(200), date varchar(50), total varchar(200), createdBy varchar(200))";
            DbOperations.setDataOrDelete(userTable, "User Table Created Succesfully");
            DbOperations.setDataOrDelete(adminDetails, "Admin Details Added Succesfully");
            DbOperations.setDataOrDelete(categoryTable, "Category Table Created Succesfully");
            DbOperations.setDataOrDelete(productTable, "Product Table Created Succesfully");
            DbOperations.setDataOrDelete(billTable, "Bill Table Created Succesfully");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }

    }

}
