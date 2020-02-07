/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligonos;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Poligono {

    String tipo;
    double altura;
    double base;
    double radio;
    double apotema;
    double area;
    
    Scanner reader = new Scanner(System.in);
    
    public void hallarArea(){
    
        if (tipo.equalsIgnoreCase("cuadrado")) {
            System.out.println("Ingrese el lado: ");
            base = reader.nextDouble();
            area = Math.pow(base, 2);
            System.out.println("El area del cuadrado es: " + area);
        }
        
        if (tipo.equalsIgnoreCase("Triangulo")) {
            System.out.println("Ingrese el base: ");
            base = reader.nextDouble();
            System.out.println("Ingrese el altura: ");
            altura = reader.nextDouble();            
            area = (base * altura)/2;
            System.out.println("El area del triangulo es: " + area);
        } 
        
        if (tipo.equalsIgnoreCase("circulo")) {
            System.out.println("Ingrese el radio: ");
            radio = reader.nextDouble();
           
            area = 3.14 * (Math.pow(radio, 2));
            System.out.println("El area del circulo es: " + area);
        } 

        if (tipo.equalsIgnoreCase("hexagono")) {
            System.out.println("Ingrese el lado: ");
            base = reader.nextDouble();
            
            area = 3.14 * (Math.pow(radio, 2));
            System.out.println("El area del circulo es: " + area);
        }
    
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);    
        Poligono poligono = new Poligono();
        System.out.println("Ingrese el tipo de poligono: ");
        poligono.tipo = reader.nextLine();
        poligono.hallarArea();

    
    }
    



}
