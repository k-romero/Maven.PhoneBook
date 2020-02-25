package com.zipcodewilmington.phonebook;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {
    HashMap<String, List<String>> phoneMap;

    public PhoneBook(Map<String, List<String>> phoneMap) {
        this.phoneMap = new HashMap<>();
    }

    public PhoneBook() {
        this.phoneMap = new HashMap<>();
    }

    public void add(String name, String phoneNumber) {
        phoneMap.put(name, Collections.singletonList(phoneNumber));
    }

    public void addAll(String name, String... phoneNumbers) {
    }

    public void remove(String name) {
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
