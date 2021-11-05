/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movietheatreproject;

/**
 *
 * @author SPH_SHSM
 */
public class Theatre {
    Movie[] shows;

    public Theatre() {
        shows= new Movie[3];
        shows[0]=new Movie();
        shows[0].showTimes=new String[] {"7:00", "9:30"};
        shows[0].ticketsLeft=new int[] {150,150};
        shows[0].title = "Halloween Kills";
        shows[1]=new Movie();
        shows[1].title="Eternals";
        shows[1].showTimes=new String[] {"5:00","7:00","9:00"};
        shows[1].ticketsLeft=new int[]{300,300,300};
        shows[2]=new Movie();
        shows[2].title="Last Night in Soho";
        shows[2].showTimes=new String[] {"11:30"};
        shows[2].ticketsLeft=new int[]{100};
    }
    
    public void displayShows(){
        int counter=1;
        for (Movie m:shows){
            System.out.println(counter+": "+m.title);
            for (String s:m.showTimes){
                System.out.print(s+"\t");
            }
            System.out.println("\n");
            counter++;
        }
    }
    
    
}
