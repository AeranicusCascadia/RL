
public class Main
{
    // static properties
    
    // static methods
    
    
    
    public static void main(String[] args) {
        
        Player player = new Player();
        HealingPotion healpot = new HealingPotion();
        
        while (Player.playerHP > 0) {
        System.out.println( player.getPlayerHP() + " hit points");
        healpot.modHP(-3);
        }
        
        System.out.println("You die!");
        
    }
}
