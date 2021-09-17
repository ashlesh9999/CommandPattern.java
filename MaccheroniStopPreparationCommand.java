package command.pattern.noodles;
public class MaccheroniStopPreparationCommand implements Command {
   Maccheroni maccheroni;
   
   public MaccheroniStopPreparationCommand( Maccheroni maccheroni ) {
       this.maccheroni = maccheroni;
   }
   
   public void execute(){
       maccheroni.stopPreparation();
       System.out.println("\n");
   }
}
