package command.pattern.noodles;

public class Fusilli {
    String name;
   
    public Fusilli( String name ) {
        this.name = name;
    }
    
    public void boilWater(){
        System.out.println(name + " boil water with salt");
    }
   
    public void addPasta(){
        System.out.println( name + " add pasta to boiling water");
    }
    
    public void addSalt(){
        System.out.println( name + " add salt");
    }
    
    public void drain(){
        System.out.println(name + " drain the pasta");
    }
    
    public void serve(){
        System.out.println( "Serve " + name );
    }
   
    public void stopPreparation(){
        System.out.println("Preparation of " + name + " Stopped");
    }
}
