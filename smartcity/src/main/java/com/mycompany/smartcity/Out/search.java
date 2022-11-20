/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smartcity.Out;

import com.mycompany.smartcity.Hotel;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author frank
 */
public class search implements Serializable {

    

    public static void search1() {
         Scanner scan1 = new Scanner(System.in);
        System.out.print("1)Search by Budget" + '\n' + "2)Search By town" + '\n' + "3)Search By Evaluation" + '\n' + "Choice:");
        int ch = scan1.nextInt();
        if (ch == 1) {
            searchB();
        }
        if (ch == 2) {
            searchT();
        }
        if (ch == 3) {
            searchE();
        }
    }

    public static void searchB() {
         Scanner scan2 = new Scanner(System.in);
        int t = 0;
        int lg = Hotel.H.size();
        System.out.print("Enter Budget:");
        int budget = scan2.nextInt();
        int i = 0;

        System.out.println("                                  Hotel List");
          
        while (i < lg) {

            if (budget >= Hotel.H.get(i).price) {
                System.out.print(t);
                System.out.println(')' + "Name:" + Hotel.H.get(i).name + ".   Location:" + Hotel.H.get(i).town + ".   Price:" + Hotel.H.get(i).price + "XAF.   Rating:" + Hotel.H.get(i).eva + ".   Books:" + Hotel.H.get(i).booked);

                
            }
            i++; t++;
        }
    }

    public static void searchT() {
           Scanner scan3 = new Scanner(System.in);
        int t = 0;
        int lg = Hotel.H.size();
        int i = 0;
        System.out.print("Enter Town:");
        String Town = scan3.next();
        System.out.println("                                  Hotel List");
        while (i < lg) {
            if (Town.equals(Hotel.H.get(i).town)) {
                System.out.print(t);
                System.out.println(')' + "Name:" + Hotel.H.get(i).name + ".   Location:" + Hotel.H.get(i).town + ".   Price:" + Hotel.H.get(i).price + "XAF.   Rating:" + Hotel.H.get(i).eva + ".   Books:" + Hotel.H.get(i).booked);

                
            }
            i++; t++;
        }
    }

    public static void searchE() {
           Scanner scan4 = new Scanner(System.in);
        int i = 0;
        int t = 0;
        int lg = Hotel.H.size();
        System.out.print("Enter Evaluation:");
        int eval = scan4.nextInt();
        System.out.println("                                  Hotel List");

        while (i < lg) {
            if (eval >= Hotel.H.get(i).eva) {
                System.out.print(t);
                System.out.println(')' + "Name:" + Hotel.H.get(i).name + ".   Location:" + Hotel.H.get(i).town + ".   Price:" + Hotel.H.get(i).price + "XAF.   Rating:" + Hotel.H.get(i).eva + ".   Books:" + Hotel.H.get(i).booked);

                
            }
              i++; t++;
        }
      
    }
}
