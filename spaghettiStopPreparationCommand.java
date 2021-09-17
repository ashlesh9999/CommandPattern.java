package command.pattern.noodles;
public class SpaghettiStopPreparationCommand implements Command{
   
   Spaghetti spaghetti;
   public SpaghettiStopPreparationCommand ( Spaghetti spaghetti ) {
       this.spaghetti = spaghetti;
   }
   public void execute(){
       spaghetti.stopPreparation();
       System.out.println("\n");
   }
}
