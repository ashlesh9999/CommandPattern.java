package command.pattern.noodles;
public class SpaghettiPrepareCommand implements Command {
   Spaghetti spaghetti;
   
   public SpaghettiPrepareCommand( Spaghetti spaghetti ) {
       this.spaghetti = spaghetti;
   }
   public void execute(){
       spaghetti.boilWater();
       spaghetti.addSalt();
       spaghetti.addPasta();
       spaghetti.stir();
       spaghetti.stirSauce();
       spaghetti.drain();
       spaghetti.serve();
       System.out.println("\n");
   }
}
