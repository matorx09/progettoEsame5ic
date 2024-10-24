//Gonzaga Edward 23/10/2024   4INF.D

//Titolo: Stampa albero attraverso 2 classi
package com.mycompany.albero;


public class Albero {

    public static void main(String[] args) {
        
        //Dichiaro e inizializzo la variabile 
        int base = 0; 
        
        //Istanzio i 2 oggetti
        input a1 = new input();
        output s1 = new output();
        
        //Setto la base a 5 attraverso il metodo set
        a1.setBase(5);
        
        //Do alla variabile il valore dato precedentemente al metodo set
        base = a1.getBase();
        
        
        //Stampo la grandezza della base
        System.out.print("La base dell'albero e: " + base);
        
        //Stampo l'albero richiamando il metodo stampa
        s1.stampa(base);
        
    }
}
