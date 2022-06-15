/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrewRegister;




public class DrewRegister {
    //Control Logic:
    //Register takes in:
    //Username
    //Password
    //Reentered Password for stability
    //E-Mail Address AND/OR Phone Number
    //Full Address; Home, City, State, Country
    //PoBox
    //Zip Code
    //Account Type
    //Registration Fee
    int ShowRegistrationPage()
    {
        //Spring will go here
        //...
    }
 
    int PushRegisteredAccountToServer()
    {
        //Spring will go here
        //...
    }
    
    int RegisteredOnMonday()
    {
        //CheckRegistrationDateEST();
        System.out.println("Since you registered on a Monday, you get a 20% discount on any purchase!");
        //PushDiscountToUserAccount();
    }
    
    int RegisterNewPizzaAccount(string Username, string Password, string ReenteredPassword, string Email, string PhoneNumber, string FullAddress, int PoBox, int ZipCode, int AccountType, int RegistrationFee)
    {
        //Phase One: Check Inputs:
        if(PoBox < 0)
        {
            System.out.println("Error: Invalid PO Box.");
        }
        if(ZipCode < 0)
        {
            System.out.println("Error: Invalid Zipcode.");
        }
        
        
        //Phase Two: Check Server:
        int ServerRegistrationStatus_UsernameExists = 0;//CheckIfUserExists(Username)
        if(ServerRegistrationStatus_UsernameExists = 0)
        {
           // PushRegisteredAccountToServer(Registration Info);
            System.out.println("Success! You are now a Pizzeriaist!");
            return 1;
        }
        else if(ServerRegistrationStatus_UsernameExists = 1)
        {
             System.out.println("Error: Username is taken.");
            return 3;
        }
        else if(ServerRegistrationStatus_UsernameExists = -1)
        {
             System.out.println("Unknown Error");
             return 2;
        }
        else if(ServerRegistrationStatus_UsernameExists = -2)
        {
            System.out.println("Error: Registration Server is Down. Try again later");
        return 6;
        }
        else if(ServerRegistrationStatus_UsernameExists = -3)
        {
             System.out.println("Error: There is another account with that email address.");
        return 4;
        }
        else if(ServerRegistrationStatus_UsernameExists = -4)
        {
             System.out.println("Error: Invalid Zipcode");
        return 5;
        }
        
       
       
        
        
    }
    
}
