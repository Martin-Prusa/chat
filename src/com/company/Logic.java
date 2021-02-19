package com.company;

import java.util.ArrayList;

public class Logic {
    public static void start(){
        String name = Gui.start();
        Gui.displayMessage(Data.prectiZpravy());
        ArrayList<String> list = new ArrayList<>();
        String newMessage = Gui.newMessage();
        if(newMessage.equals("!konec")) System.exit(0);
        list.add(newMessage);
        System.out.println(newMessage);
        while(true) {
            newMessage=Gui.newMessage();
            if(newMessage.equals("!konec")) break;
            list.add(newMessage);
            System.out.println(newMessage);
        }
        Data.ulozZpravy(list, name);
    }

}
