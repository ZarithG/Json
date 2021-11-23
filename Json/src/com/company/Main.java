package com.company;
import com.company.controllers.PersonController;
import com.company.models.Person;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	String firstName, lastName;
    	Scanner scanner = new Scanner(System.in);
    	int option;
        int id;
        Person person;
        PersonController personController = new PersonController();
    	do{
        System.out.println("Digite una opcion:");
        System.out.println("1. Guardar personas");
        System.out.println("2. Obtener una persona");
        System.out.println("3. Eliminar una persona");
        System.out.print("Opcion: ");
        option = scanner.nextInt();
        switch (option) {
            case 1:
            	System.out.println("Ingrese a la persona");
            	System.out.println("Nombre de la persona");
            	firstName = scanner.nextLine();
            	firstName = scanner.nextLine();
            	System.out.println("Apellido de la persona");
            	lastName = scanner.nextLine();
            	System.out.println("Identificacion de la persona");
            	id = scanner.nextInt();
            	person = new Person(firstName, lastName, id);
            	personController.savePerson(person);
            	System.out.println(person);
                break;
            case 2:
                System.out.println(personController.readPersons());
                break;
                
            case 3:
            	System.out.println("Identificacion de la persona a eliminar");
            	id = scanner.nextInt();
            	personController.deletPerson(id);
            	
            	break;
            default:
                System.out.println("Opcion no valida");
        }
        }while(option != 4);
        
    }
}
