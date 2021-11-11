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
    String name;

    public Theatre(String name) {
        this.name=name;
    }
    
    public void displayShows(){
        for (Movie m:shows){
            m.DisplayTimes();
        }
    }
    

    
//public class Theatre2{
//    Movie[] shows2;
//    
//    public Theatre2(){
//        shows2 = new Movie[3];
//        shows2[0] = new Movie();
//        shows2[0].showTimes2=new String[] {"7:15pm", "10:45pm"};
//        shows2[0].ticketsLeft2=new int[] {150,150};
//        shows2[0].title2 = "Suicide Squad";
//        shows2[1]=new Movie();
//        shows2[1].title2="Spiderman no way home";
//        shows2[1].showTimes2=new String[] {"5:30pm","8:20pm","11:25pm"};
//        shows2[1].ticketsLeft2=new int[]{300,300,300};
//        shows2[2]=new Movie();
//        shows2[2].title2="Demon Slayer: Infinite Train";
//        shows2[2].showTimes2=new String[] {"7:45pm","9:00pm"};
//        shows2[2].ticketsLeft2=new int[]{100};
//    }
//}
    
//    public void displayShows(){
//        int counter=1;
//        for (Movie m:shows){
//            System.out.println(counter+": "+m.title);
//            for (String s:m.showTimes){
//                System.out.print(s+"\t");
//            }
//            System.out.println("\n");
//            counter++;
//        }
//    }
    
    
    
}
