/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smartcity.Out;

import com.mycompany.smartcity.BOOKS;
import static com.mycompany.smartcity.BOOKS.books;
import com.mycompany.smartcity.Display;
import com.mycompany.smartcity.Hotel;
import static com.mycompany.smartcity.Hotel.H;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author frank
 */
public class Customer implements Serializable {

    public int id;
    public String name;

    public static ArrayList<Customer> customer = new ArrayList<Customer>();

    public Customer(int a, String b) {
        this.id = a;
        this.name = b;
    }

    public static ArrayList<Customer> addc() throws IOException {
        System.out.println("Welcome to our system");

        Scanner scane = new Scanner(System.in);
        Scanner scane2 = new Scanner(System.in);
        int flag = 1;
        int i = 0;
        //     System.out.print("1)Register"+'\n'+"2)Login"+'\n'+"3)Choice:");

        while (flag == 1) {
            System.out.print("1)Register" + '\n' + "2)Login" + '\n' + "3)Exit:" + '\n' + "4)Choice");
            int R = scane.nextInt();
            if (R == 1) {
                System.out.println("Enter Your details:");
                System.out.print("Name:");
                String name = scane2.nextLine();
                int l = customer.size();
                int num = 0;
                int flagcustomer = 0;
                while (num < l) {
                    if (name.equals(customer.get(num).name)) {
                        System.out.println("Customer Exist!!!");
                        flagcustomer = 1;
                    }
                    num++;
                    if (flagcustomer == 1) {
                        break;
                    }
                }
                if (flagcustomer == 0) {
                    System.out.print("Enter PersonalId:");
                    int q = scane.nextInt();
                    customer.add(new Customer(q, name));
                    JOptionPane.showMessageDialog(null, "Registered");
                }
            }
            if (R == 2) { //logging
                int flagA = 0;
                System.out.println("Enter Your details:");
                System.out.print("Name:");
                String name0 = scane2.nextLine();
                System.out.print("Enter PersonalId:");
                int q0 = scane.nextInt();
                int lent = customer.size();
                int num1 = 0;
                int logflag = 0;
                while (num1 < lent) {
                    if ((name0.equals(customer.get(num1).name)) && (q0 == customer.get(num1).id)) {
                        JOptionPane.showMessageDialog(null, "Your LOGGED in!!");
                        break;
                    }
                    num1++;
                }
                while (flagA == 0) {
                    System.out.print("0)Search And Book Hotel" + '\n' + "1)Book a Hotel" + '\n' + "2)Exit" + '\n' + "choice:");
                    int choice = scane.nextInt();
                    if (choice == 0) {
                        search.search1();
                        System.out.print("Did'nt Find a Hotel? Enter Exit '\n'Found a Hotel enter continue" + '\n' + "Enter Option:");
                        if (scane.next().equals("Exit")) {
                            continue;
                        } else {
                            System.out.print("Choose Your Hotel Number to book:");
                        }
                        int a = scane.nextInt();
                        Hotel.H = Hotel.booked(Hotel.H, a);
                        String Hname = H.get(a).name;
                        BOOKS.addbook(name0, Hname);
                        i++;
                    }
                    if (choice == 1) {
                        System.out.println("View  Hotels");
                        Display.disH(Hotel.H);
                        System.out.print("Choose Your Hotel Number:");
                        int a = scane.nextInt();
                        Hotel.H = Hotel.booked(Hotel.H, a);
                        String Hname = H.get(a).name;
                        BOOKS.addbook(name0, Hname);
                        System.out.println(books.get(i).time);
                        i++;
                    }
                    if (choice == 2) {
                        flag = 2;
                    }
                    System.out.println("1)Book again" + '\n' + "2)Terminate session");
                    int opt = scane.nextInt();
                    if (opt == 1) {
                        continue;
                    } else {
                        flagA = 1;
                    }
                }
            }
            if (R == 3) {
                flag = 2;
            }
        }
        return customer;
    }
}
