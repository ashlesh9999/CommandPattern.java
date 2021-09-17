package command.pattern.noodles;
public class FusilliPrepareCommand implements Command{
    Fusilli fusilli;
    
    public FusilliPrepareCommand( Fusilli fusilli ) {
        this.fusilli = fusilli;
    }
     @Override
    public void execute(){
        fusilli.boilWater();
        fusilli.addSalt();
        fusilli.addPasta();
        fusilli.drain();
        fusilli.serve();
        System.out.println("\n");
        
    }
}
