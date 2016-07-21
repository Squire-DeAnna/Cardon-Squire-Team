/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.view;

import byui.cit260.conqueringConqueror.control.QuestionControl;
import byui.cit260.conqueringConqueror.model.Location;
import conqueringconqueror.ConqueringConqueror;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author deannasquire
 */
public class RecruitHeroView extends View {

    private int area;
    protected final BufferedReader keyboard = ConqueringConqueror.getInFile();
    protected final PrintWriter console = ConqueringConqueror.getOutFile();

    public RecruitHeroView() {
        Random r = new Random();
        area = r.nextInt(50) + 50;
    }

    public void display() {
        String heroName = ConqueringConqueror.getPlayer().getLocation().getHero().getName();
        this.console.println("\n************************************"
                + "\n|          Save the Hero           |"
                + "\n************************************"
                + "\nYou have found " + heroName + " in need of help!"
                + "\nTo rescue them, you must enter the two bases and height of a "
                + "\ntrapezoid in order to calculate it's area. It's area is " + area
                + "\nPlease enter the numbers below."
        );
        try {//Jason added try catch 7/9/2016
            getNumbers();
        } catch (IOException ex) {
            Logger.getLogger(RecruitHeroView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void getNumbers() throws IOException {// jason added ioexception 7/9/2016
        //Scanner in = new Scanner(System.in);
        int base1 = 0;
        int base2 = 0;
        int height = 0;
        boolean keepTrying = false;
        do {
            try {
                this.console.println("Enter the First Base");
                base1 = Integer.parseInt(this. keyboard.readLine());
                this.console.println("Enter the Second Base");
                base2 = Integer.parseInt(this.keyboard.readLine());
                this.console.println("Enter the Height");
                height = Integer.parseInt(this.keyboard.readLine());
            } catch (NumberFormatException nfe) {
                this.console.println("Please enter numbers only");
            }
            QuestionControl qc = new QuestionControl();
            double playerAnswer = qc.calcAreaTrapezoid(base1, base2, height);
            if ((int) playerAnswer == area) {
                //success
                this.console.println("You have answered successfully!");
                keepTrying = false;
                Location currentLocation = ConqueringConqueror.getPlayer().getLocation();
                ConqueringConqueror.getPlayer().addHero(currentLocation.getHero());
                currentLocation.setHero(null);
            } else {
                this.console.println("That is incorrect. Do you want to try again?"
                +"\nY - Yes"
                +"\nN - No");
                if (this.keyboard.readLine().toUpperCase().charAt(0) == 'Y'){
                    keepTrying = true;
                } else {
                    keepTrying = false;
                }
                
            }

        } while (keepTrying);

    }

    public boolean doAction(String selection) {

        return true;
    }

}
