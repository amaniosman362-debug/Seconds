
package vu.timeconverter;
import java.util.Scanner;
public class TimeConverter {
    public static void main(String[] args) {
        Scanner Save = new Scanner(System.in);
        System.out.println("Enter total seconds");
        int totalSeconds = Save.nextInt();
        int minutes = totalSeconds / 60;
        int Seconds = totalSeconds % 60; 
        System.out.println (totalSeconds + "Seconds is minutes minutes and " + Seconds + " Seconds"); 
        
    Save.close();
    }
}
