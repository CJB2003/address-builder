package com.pluralsight;
import java.util.*;

public class AddressBuilderApp {
    public static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {

        String userAddress = addressBuild();
        System.out.println(userAddress);

    }
    //created this method to declutter main
    public static String addressBuild() {

        //Asks for user input and prints them out
        System.out.println("Please provide the following information:");
        System.out.print("Full name: ");
        String userName = myScanner.nextLine().trim();
        System.out.print("Billing Street: ");
        String userBillSt = myScanner.nextLine().trim();
        System.out.print("Billing City: ");
        String userBillCity = myScanner.nextLine().trim();
        System.out.print("Billing State: ");
        String userBillState = myScanner.nextLine().trim();
        System.out.print("Billing Zip: ");
        String userBillZip = myScanner.nextLine().trim();
        System.out.print("Shipping Street: ");
        String userShipSt = myScanner.nextLine().trim();
        System.out.print("Shipping City: ");
        String userShipCity = myScanner.nextLine().trim();
        System.out.print("Shipping State: ");
        String userShipState = myScanner.nextLine().trim();
        System.out.print("Shipping Zip: \n");
        String userShipZip = myScanner.nextLine().trim();

        //using string builder to append and format
        StringBuilder myUserAddress = new StringBuilder();

        myUserAddress.append(userName + "\n"
                + "\nBilling Address:" + "\n" + userBillSt + "\n"
                + userBillCity + ", "
                + userBillState + " "
                + userBillZip + "\n"
                + "\nShipping Address: " + "\n" + userShipSt + "\n"
                + userShipCity + ", "
                + userShipState + " "
                + userShipZip);

        //return string builder
        return myUserAddress.toString();
    }
}
