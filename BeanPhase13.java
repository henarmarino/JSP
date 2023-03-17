package p3;

import p3.*;
import java.io.*;
import java.util.ArrayList;

//This class is for getting the password, country, aid and the list of songs of a given country and aid to display them on the screen (JSP)
public class BeanPhase13 {

    //The attributes of the bean. The arraylist with all songs of a given country and aid, the country, the aid and the password
    private ArrayList<Song> listSongs;
    private String country;
    private String aid;
    private String password;

    //The constructor
    public BeanPhase13(){

    }    

    //Getters and setters of the attributes of the bean
    public ArrayList<Song> getListSongs() { 
        //Calling the dataModel class to get the list of all songs of a given country and album (aid) 
        listSongs =DataModel.getQ1Songs(country, aid);
        return listSongs; 
    }

    public void setListSongs(ArrayList<Song> songs) {
        listSongs=songs;
    }

    public String getCountry() { 
        return country; 
    }

    public void setCountry(String country) {
        this.country=country;
    }

    public String getAid() { 
        return aid; 
    }

    public void setAid(String aid) {
        this.aid=aid;
    }

    public String getPassword() { 
        return password; 
    }

    public void setPassword(String password) {
        this.password=password;
    }
}