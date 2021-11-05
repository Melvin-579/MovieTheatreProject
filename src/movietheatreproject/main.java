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
        ArrayList<Theatre> t=setUp();
        //Welcome to movieX, ask user what cinema to go to
        System.out.println("Welcome to MovieX. There are currently two cinemas near you. Type in the cinema to see its available movies and its showtimes.");
        char choice = in.nextLine().toLowerCase().charAt(0);
        //if SouthKeys continue
        if (choice == 's') {
            System.out.println("SouthKeys cinema");
            Theatre SouthKeys = new Theatre();
            SouthKeys.displayShows();
            System.out.println("");
        }

    }
    
    public static ArrayList<Theatre> setUp(){
        ArrayList<Theatre> t=new ArrayList<>();
        Theatre SouthKeys = new Theatre();
        SouthKeys.shows=new Movie[3];
        SouthKeys.shows[0]=new Movie("Halloween Kills",new String[]{"7:00pm","9:30pm"},new int[]{150,150});
        SouthKeys.shows[1]=new Movie("Eternals",new String[]{"7:00pm","9:30pm"},new int[]{150,150});
        t.add(SouthKeys);
        Theatre ScotiaBank = new Theatre();
        
        
    }
}