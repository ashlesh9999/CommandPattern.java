package command.pattern.noodles;

public class CommandMain {

   
    public static void main(String args[]) {
        ChefInvoker chefInvoker = new ChefInvoker();
        
        Fusilli fusilli = new Fusilli("Fusilli");
        Maccheroni maccheroni = new Maccheroni("Maccheroni");
        Spaghetti spaghetti = new Spaghetti("Spaghetti");
        
        FusilliPrepareCommand fusilliPrepareCommand = 
                new FusilliPrepareCommand(fusilli);
        MaccheroniPrepareCommand maccheroniPrepareCommand = 
                new MaccheroniPrepareCommand(maccheroni);
        SpaghettiPrepareCommand spaghettiPrepareCommand = 
                new SpaghettiPrepareCommand(spaghetti);
        
        FusilliStopPreparationCommand fusilliStopPreparationCommand = 
                new FusilliStopPreparationCommand(fusilli);
        MaccheroniStopPreparationCommand maccheroniStopPreparationCommand =
                new MaccheroniStopPreparationCommand(maccheroni);
        SpaghettiStopPreparationCommand spaghettiStopPreparationCommand = 
                new SpaghettiStopPreparationCommand(spaghetti);
        
        
        Command[] preps = { fusilliPrepareCommand, 
                            maccheroniPrepareCommand,
                            spaghettiPrepareCommand 
        };
        Command[] stops = { fusilliStopPreparationCommand, 
                            maccheroniStopPreparationCommand,
                            spaghettiStopPreparationCommand
        };
        
        MacroCommand prepsMacro = new MacroCommand(preps);
        MacroCommand stopsMacro = new MacroCommand(stops);
        
        chefInvoker.setCommand(0, prepsMacro, stopsMacro);
        
        System.out.println(chefInvoker);
        System.out.println("\n---------Chef Macro On --------\n");
        chefInvoker.preparePasta(0);
        System.out.println("--------Chef Macro Off --------");
        chefInvoker.stopPrepation(0); 
     }
}
