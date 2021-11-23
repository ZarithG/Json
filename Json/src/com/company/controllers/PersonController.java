package com.company.controllers;

import com.company.models.Person;
import com.google.gson.Gson;  
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

public class PersonController {
	private final String path;
	Gson gson = new Gson();
	ArrayList<Person> persons = new ArrayList<>();
	
	public PersonController() {
		path = "Person.json";
	}
	
    public String personToJson(Person person) {
        Gson gson = new Gson();
        return gson.toJson(person);
    }

    public Person jsonToPerson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, Person.class);
    }

    public String personsToJson(ArrayList<Person> person) {
        Gson gson = new Gson();
        return gson.toJson(person);
    }

    public ArrayList<Person> jsonToPersons(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, new TypeToken<ArrayList<Person>>() {
        }.getType());
    }
    
    public ArrayList<Person> readPersons (){
    	return persons; 
    } 
    
    public void savePerson(Person person) {
        persons.add(person);
    	personsToJson(persons);
    }
    
    public void deletPerson (int id){
        for(int i=0; i< persons.size(); i++){
            if(persons.get(i).getId() == id){
                persons.remove(i);            
                personsToJson(persons);
            }
        }
        
       
    }
    
}
