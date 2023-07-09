package maratoninmigrante;

import java.util.Scanner;

public class MaratonInmigrante {

    public static void main(String[] args) {
    //Pedir DNI, nombre y edad
        System.out.println("Ingrese el DNI del participante: ");
        Scanner teclado = new Scanner(System.in);
        String dni = teclado.nextLine();
        
        System.out.println("Ingrese el nombre del participante: ");
        String nombre = teclado.nextLine();
        
        System.out.println("Ingrese la edad del participante: ");
        Scanner tecladoInt = new Scanner(System.in);
        int edad = tecladoInt.nextInt();
    
    //Determinar cuál categoría se debe inscribir
    
        while((!dni.equals("0")) && (!nombre.equalsIgnoreCase("fin"))){
            
            
                       
            if (edad >= 6 && edad <= 10) {
                System.out.println("La categoría es Menores A.");
            } else if (edad >= 11 && edad <= 17) {
                System.out.println("La categoría es Menores B.");
            } else if (edad >= 18 && edad <= 25) {
                System.out.println("La categoría es Junior.");
            } else if (edad >= 26 && edad <= 32) {
                System.out.println("La categoría es Juveniles.");
            } else if (edad >= 33 && edad <= 50) {
                System.out.println("La categoría es Adultos");
            } else if (edad >=51) {
                System.out.println("La categoría es Senior.");
            } else {
                System.out.println("No puede participar en la Maratón.");
            }
            
            System.out.println("-----------------------------");
        
        System.out.println("Ingrese el DNI del participante: ");
        dni = teclado.nextLine();
        
        System.out.println("Ingrese el nombre del participante: ");
        nombre = teclado.nextLine();
        
        System.out.println("Ingrese la edad del participante: ");
        edad = tecladoInt.nextInt();
        }
    }
}
