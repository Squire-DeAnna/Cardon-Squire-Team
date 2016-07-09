/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.control;

import byui.cit260.conqueringConqueror.model.Food;
import byui.cit260.conqueringConqueror.model.Game;
import byui.cit260.conqueringConqueror.model.Item;
import conqueringconqueror.ConqueringConqueror;
import exception.GameControlException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;

/**
 *
 * @author deannasquire
 */
public class GameControl {
  
    public static void saveCurrentGame(Game game, String filepath)
            throws GameControlException {
        
        try( FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game); // write the game object out to file
        } catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }
    
    public static void getSavedGame(String filepath)
            throws GameControlException {
        Game game = null;
        
        try( FileInputStream fips = new FileInputStream(filepath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject(); // read the game object from file
        } catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
        
        // close the output file
        ConqueringConqueror.setGame(game); // save in Conquering the Conqueror
    }
    
    /**
     *
     * @param Foodlist
     * @param outputLocation
     */
    public static void printFoodReport(ArrayList<Food> Foodlist, String outputLocation) throws FileNotFoundException{
         try(PrintWriter out = new PrintWriter(outputLocation)){
         //Print title and column headings
         out.println("\n\n               Food Report                ");
         out.printf("%n%-20s%10s%10s", "Description", "Quantity", "Strength");
         out.printf("%n%-20s%10s%10s", "-----------", "--------.", "-------");
         
         //print the description, quantity and strength of each food item
         for (Food food : Foodlist){
             out.printf("%n%-20s%20s%13.2f", food.getDescription()
                                            ,food.getName()
                                            ,food.getHealthIncrease());
         }
        
             }catch (IOException ex){
                 System.out.println("I/O Error: " + ex.getMessage());
             }

        
    }       
}