package morracinese;

import java.util.Scanner;

/**
 *
 * @author francescorotiroti
 * Molti approcci sarebbero stati possibili.
 */

public class MorraCinese {      //controller del gioco
    
    
    
    public static void main(String[] x) {
        Partita p;
        
        int mode = 0;
        
        Scanner t = new Scanner(System.in);
        System.out.println("Inserisci il numero dispari di partite che vuoi fare:");
        int partite = -1;
        while ((partite % 2) == 0 || partite < 0) {     //si potrebbe gestire l'eccezione che l'input non sia un intero.
            
            try{
                partite = t.nextInt();
            }
            catch(Exception e){
                System.out.println("ERRORE");
                return;
            }

            if ((partite % 2) == 0) {
                System.out.println("Ho detto dispari!");
            }
        }

        while (mode != 1 && mode != 2) {
            System.out.println("Premi 1 se vuoi giocare contro il PC, 2 se vuoi simulare un match!");
            try{
                mode = t.nextInt();
            }
            catch(Exception e){
                System.out.println("ERRORE");
                return;
            }   
        }

        
            p = new Partita(mode, partite);
        

    }

    
    
}
