package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){


        if(oldPassword.equals(this.password)){
            if(isValid(newPassword)){
                System.out.println("Password changed successfully!");
                this.password=newPassword;
            }
            else{
                System.out.println("The new password is not valid!");
            }
        }
        else{
            System.out.println("The given password does not match current password!");
        }
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
    }
    public boolean isValid(String newPassword){
        if(newPassword.length()<8){
            return false;
        }
        boolean upper = false;
        boolean lower = false;
        boolean dig = false;
        boolean special = false;
        for(int i=0;i<newPassword.length();i++){
            char ch = newPassword.charAt(i);
            if(ch>='A' && ch<='Z'){
                upper = true;
            }
            else if(ch>='a' && ch<='z'){
                lower = true;
            }
            else if(ch>='0' && ch<='9'){
                dig = true;
            }
            else{
                special = true;
            }
        }
        if(upper==true && lower==true && dig==true && special==true){
            return true;
        }
        return false;
    }
}
