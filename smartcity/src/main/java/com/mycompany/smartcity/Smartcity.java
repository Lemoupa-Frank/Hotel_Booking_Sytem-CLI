/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.smartcity;

import com.mycompany.smartcity.Out.Customer;
import static com.mycompany.smartcity.Out.Customer.addc;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author frank
 */
public class Smartcity implements Serializable {

    public static void main(String[] args) throws IOException {
        JOptionPane.showMessageDialog(null, "Welcome to Smartcity");
        ArrayList<Hotel> A = new ArrayList<Hotel>();
        ArrayList<Customer> c = new ArrayList<Customer>();
        Scanner scan = new Scanner(System.in);

        int flag1 = 1;
        int flag2 = 2;
        while (flag1 == 1) {
            System.out.print("User Type" + '\n' + "1)Admin" + '\n' + "2)Client"+'\n'+"3)Exit"+'\n'+"Choice:");
            int choice = scan.nextInt();
            if (choice == 1) {
               admin.add();
            }
             if (choice == 2) {
                 c = addc();
            }
            if (choice == 3) {
                 JOptionPane.showMessageDialog(null, "Are You sure wish to exit");
                 flag1 = 2;
            }
        }
    }
}

//add files