package sharafutdinov.artur.iam;

import javax.sound.midi.Sequence;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by first on 26.04.17.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        /*Snils snils = new Snils();
        if(snils.equalsArr("46-56", "46 56"))
            System.out.println("yes");
        else
            System.out.println("no");*/
        //new IterCSV().csvValue("/home/first/SNILS_SKL.csv", "/home/first/snils_03_2017.csv");
        //new IterCSV().csvValue("/home/first/a.csv", "/home/first/s.csv");
        System.out.println(new IterCSV().csvValue("/home/first/ss.csv"));






        // System.out.println(new IterCSV().val("/home/first/SNILS_TSP1.csv", 1000));

        //int s1 = Integer.parseInt(new IterCSV().val("/home/first/SNILS_TSP1.csv", 900000));
        //if (s==s1)
        //   System.out.println(s);
        //new IterCSV().csvParser("/home/first/snils_03_2017.csv");


        //System.out.println(s);


    }
}

