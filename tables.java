/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.JOptionPane;
/**
 *
 * @author Dell
 */
public class tables {
    public static void main(String[] args)
    {
        try{
            String userTable = "create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),password varchar(200),question varchar(200),anwser varchar(200),mobile varchar(10),status varchar(20),UNIQUE (email))";
            String adminDetails = "insert into user(name,email,password,question,anwser,mobile,status) values('Admin','admin@gmail.com','123456','why','nothing','9398401661','true')";
            String categoryTable = "create table category(id int AUTO_INCREMENT primary key,name varchar(200))";
            String productTable = "create table product(id int AUTO_INCREMENT primary key,name varchar(200),category varchar(200),price varchar(200))";
            String billTable = "create table bill(id int primary key,name varchar(200),mobile varchar(200),email varchar(200),data varchar(200),total varchar(200),createBy varchar(200))";
            DbOperations.setDataOrDelete(userTable, "User Table created successfully");
            DbOperations.setDataOrDelete(adminDetails, "Admin Details Added Successfully");
            DbOperations.setDataOrDelete(categoryTable, "Category Table Added Successfully");
            DbOperations.setDataOrDelete(productTable, "Product Table Added Successfully");
            DbOperations.setDataOrDelete(billTable, "Bill Table Added Successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
}
