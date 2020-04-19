package cursose;

import java.util.Iterator;

public class Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;

        while (true) {//Condición trivial: siempre cierta
            i++;
            System.out.println ("Valor de i: " + i);
            if (i==9) { break;}
        }      
        
        int contador = 0 ;

        do {   
        	
        	System.out.println ("Contando... " + (contador+1) );
            contador += 1;

        } while (contador<10);  
        
        for(int j=5;j<=10;j+=2)
        {//Notemos que escribir i+=2 es similar a escribir i = i + 2
            System.out.println(j);
        }
        
        String [] array = {"Facebook", "Twiter","Whatsap"};
        
        for(int j = 1 ; j<array.length; j++) {
        	System.out.println(array[j]);
        }
        
        for(String s : array) { // mas recomendada para listas enlasadas
        	System.out.println(s);
        }
        
        
	}

}
