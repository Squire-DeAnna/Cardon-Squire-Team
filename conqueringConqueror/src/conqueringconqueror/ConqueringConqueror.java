/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conqueringconqueror;

import byui.cit260.conqueringConqueror.model.Game;
import byui.cit260.conqueringConqueror.model.Hero;
import byui.cit260.conqueringConqueror.model.Item;
import byui.cit260.conqueringConqueror.model.Location;
import byui.cit260.conqueringConqueror.model.Map;
import byui.cit260.conqueringConqueror.model.Player;
import byui.cit260.conqueringConqueror.model.Villain;
import byui.cit260.conqueringConqueror.view.ErrorView;
import byui.cit260.conqueringConqueror.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author deannasquire
 */
public class ConqueringConqueror {
    
    private static Player player;
    private static Game game;
    private static Villain villain;
    private static   List<Villain> villains;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      try {
          
        // open character stream files for end user input and output
        ConqueringConqueror.inFile = new BufferedReader(new InputStreamReader(System.in));
        ConqueringConqueror.outFile = new PrintWriter(System.out, true);
        
        // open log file
        String filePath = "log.txt";
        ConqueringConqueror.logFile = new PrintWriter(filePath);
          
        StartProgramView startProgram = new StartProgramView();
        startProgram.startProgram(); 
        return;
         
      } catch (Throwable e) {
          
          System.out.println("Exception: " + e.toString() +
                             "\nCause: " + e.getCause() +
                             "\nMessage: " + e.getMessage());
          
          e.printStackTrace();
      }
      
      finally {
          try {
              if (ConqueringConqueror.inFile != null)
                  ConqueringConqueror.inFile.close();
              
              if (ConqueringConqueror.outFile != null)
                  ConqueringConqueror.outFile.close();
              
              if (ConqueringConqueror.logFile != null)
                  ConqueringConqueror.logFile.close();
          } catch (IOException ex) {
              System.out.println("Error reading input: ");
              return;
          }
      }
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        ConqueringConqueror.logFile = logFile;
    }
    
    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        ConqueringConqueror.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        ConqueringConqueror.inFile = inFile;
    }
    

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        ConqueringConqueror.player = player;
    }

    public static Game getGame() {
        return game;
    }

    public static void setGame(Game game) {
        ConqueringConqueror.game = game;
    }

    public static Villain getVillain() {
        return villain;
    }

    public static void setVillain(Villain villain) {
        ConqueringConqueror.villain = villain;
    }

    public static List<Villain> getVillains() {
        return villains;
    }

    public static void setVillains(List<Villain> villains) {
        ConqueringConqueror.villains = villains;
    }
    
    
}
    
