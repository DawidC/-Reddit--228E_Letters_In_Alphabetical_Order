/**
 * Created by Dawid on 19.08.2015.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class letters {
    public static void main(String[] args) throws FileNotFoundException{
        System.out.println("[Reddit] Challenge #228 Letters In Alphabetical Order");

        File plik = new File("input.txt");
        Scanner sc = new Scanner(System.in);
        Scanner splik = new Scanner(plik);
        String zdanie=" ";
        String wynik="0";
        while(splik.hasNextLine()){
            zdanie = splik.nextLine();
            int dl = zdanie.length();
            //od 97 do 122 - male litery
            char[] str = zdanie.toCharArray();
            System.out.print(zdanie);
            System.out.print(" ");
            for(int i=0;i<dl;i++){
                System.out.print(str[i]);

            }
            //System.out.print(str[0] + " ");

            System.out.println(wynik);
        }
    }
}
