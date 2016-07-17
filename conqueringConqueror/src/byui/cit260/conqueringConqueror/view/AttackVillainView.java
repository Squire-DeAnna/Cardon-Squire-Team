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
            
            default:
                this.console.println("Invalid option");
                break;
        }
        return false;
    }

    private void sword() {
        Weapons weapons = new Weapons();
        Player player = new Player();
        Villain villain = new Villain();
        
        this.console.println(player.getName() + " \nhas chossen to attack" + villain.getName() +  "with the sword");  
        this.console.println("\nThe sword does 8 attack damage" );
            if(villain.getHealth() != 0 ){
                weapons.setWeaponsType(WeaponsType.Axe);
                weapons.setAttackDamage(8);
                villain.setHealth(5);
                this.console.println("\n The villains health is " + villain.getHealth());
            }else{
                this.console.println("\n You have defeated the villain ");
            }
        
    }

    private void axe() {
        Weapons weapons = new Weapons();
        Player player = new Player();
        Villain villain = new Villain();
        
        this.console.println(player.getName() + " \nhas chossen to attack" + villain.getName() +  "with the axe");  
        this.console.println("The axe does 6 attack damage" );
            if(villain.getHealth() != 0 ){
                weapons.setWeaponsType(WeaponsType.Axe);
                weapons.setAttackDamage(6);
                villain.setHealth(3);
                this.console.println("\n The villains health is " + villain.getHealth());
            }else{
                this.console.println("\n You have defeated the villain ");
            }
    }

    private void knife() {
        Weapons weapons = new Weapons();
        Player player = new Player();
        Villain villain = new Villain();
        
        this.console.println(player.getName() + " \nhas chossen to attack" +villain.getName() +  "with the knife");  
        this.console.println("The knife does " + weapons.getAttackDamage() + " attack damage" );
            if(villain.getHealth() != 0 ){
                weapons.setWeaponsType(WeaponsType.Knife);
                weapons.setAttackDamage(4);
                villain.setHealth(2);
                this.console.println("\n The villains health is " + villain.getHealth());
            }else{
                this.console.println("\n You have defeated the villain ");
            }
    }

    private void fists() {
        Weapons weapons = new Weapons();
        Player player = new Player();
        Villain villain = new Villain();
        
        this.console.println( player.getName() + " \nhas chossen to attack" + villain.getName() +  "with the fists");  
        this.console.println("The fists does " + weapons.getAttackDamage() + " attack damage" );
            if(villain.getHealth() != 0 ){
                weapons.setWeaponsType(WeaponsType.fists);
                weapons.setAttackDamage(2);
                villain.setHealth(.5);
                this.console.println("\n The villains health is " + villain.getHealth());
            }else{
                this.console.println("\n You have defeated the villain ");
            }
    }
}
