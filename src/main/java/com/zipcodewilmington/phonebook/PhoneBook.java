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
        phoneMap.remove(name);
    }

    public Boolean hasEntry(String name) {
        if(phoneNumbers.contains(name)){
            return phoneNumbers.contains(name);
        }
        return phoneMap.containsKey(name);
    }

    public List<String> lookup(String name) {
        return phoneMap.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        for (String key : phoneMap.keySet()) {
            if(phoneMap.get(key).contains(phoneNumber)){
                return key;
            }
        }
        return null;
    }

    public List<String> getAllContactNames() {
        return null;
    }

    public Map<String, List<String>> getMap() {
        return phoneMap;
    }
}
