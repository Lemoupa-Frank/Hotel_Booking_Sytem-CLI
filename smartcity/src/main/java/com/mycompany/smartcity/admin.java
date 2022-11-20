/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smartcity;

import java.util.ArrayList;
import com.mycompany.smartcity.Hotel;
import static com.mycompany.smartcity.Hotel.newh;
import com.mycompany.smartcity.Out.Customer;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

/**
 *
 * @author frank
 */
public class admin implements Serializable {
static int password ;
    public static void add()  {
        ArrayList<Hotel> a = new ArrayList<Hotel>();
        a = newh();
    }
    public static void scus(){
         ArrayList<Customer> a = new ArrayList<Customer>();
    Display.disC(Customer.customer);
    }
   
    
}
