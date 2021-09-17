package command.pattern.noodles;
public class FusilliStopPreparationCommand implements Command{
   Fusilli fusilli;
   
   public FusilliStopPreparationCommand( Fusilli fusilli ){
       this.fusilli = fusilli;
   }

   public void execute(){
       fusilli.stopPreparation();
       System.out.println("\n");
   }
}

