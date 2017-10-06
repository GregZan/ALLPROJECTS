package com.gregzanin;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        int optionMenu;
        String option1;
        String option2;
        int option3;

        showMenu();
        do {
            optionMenu = sc.nextInt();
            switch(optionMenu){
                case 1:
                    System.out.println("What is the contact name?");
                    sc.nextLine();
                    option1 = sc.nextLine();
                    System.out.println("What is the contact phone number?");
                    option2 = sc.nextLine();
                    mobilePhone.addContact(option1,option2);
                    System.out.println(option1 + " with the phone number: " + option2 + " was added with success!");
                    break;
                case 2:
                    System.out.println("What is the phone number or name of the contact you want to update?");
                    sc.nextLine();
                    option1 = sc.nextLine();
                    System.out.println("This is a name or the phone number? (1 for name and 2 for phone number)");
                    option3 = sc.nextInt();
                    switch (option3) {
                        case 1:
                            option3 = mobilePhone.findContactByName(option1);
                            System.out.println("What is the contact new phone number?");
                            sc.nextLine();
                            option2 = sc.nextLine();
                            System.out.println("What is the contact new name");
                            option1 = sc.nextLine();
                            mobilePhone.updateContact(option3, option1, option2);
                            System.out.println("Contact " + option1 + " data updated with success!");
                            break;
                        case 2:
                            option3 = mobilePhone.findContactByPhone(option1);
                            System.out.println("What is the contact new name?");
                            sc.nextLine();
                            option2 = sc.nextLine();
                            System.out.println("What is the contact new phone number?");
                            option1 = sc.nextLine();
                            mobilePhone.updateContact(option3, option2 , option1);
                            System.out.println("Contact " + option2 + " data updated with success!");
                            break;
                    }
                    break;
                case 3:
                    mobilePhone.printList();
                    break;
                case 4:
                    System.out.println("What is the phone number or name of the contact you want to view?");
                    sc.nextLine();
                    option1 = sc.nextLine();
                    System.out.println("This is a name or the phone number? (1 for name and 2 for phone number)");
                    option3 = sc.nextInt();
                    switch (option3) {
                        case 1:
                            option3 = mobilePhone.findContactByName(option1);
                            if (option3 >= 0){
                                System.out.println("The information of the contact with the name: " + option1 + ", is as following:\n" +
                                        "Phone number: " + mobilePhone.getContactPhone(option3) + "\n" +
                                        "Position on the contact list: " + (option3 + 1));
                            }
                            else {
                                System.out.println("No contact exists with such information");
                            }
                            break;
                        case 2:
                            option3 = mobilePhone.findContactByPhone(option1);
                            if (option3 >= 0){
                                System.out.println("The information of the contact with the phone number: " + option1.toLowerCase() + ", is as following:\n" +
                                        "Contact name: " + mobilePhone.getContactName(option3) + "\n" +
                                        "Position on the contact list: " + (option3 + 1));
                            }
                            else {
                                System.out.println("No contact exists with such information");
                            }
                            break;

                    }
                    break;
                case 5:
                    System.out.println("What is the phone number or name of the contact you want to remove?");
                    sc.nextLine();
                    option1 = sc.nextLine();
                    System.out.println("This is a name or the phone number? (1 for name and 2 for phone number)");
                    option3 = sc.nextInt();
                    switch (option3) {
                        case 1:
                            option3 = mobilePhone.findContactByName(option1);
                            if (option3 >= 0){
                                System.out.println("Are you sure you want to remove the contact with the name: " + option1.toLowerCase() + "?(Y for yes or N for no)");
                                sc.nextLine();
                                option1 = sc.nextLine();
                                removeContact(option1,option3);
                            }
                            else {
                                System.out.println("No contact exists with such information");
                            }
                            break;
                        case 2:
                            option3 = mobilePhone.findContactByPhone(option1);
                            if (option3 >= 0){
                                System.out.println("Are you sure you want to delete the contact with the name: " + mobilePhone.getContactName(option3).toLowerCase() + "?(Y for yes or N for no)");
                                sc.nextLine();
                                option1 = sc.nextLine();
                                removeContact(option1,option3);
                            }
                            else {
                                System.out.println("No contact exists with such information");
                            }
                            break;

                    }
                    break;
                case 6:
                    showMenu();
                    break;

                    default:

            }



        } while (optionMenu != 0);


    }

    public static void showMenu(){
        System.out.println("********************************");
        System.out.println("*     What you want to do?     *");
        System.out.println("* 1 - Add new contact          *");
        System.out.println("* 2 - Update existing contact  *");
        System.out.println("* 3 - Print list of contacts   *");
        System.out.println("* 4 - Search/find contact      *");
        System.out.println("* 5 - Remove contact           *");
        System.out.println("* 6 - Show menu                *");
        System.out.println("* 0 - Quit                     *");
        System.out.println("********************************");
    }

    public static void removeContact(String option1, int position){
        switch (option1) {
            case "Y":
            case "y":
                option1 = mobilePhone.getContactName(position);
                mobilePhone.removeContact(position);
                System.out.println("Contact " + option1 + " removed!");
                break;
            case "N":
            case "n":
                System.out.println("Contact not removed!");
                break;
        }
    }
}
