package com.gregzanin;

import java.util.ArrayList;

/**
 * Created by GR389658 on 26/09/2017.
 */
public class MobilePhone {
    public MobilePhone() {
        this.contactList = new ArrayList<Contacts>();
    }

    private ArrayList<Contacts> contactList;

    public void addContact(String name, String phone) {
        Contacts contact = new Contacts(name,phone);
        contactList.add(contact);
    }

    public void updateContact(int position,String name, String phone){
        Contacts contact = new Contacts(name,phone);
        contactList.set(position, contact);
    }

    public int findContactByName(String name) {
        for(Contacts object: contactList){
            if(object.getName().equalsIgnoreCase(name)){
                return contactList.indexOf(object);
            }
        }
        return -1;
    }

    public int findContactByPhone(String phone) {
        for(Contacts object: contactList){
            if(object.getPhoneNumber().equalsIgnoreCase(phone)){
                return contactList.indexOf(object);
            }
        }
        return -1;
    }

    public void removeContact (int position){
        contactList.remove(position);
    }

    public void printList () {
        for(Contacts object: contactList){
            System.out.println("Contact nº: " + (contactList.indexOf(object) + 1) +
            "\nContact name: " + object.getName() +
            "\nContact phone number: " + object.getPhoneNumber() +
            "\n***************************************");
        }
    }

    public String getContactPhone(int position) {
        return contactList.get(position).getPhoneNumber();
    }

    public String getContactName(int position) {
        return contactList.get(position).getName();
    }




}
