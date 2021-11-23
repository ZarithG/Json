package com.company.models;

public class Person {
    private String firstname;
    private String lastname;
    private int id;

    public Person(String firstname, String lastname, int id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
    }

    public Person() {
		
	}

	public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getId() {
		return id;
	}
    
    public void setId(int id) {
		this.id = id;
	}
    
    @Override
    public String toString() {
        return "Nombre: " + firstname +
                "\nApellido: " + lastname +
                "\nIdentificacion: " + id;
    }
}

