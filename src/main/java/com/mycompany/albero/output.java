package com.mycompany.albero;

public class output {
    
    //Dichiaro la variabile
    private int base;
    
    //Metodo per richiamare la variabile privata
    public int getBase (){
        
        return base;
        
    }
    
    //Metodo che permette di settare la variabile
    public void setBase (int newBase){
        
        this.base = newBase;
        
    }
    
    //Metodo che stampa l'albero (triangolo)
    public void stampa(int base){
        
        for(int i = 0; i < base; i = i + 1){
            
            for(int a = 0; a <= i; a = a + 1){
                
                System.out.print("*");
                
            }
            
            System.out.print("\n");
        }
    }

    
}
