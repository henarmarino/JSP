package p3;

import p3.*;
import java.io.*;
import java.util.ArrayList;
import javax.xml.parsers.*;
import javax.xml.xpath.*;
import java.util.*;

//This class is for getting the password, errors and fatalerrors files to display them on the screen (JSP)
public class BeanPhase02 {

    //The attributes of the bean. The arraylist with all the errors and fatalerrors files and the password
    private ArrayList<String> fatalErrorsFile= new ArrayList<String>();
    private ArrayList<String> errorsFile= new ArrayList<String>();
    private String password;

    //The constructor
    public BeanPhase02(){

    }    

    //Getters and setters of the attributes of the bean
    public ArrayList<String> getErrorsFiles(){
        //To get the error files from the DataModel class. We can call the DataModel class without an object because it is a static class.
        errorsFile=DataModel.getErrorsFiles();
        return errorsFile;
    }
    
    public void setErrorsFiles(ArrayList<String> errors){
        errorsFile= errors;
    }
    
    public ArrayList<String> getFatalErrorsFiles(){
        //To get the fatal error files from the DataModel class
        fatalErrorsFile=DataModel.getFatalErrorsFiles();
        return fatalErrorsFile;
    }
    
    public void setFatalErrorsFiles(ArrayList<String> fatalErrors){
        fatalErrorsFile=fatalErrors;
    }

    public String getPassword() { 
        return password; 
    }

    public void setPassword(String password) {
        this.password=password;
    }


}