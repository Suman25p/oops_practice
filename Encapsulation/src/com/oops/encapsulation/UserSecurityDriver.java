package com.oops.encapsulation;

import java.util.Scanner;

class UserAccount2 {

    private String username;
    private String password;
    private int failedAttempts;
    private boolean isLocked;
    
    //Constructor 
    public UserAccount2(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String enteredPassword) {

        if (isLocked) {
            System.out.println("Account is locked. Contact admin.");
            return false;
        }

        if (!password.equals(enteredPassword)) {
            failedAttempts++;
            System.out.println("Invalid password. Attempts left: " + (3 - failedAttempts));

            if (failedAttempts == 3) {
                isLocked = true;
                System.out.println("Account locked due to 3 failed attempts");
            }
            return false;
        }

        failedAttempts = 0;
        System.out.println("Login successful. Welcome " + username.toLowerCase() + "!");
        return true;
    }
}

public class UserSecurityDriver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UserAccount2 user = new UserAccount2("Suman", "java123");

        while (true) {
            System.out.println("Enter password: ");
            String enteredPassword = sc.next();   

            if (user.login(enteredPassword)) {
                break;
            }
        }

        sc.close();
    }
}
/*
Enter password: 
123
Invalid password. Attempts left: 2
Enter password: 
abc
Invalid password. Attempts left: 1
Enter password: 
java123
Login successful. Welcome suman!
*/
