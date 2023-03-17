package p3;

import p3.*;
import java.io.*;
import java.util.ArrayList;
import javax.xml.parsers.*;
import javax.xml.xpath.*;
import java.util.*;

//This class is for getting the password to display it on the screen (JSP)
public class BeanPhase01 {

    //The attribute password
    private String password;

    //The constructor
    public BeanPhase01(){

    }    

    //Getter and setter of the attribute of the bean
    public String getPassword() { 
        return password; 
    }
    
    public void setPassword(String password) {
        this.password=password;
    }


}