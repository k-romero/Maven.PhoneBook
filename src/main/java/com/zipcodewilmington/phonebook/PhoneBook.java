package com.zipcodewilmington.phonebook;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {
    Map<String, List<String>> phoneMap;
    List<String> phoneNumbers;


    public PhoneBook() {
        this.phoneMap = new LinkedHashMap<>();
        this.phoneNumbers = new ArrayList<>();
    }

    public PhoneBook(Map<String, List<String>> phoneMap) {
        this.phoneMap = phoneMap;
    }


    public void add(String name, String phoneNumber) {
        this.phoneNumbers.add(phoneNumber);
        this.phoneMap.put(name, this.phoneNumbers);
    }

    public void addAll(String name, String... phoneNumbers) {
        for (int i = 0; i < phoneNumbers.length; i++) {
            this.phoneMap.put(name, Arrays.asList(phoneNumbers));
        }

    }

    public void remove(String name) {
        this.phoneMap.remove(name);
    }

    public Boolean hasEntry(String name) {
        return null;
    }

    public List<String> lookup(String name) {
        return null;
    }

    public String reverseLookup(String phoneNumber)  {
        return null;
    }

    public List<String> getAllContactNames() {
        return null;
    }

    public Map<String, List<String>> getMap() {
        return phoneMap;
    }
}
