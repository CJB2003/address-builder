package com.pluralsight;
import java.util.*;

public class AddressBuilderApp {
    public static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {

        StringBuilder();

    }
    //created this method to declutter main
    public static void StringBuilder() {

        //string builder method
        StringBuilder userAddress = new StringBuilder();

        //Asks for user input and prints them out
        System.out.println("Please provide the following information:");
        System.out.print("Full name: ");
        String userName = myScanner.nextLine();
        System.out.print("Billing Street: ");
        String userBillSt = myScanner.nextLine();
        System.out.print("Billing City: ");
        String userBillCity = myScanner.nextLine();
        System.out.print("Billing State: ");
        String userBillState = myScanner.nextLine();
        System.out.print("Billing Zip: ");
        String userBillZip = myScanner.nextLine();
        System.out.print("Shipping Street: ");
        String userShipSt = myScanner.nextLine();
        System.out.print("Shipping City: ");
        String userShipCity = myScanner.nextLine();
        System.out.print("Shipping State: ");
        String userShipState = myScanner.nextLine();
        System.out.print("Shipping Zip: \n");
        String userShipZip = myScanner.nextLine();

        //using string builder to append and format
        userAddress.append(userName + "\n");
        userAddress.append("\nBilling Address:" + "\n" + userBillSt + "\n");
        userAddress.append(userBillCity + ", ");
        userAddress.append(userBillState + " ");
        userAddress.append(userBillZip + "\n");
        userAddress.append("\nShipping Address: " + "\n" + userShipSt + "\n");
        userAddress.append(userShipCity + ", ");
        userAddress.append(userShipState + " ");
        userAddress.append(userShipZip + "\n");

        //print out string builder
        String myUserAddress = userAddress.toString();
        System.out.println(myUserAddress);
    }
}
