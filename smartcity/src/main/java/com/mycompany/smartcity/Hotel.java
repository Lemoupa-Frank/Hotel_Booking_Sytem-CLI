/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smartcity;

import static com.mycompany.smartcity.BOOKS.DisplayBooks;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author frank
 */
public class Hotel implements Serializable {

    public String name;
    public String town;
    public int price;
    public int eva;
    public int rec;
    public int booked;

    public Hotel(String a, String b, int c, int d, int e, int f) {
        this.name = a;
        this.town = b;
        this.price = c;
        this.eva = d;
        this.rec = e;
        this.booked = f;
    }
    public static ArrayList<Hotel> H = new ArrayList<Hotel>();

    public static ArrayList<Hotel> newh()  {

        Scanner scan = new Scanner(System.in);  Scanner scan2 = new Scanner(System.in);
        int flag = 1, flag2 = 1;
        int ev = 0;

        while (flag == 1) {
          //  System.out.print("Password");
                System.out.print("0)View Customers" + '\n' + "1)Add Hotel" + '\n' + "2)Clear Hotel" + '\n' + "3)View Hotels" + '\n' + "4)Exit" + '\n' +"5)Display BOOKS"+'\n'+ "Choice:");
                int choice = scan.nextInt();
                if (choice == 1) {
                    System.out.println("Enter Name");
                    String nam = scan2.nextLine();
                    System.out.println("Enter Town");
                    String tow = scan2.nextLine();
                    System.out.println("Enter Price");
                    int pri = scan.nextInt();
                    System.out.println("Enter Evaluation");
                    while (flag2 == 1) {
                        ev = scan.nextInt();
                        if (ev >= 1 && ev <= 5) {
                            flag2 = 2;
                            continue;
                        }
                        System.out.println("please your value should be between 1 and 5");
                    }

                    H.add(new Hotel(nam, tow, pri, ev, 0, 0));
                  
                    flag2 = 1;
                }
                if (choice == 2) {
                    System.out.println("Choose Idex of Hotel you Wish to delete");
                    Display.disH(H);
                    int index = scan.nextInt();
                    H.remove(index);
                
                }
                if (choice == 3) {
                    Display.disH(H);
                }
                if (choice == 4) {
                    flag = 2;
                }
                if (choice == 0) {
                    admin.scus();
                }
                if (choice == 5){
                DisplayBooks();
                }
            
        }
        return H;
    }

    public static ArrayList<Hotel> booked(ArrayList<Hotel> h, int a) {
        ArrayList<Hotel> N = new ArrayList<Hotel>();
        String n = h.get(a).name; //name
        String t = h.get(a).town;//town
        int p = h.get(a).price;//price
        int e = h.get(a).eva;//evaluation
        int r = h.get(a).rec;//
        r = r + 1;//recomendation
        if (r % 100 == 0) {
            e = e + 1;
        }
        int g = h.get(a).booked;
        int book = g + 1;//booked
        h.set(a, new Hotel(n, t, p, e, r, book));
        return h;
    }
}
