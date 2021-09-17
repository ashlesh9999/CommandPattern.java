package command.pattern.noodles;

public class Maccheroni {
    String name;
    public Maccheroni( String name ) {
        this.name = name;
    }
    
    public void boilWater(){
        System.out.println( name + " boil water");
    }
    
    public void addPasta(){
        System.out.println( name + " add pasta");
    }
    
    public void stir(){
        System.out.println(name + " stir well to prevent sticking on each other");
    }
   
    public void drain(){
        System.out.println( name + " drain the water from pasta");
    }
    
    public void serve(){
        System.out.println("Serve " + name);
    }
   
    public void stopPreparation(){
        System.out.println("Preparation of " + name + " Stopped");
    }
}
