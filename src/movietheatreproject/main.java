/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package movietheatreproject;

import java.util.*;

/**
 *
 * @author SPH_SHSM
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        ArrayList<Theatre> t = setUp();
        //Welcome to movieX, ask user what cinema to go to
        System.out.println("Welcome to MovieX. There are currently two cinemas near you. Type in the cinema to see its available movies and its showtimes.");
        int counter=1;
        for (Theatre temp:t){
            System.out.println(counter+") "+temp.name);
            counter++;
        }
        System.out.println("Which theatre do you want? Enter the number");
        int choice=in.nextInt()-1;
        t.get(choice).displayShows();
        
        System.out.println("What movie do you want to see?");
        
                    
                }
            } else {
                int choice3 = in.nextInt()-1;
                System.out.println();
            }
//        System.out.println("Enter something");
//        String input=in.nextLine();
//        try{
//            int value=Integer.parseInt(input);
//            System.out.println("You entered an int with a value of "+value);
//        } catch (NumberFormatException e){
//            System.out.println("You entered a string with a value of "+input);
//        }
        

    }

    public static ArrayList<Theatre> setUp() {
        ArrayList<Theatre> t = new ArrayList<>();
        Theatre SouthKeys = new Theatre("South Keys");
        SouthKeys.shows = new Movie[3];
        SouthKeys.shows[0] = new Movie("Halloween Kills", new String[]{"7:00pm", "9:30pm"}, new int[]{150, 150});
        SouthKeys.shows[1] = new Movie("Eternals", new String[]{"7:00pm", "9:30pm"}, new int[]{150, 150});
        SouthKeys.shows[2] = new Movie("Last Night in Soho", new String[]{"11:30"}, new int[]{150, 150});
        t.add(SouthKeys);
        Theatre Scotia = new Theatre("ScotiaBank Place");
        t.add(Scotia);
        return t;
    }

}
