/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smartcity;

import static java.sql.DriverManager.println;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author frank
 */
public class BOOKS {

  public  String time;
    public String customername;
    public String Hotelname;
    public static ArrayList<BOOKS> books = new ArrayList<BOOKS>();

    public BOOKS(String a, String b) {
        this.customername = a;
        this.Hotelname = b;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        this.time = dtf.format(now);
    }

    public static ArrayList<BOOKS> addbook(String a, String b) {
        books.add(new BOOKS(a, b));
        return books;
    }

    public static void DisplayBooks() {
        int l = books.size();
        int i = 0;
        System.out.println("                             Booking List");
        while (i < l) {
 System.out.print("Time:    "+books.get(i).time+"  CustomerName:    "+books.get(i).customername+"     HotelName:"+books.get(i).Hotelname);
       i++;
        }
    }
}
