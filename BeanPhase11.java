package p3;

import p3.*;
import java.io.*;
import java.util.ArrayList;
import javax.xml.parsers.*;
import javax.xml.xpath.*;
import java.util.*;
import org.xml.sax.*;

//This class is for getting the password and list of found countries to display them on the screen (JSP)
public class BeanPhase11 {

    //The attributes of the bean. The arraylist with all found countries and the password
    private ArrayList<String> listCountries= new ArrayList<String>();
    private String password;

    //The constructor
    public BeanPhase11() {

    }    

    //Getters and setters of the attributes of the bean
    public ArrayList<String> getListCountries() throws ParserConfigurationException, SAXException, IOException, XPathExpressionException{           
        //Calling the dataModel class to get the list of countries
        listCountries =DataModel.getQ1Countries();       
        return listCountries;     
    }
    
    public void setListCountries(ArrayList<String> countries) {
        listCountries=countries;
    }

    public String getPassword() { 
        return password; 
    }

    public void setPassword(String password) {
        this.password=password;
    }
    
}