package com.mycompany;

import java.util.Calendar;
import java.util.Date;

import javax.swing.JMenuItem;

public class Rano {
    public JMenuItem cityName;
    public int bidon = 0;
    public String timeEstimation= "";

    public Rano(JMenuItem cityName){
        this.cityName=cityName;
    }
    

    //getters
    public JMenuItem getCityName(){return cityName;}
    public int getBidon(){return bidon;}
    public String getEstimation(){
        Date date = new Date();
        Calendar calendar= Calendar.getInstance();
        calendar.setTime(date);
        int minutes=calendar.get(Calendar.MINUTE) + bidon * 2;
        String message=("Your bidon will be full at" + calendar.get(Calendar.DATE)+ " at " + calendar.get(Calendar.HOUR) + ": " + minutes + " mn.");

        return message  ;
    }

    public void addBidon(int nb){
        bidon+=nb;
    }





    
}
