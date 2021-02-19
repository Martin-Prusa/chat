package com.company;

import java.io.*;
import java.util.ArrayList;

public class Data {
    public static ArrayList<String> prectiZpravy() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("message.txt"));
            String nextLine = br.readLine();
            ArrayList<String> zpravy = new ArrayList<>();
            zpravy.add(nextLine);
            while(nextLine != null) {
                nextLine = br.readLine();
                zpravy.add(nextLine);
            }
            br.close();
            return zpravy;
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }

    public static void ulozZpravy(ArrayList<String> zpravy, String name) {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("message.txt", true));
            for (String s : zpravy) {
                bw.write(name+": "+s);
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            System.exit(1);
        }
    }
}
