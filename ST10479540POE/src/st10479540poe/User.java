/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10479540poe;

/**
 *
 * @author RC_Student_lab
 */
public class User {
   private String username;
    private String password;
    private String number;

    public User(String username, String password, String number) {
        this.username = username;
        this.password = password;
        this.number = number;
    }
    
    //setters

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNumber(String number) {
        this.number = number;
    }
//getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNumber() {
        return number;
    }
    
    
}
