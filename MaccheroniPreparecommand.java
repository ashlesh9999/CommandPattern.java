package command.pattern.noodles;
public class MaccheroniPrepareCommand implements Command{
    Maccheroni maccheroni;
    public MaccheroniPrepareCommand( Maccheroni maccheroni){
        this.maccheroni = maccheroni;
    }
    public void execute(){
        maccheroni.boilWater();
        maccheroni.addPasta();
        maccheroni.stir();
        maccheroni.serve();
        System.out.println("\n");
    }
}
