/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10479540poe;

/**
 *
 * @author RC_Student_lab
 */
// conditions
public class Login {
     private User registeredUser; // Stores the registered user details

    public boolean checkUserName(String username) {
        return username != null && username.contains("_") && username.length() <= 5;
    }

    public boolean checkPasswordComplexity(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUppercase = true;
            else if (Character.isDigit(c)) hasDigit = true;
            else if (!Character.isLetterOrDigit(c)) hasSpecialChar = true;
        }

        return hasUppercase && hasDigit && hasSpecialChar;
    }

    public boolean checkCellPhoneNumber(String number) {
        if (number == null || number.length() != 12) {
            return false;
        }

        if (!number.startsWith("+27")) {
            return false;
        }

        for (int i = 3; i < number.length(); i++) {
            if (!Character.isDigit(number.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public String registerUser(String username, String password, String number) {
        if (!checkUserName(username)) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.";
        }

        if (!checkPasswordComplexity(password)) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }

        if (!checkCellPhoneNumber(number)) {
            return "Cell phone number incorrectly formatted or does not contain the South African international code.";
        }

        registeredUser = new User(username, password, number);
        return "Username and password successfully captured.";
    }

    public String returnLoginStatus(String username, String password) {
        if (registeredUser != null && username != null && password != null &&
            registeredUser.getUsername().equals(username) &&
            registeredUser.getPassword().equals(password)) {
            return "Welcome " + username + ", it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
}
    

