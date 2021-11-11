/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movietheatreproject;

/**
 *
 * @author SPH_SHSM
 */
public class Movie {
    String title;
    String[] showTimes;
    int[] ticketsLeft;


    public Movie(String title, String[] showTimes, int[] ticketsLeft) {
        this.title = title;
        this.showTimes = showTimes;
        this.ticketsLeft = ticketsLeft;
    }
    
    
    
    public void DisplayTimes(){
        //loop through each showtime and print them
        int counter = 1;
        System.out.println(counter+": "+title);
        for (String s:showTimes){
            System.out.println(s+"\t");
        }
        System.out.println("\n");
        counter++;
    }
}
