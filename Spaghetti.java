package command.pattern.noodles;
public class Spaghetti {
    
    String name;
    
    public Spaghetti( String name ) {
        this.name = name;
    }
    
    
    public void boilWater(){
        System.out.println( name + " boil water");
    }
    
    public void addSalt(){
        System.out.println(name + " add salt");
    }
   
    public void addPasta(){
        System.out.println(name + " add pasta");
    }
   
    public void stir(){
        System.out.println(name + " stir the boiling pasta");
    }
   
    public void drain(){
        System.out.println( name + " drain the pasta ");
    }
    
    public void stirSauce(){
        System.out.println( name + " stir in the sauce");
    }
    
    public void serve(){
        System.out.println("Serve " + name);
    }
    
    public void stopPreparation(){
        System.out.println("Preparation of " + name + " Stopped");
    }
    
}
