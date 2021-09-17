package command.pattern.noodles;
public class ChefInvoker {
    Command[] prepCommands;
    Command[] unprepCommands;
    
    public ChefInvoker(){
        prepCommands = new Command[7];
        unprepCommands = new Command[7];
        
        Command noCommand = new NoCommand();
        
        for (int i=0; i< 7; i++ ){
            prepCommands[i] = noCommand;
            unprepCommands[i] = noCommand;
        }
    }
    
    
    public void setCommand( int slot, Command prepCommand, Command unprepCommand){
        prepCommands[slot] = prepCommand;
        unprepCommands[slot] = unprepCommand;
    }
    
    public void preparePasta(int slot){
        prepCommands[slot].execute();
    }
   
    public void stopPrepation(int slot ){
        unprepCommands[slot].execute();
    }
   
    public String toString() {
        StringBuilder stringBuff = new StringBuilder();
        stringBuff.append("\n------ Chef Controller -------\n");
        for (int i = 0; i < prepCommands.length; i++) {
                stringBuff.append("[slot " + i + "] " + prepCommands[i].getClass().getName()
                        + "    " + unprepCommands[i].getClass().getName() + "\n");
        }
        
        return stringBuff.toString();
    }    
}
