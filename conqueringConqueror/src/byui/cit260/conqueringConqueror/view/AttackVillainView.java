/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.view;

import byui.cit260.conqueringConqueror.model.Game;
import byui.cit260.conqueringConqueror.model.Player;
import byui.cit260.conqueringConqueror.model.Villain;
import byui.cit260.conqueringConqueror.model.Weapons;
import byui.cit260.conqueringConqueror.model.WeaponsType;
import static conqueringconqueror.ConqueringConqueror.getPlayer;

/**
 *
 * @author Jason
 */
public class AttackVillainView extends View {
     public AttackVillainView(){
    
              super("\n************************************"
            + "\n|             Attack               |"
            + "\n************************************"
            + "\nS - Attack Enemy with Sword"
            + "\nA - Attack Enemy With Axe" 
            + "\nK - Attack Enemy With Knife"  
            + "\nF - Attack Enemy With Fists"  );
    }
   
     @Override
    public boolean doAction(String selection) {
        
        char charSel = selection.toUpperCase().charAt(0);
        
        switch(charSel){
            case 'S':
                sword();
                break;
            case 'A':
                axe();
                break;
            case 'K':
                knife();
                break;
            case 'F':
                fists();
                break;
            case 'Q':
                return true;
            default:
                this.console.println("Invalid option");
                break;
        }
        return false;
    }

    private void sword() {
        Weapons weapons = new Weapons();
        weapons.setWeaponsType(WeaponsType.Sword);
        weapons.setAttackDamage(8);
        Player player = new Player();
        Villain villain = new Villain();
        villain.setName(displayMessage);
        villain.setHealth(5);
        villain.setAttackPoints(15);
        double i = villain.getHealth();
        this.console.println(getPlayer().getName() + " has chossen to attack" + villain.getName() +  "with the sword");  
        this.console.println("\nThe sword does 8 attack damage" );
            while(i <= 0 ){
                this.console.println("\n The villains health is " + villain.getHealth());
                i++;
            }
                this.console.println("\n You have defeated the villain ");
            
        
    }

    private void axe() {
        Weapons weapons = new Weapons();
        weapons.setWeaponsType(WeaponsType.Axe);
        weapons.setAttackDamage(6);
        Player player = new Player();
        Villain villain = new Villain();
        villain.setName(displayMessage);
        villain.setHealth(5);
        villain.setAttackPoints(15);
        double i = villain.getHealth();
        this.console.println(getPlayer().getName() + " \nhas chossen to attack" + villain.getName() +  "with the axe");  
        this.console.println("The axe does 6 attack damage" );
            while(i <= 0 ){
                this.console.println("\n The villains health is " + villain.getHealth());
                i++;
            }
                this.console.println("\n You have defeated the villain ");
            
    }

    private void knife() {
        Weapons weapons = new Weapons();
         weapons.setWeaponsType(WeaponsType.Knife);
         weapons.setAttackDamage(4);
        Player player = new Player();
        Villain villain = new Villain();
        villain.setName(displayMessage);
        villain.setAttackPoints(5);
        villain.setHealth(15);
        double i = villain.getHealth();
        this.console.println(getPlayer().getName() + " \nhas chossen to attack" +villain.getName() +  "with the knife");  
        this.console.println("\n The" + weapons.getWeaponsType() + " does " + weapons.getAttackDamage() + " attack damage" );
            while(i <= 0 ){
                this.console.println("\n The villains health is " + villain.getHealth());
                i++;
            }
                this.console.println("\n You have defeated the villain ");
            }
    

    private void fists() {
        Weapons weapons = new Weapons();
        weapons.setAttackDamage(2);
        weapons.setWeaponsType(WeaponsType.Fists);
        Player player = new Player();
        Villain villain = new Villain();
        villain.setName(displayMessage);
        villain.setHealth(15);
        villain.setAttackPoints(5);
         double i = villain.getHealth();
        this.console.println(getPlayer().getName() + " \nhas chossen to attack" + villain.getName() +  "with the" + weapons.getWeaponsType());  
        this.console.println("The " + weapons.getWeaponsType() + " does " + weapons.getAttackDamage() + " attack damage" );
            while(i <= 0 ){
              
                this.console.println("\n The villains health is " + villain.getHealth());
                i++;
            }
                this.console.println("\n You have defeated the villain ");
            
    }
}
