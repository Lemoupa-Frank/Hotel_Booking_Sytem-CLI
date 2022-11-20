/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smartcity;
import com.mycompany.smartcity.Out.Customer;
import java.util.ArrayList;
/**
 *
 * @author frank
 */
public class Display {
    public static void disH(ArrayList<Hotel> h){
        int lg = h.size(); int i = 0; 
        System.out.println("                                  Hotel List");
         
        while(i< lg)
        {
        System.out.print(i); 
        System.out.println(')'+"Name:"+h.get(i).name +".   Location:"+ h.get(i).town +".   Price:"+ h.get(i).price+ "XAF.   Rating:" + h.get(i).eva +".   Books:"+h.get(i).booked);
        i++;
        
        }
    }
    public static void disC(ArrayList<Customer> h){
        int lg = h.size(); int i = 0;
        System.out.println("                               Customer List");
        while(i<lg)
        {
        System.out.print(i);
        System.out.println(')'+"id:"+h.get(i).id +" Name:"+ h.get(i).name  );
        i++;
        }
    }

 
}
