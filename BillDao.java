/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;
import model.Bill;

/**
 *
 * @author Dell
 */
public class BillDao {
    public static String getId()
    {
        int id = 1;
        try{
            ResultSet rs = DbOperations.getData("select max(id) from bill");
            if(rs.next())
            {
                id = rs.getInt(1);
                id = id + 1;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(id);
    }
    
    public static void save(Bill bill){
        String query = "insert into bill values('"+bill.getId()+"','"+bill.getName()+"','"+bill.getMobile()+"','"+bill.getEmail()+"','"+bill.getDate()+"','"+bill.getTotal()+"','"+bill.getCreatBy()+"')";
        DbOperations.setDataOrDelete(query, "Bill Details Added Successfully");
        
    }
    
    public static ArrayList<Bill> getAllRecordsByInc(String date)
    {
        ArrayList<Bill> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOperations.getData("select *from bill where data like '%"+date+"%' order By id INC");
            while(rs.next()){
            Bill bill = new Bill();
            bill.setId(rs.getInt("id"));
            bill.setName(rs.getString("name"));
            bill.setMobile(rs.getString("mobile"));
            bill.setEmail(rs.getString("email"));
            bill.setDate(rs.getString("data"));
            bill.setTotal(rs.getString("total"));
            bill.setCreatBy(rs.getString("createBy"));
            arrayList.add(bill);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    public static ArrayList<Bill> getAllRecordsByIDesc(String date)
    {
        ArrayList<Bill> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOperations.getData("select *from bill where data like '%"+date+"%' order By id DESC");
            while(rs.next()){
            Bill bill = new Bill();
            bill.setId(rs.getInt("id"));
            bill.setName(rs.getString("name"));
            bill.setMobile(rs.getString("mobile"));
            bill.setEmail(rs.getString("email"));
            bill.setDate(rs.getString("data"));
            bill.setTotal(rs.getString("total"));
            bill.setCreatBy(rs.getString("createBy"));
            arrayList.add(bill);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
}
