/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package st10479540poe;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class ST10479540POE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // main functions
        Login login= new Login();
        Scanner input = new Scanner(System.in);
           //registration captures
     String username = JOptionPane.showInputDialog("Enter username;");
     String password = JOptionPane.showInputDialog("Enter password");
     String number = JOptionPane.showInputDialog("Enter Cellphone Number");
     String registrationMessage = login.registerUser(username, password, number);


     
     JOptionPane.showMessageDialog(null,registrationMessage);//outputs the registration Message
     //Login captures
        
          String loginUsername = JOptionPane.showInputDialog("Enter username:");
          String loginPassword = JOptionPane.showInputDialog("Enter password:");
          String loginMessage = login.returnLoginStatus(loginUsername,loginPassword);
          JOptionPane.showMessageDialog(null, loginMessage);
    }
    }
        
    
    

