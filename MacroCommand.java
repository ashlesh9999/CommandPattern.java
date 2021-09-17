package command.pattern.noodles;
public class MacroCommand implements Command{
    Command[] commands;
    
    public MacroCommand(Command[] commands){
        this.commands = commands;
    }
    public void execute(){
        for(int j = 0; j < commands.length; j++){
            commands[j].execute();
        }
    }
}
