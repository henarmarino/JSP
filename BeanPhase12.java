package p3;

import p3.*;
import java.io.*;
import java.util.ArrayList;

//This class is for getting the password, country and the list of albums of a given country to display them on the screen (JSP)
public class BeanPhase12 {

    //The attributes of the bean. The arraylist with all albums of a given country, the country and the password
    private ArrayList<Album> listAlbums= new ArrayList<Album>();
    private String country;
    private String password;

    //The constructor
    public BeanPhase12(){

    }    

    //Getters and setters of the attributes of the bean
    public ArrayList<Album> getListAlbums() { 
        //Calling the dataModel class to get the list of all albums of a given country 
        listAlbums=DataModel.getQ1Albums(country);
        return listAlbums; 
    }

    public void setListAlbums(ArrayList<Album> albums) {
        listAlbums=albums;
    }  

    public String getCountry() { 
        return country; 
    }

    public void setCountry(String country) {
        this.country=country;
    }

    public String getPassword() { 
        return password; 
    }

    public void setPassword(String password) {
        this.password=password;
    }
}