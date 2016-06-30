/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.conqueringConqueror.view;

import byui.cit260.conqueringConqueror.control.QuestionControl;
import byui.cit260.conqueringConqueror.model.Location;
import conqueringconqueror.ConqueringConqueror;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author deannasquire
 */
public class RecruitHeroView extends View {

    private int area;

    public RecruitHeroView() {
        Random r = new Random();
        area = r.nextInt(50) + 50;
    }

    public void display() {
        String heroName = ConqueringConqueror.getPlayer().getLocation().getHero().getName();
        System.out.println("\n************************************"
                + "\n|          Save the Hero           |"
                + "\n************************************"
                + "\nYou have found " + heroName + " in need of help!"
                + "\nTo rescue them, you must enter the two bases and height of a "
                + "\ntrapezoid in order to calculate it's area. It's area is " + area
                + "\nPlease enter the numbers below."
        );
        getNumbers();
    }

    public void getNumbers() {
        Scanner in = new Scanner(System.in);
        int base1 = 0;
        int base2 = 0;
        int height = 0;
        boolean keepTrying = false;
        do {
            try {
                System.out.println("Enter the First Base");
                base1 = Integer.parseInt(in.nextLine());
                System.out.println("Enter the Second Base");
                base2 = Integer.parseInt(in.nextLine());
                System.out.println("Enter the Height");
                height = Integer.parseInt(in.nextLine());
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter numbers only");
            }
            QuestionControl qc = new QuestionControl();
            double playerAnswer = qc.calcAreaTrapezoid(base1, base2, height);
            if ((int) playerAnswer == area) {
                //success
                System.out.println("You have answered successfully!");
                keepTrying = false;
                Location currentLocation = ConqueringConqueror.getPlayer().getLocation();
                ConqueringConqueror.getPlayer().addHero(currentLocation.getHero());
                currentLocation.setHero(null);
            } else {
                System.out.println("Do you want to try again?"
                +"\nY - Yes"
                +"\nN - No");
                if (in.nextLine().toUpperCase().charAt(0) == 'Y'){
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
