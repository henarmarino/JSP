package p3;

import p3.*;
import java.io.*;
import java.util.ArrayList;
import javax.xml.parsers.*;
import javax.xml.xpath.*;
import java.util.*;

//This class is for getting the parameter that is missing to display it on the screen (JSP)
public class BeanParamMissing {

    //The attribute parameter
    private String param;

    //The constructor
    public BeanParamMissing(){

    }    

    //Getter and setter of the attribute of the bean
    public String getParam() { 
        return param; 
    }

    public void setParam(String param) {
        this.param=param;
    }


}