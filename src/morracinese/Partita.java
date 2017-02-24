package morracinese;

/**
 *
 * @author francescorotiroti
 */
public class Partita {
    Player p1, p2;
    int m;
    
    public Partita(int mode, int nPartite){
        this.m = mode;
        if(m == 1){
            this.p1 = new Player(1);
            this.p2 = new Player(2);
        }
        else{
            this.p1 = new Player(2);
            this.p2 = new Player(2);
        }
        
        for(int i=0; i<nPartite;i++){
            play(p1, p2);
            endRound(p1,p2);
        }
        
        
    }
    
    public void play(Player p1, Player p2){
       vincitore(p1.getMossa(p1), p2.getMossa(p2));
       
    }
    
    public void vincitore(int mossa1, int mossa2){
        
        if(mossa1 == mossa2){
            System.out.println("Pareggio, non aggiungo punti a nessuno");
            
        }
        else if((mossa1 == 1 && mossa2 == 3) || (mossa1 == 2 && mossa2 == 1) || (mossa1 == 3 && mossa2 == 2) ){
           
            p1.setPunti();
            System.out.println("Ha vinto giocatore 1 ed ha "+ p1.getPunti() + " punti!");
            
        }
        else{
            
            p2.setPunti();
            System.out.println("Ha vinto giocatore 2 ed ha "+ p2.getPunti() + " punti!");
        }
        
        
               
    }
    
    public void endRound(Player p1, Player p2){
        System.out.println("Round terminato:");
        System.out.println("Il giocatore1 ha "+p1.getPunti()+" punti");
        System.out.println("Il giocatore2 ha "+p2.getPunti()+" punti");
       
    }
    
}
