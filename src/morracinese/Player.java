package morracinese;
import java.util.Scanner;
/**
 *
 * @author francescorotiroti
 */
public class Player {
   int type;
   int punti;
   
   public Player(int t){
       this.type=t;
   }
   
   public int getMossa(Player p){
       Scanner t = new Scanner(System.in);
       int mossa = 0;
       if(p.getType()==1){
           while(mossa<1 || mossa>3){
               System.out.println("Fai la tua mossa: \n1 - Carta\n2 - Forbice\n3 - Sasso");
               try{
                   mossa = t.nextInt();
               }
               catch(Exception e){
                   
                   System.out.println("Punto all'avversario!");
                   break;
                   
               }
               
           }
           
           
          
       }
       else{
           mossa = (int)(Math.random()*3)+1;
           System.out.println("Il computer gioca: "+mossa+" (1 - Carta, 2 - Forbice, 3 - Sasso)");
           
           
       }
       return mossa;
   }
   
   public int getType(){
       return this.type;
   }
   
   public void setPunti(){
       this.punti++;
   }
   
   public int getPunti(){
       return this.punti;
   }
   
}
