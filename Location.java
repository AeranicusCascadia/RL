
public class Location
{
    String name;
    String icon;
    boolean passable;
    
    public Location(String name, String icon, boolean passable) {
        this.name = name;
        this.passable = passable;
        this.icon = icon;
    }
    
    public String getName() {
        return name;
    }
    
    public boolean getPassable() {
        return passable;
    }
    
    public String getIcon() {
        return icon;
    }
    
    public static void main(String[] args) {
        System.out.println("Welcome to Online IDE!! Happy Coding :)");
    }
}
