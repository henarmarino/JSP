package p3;

import p3.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.*;
import java.util.Map;
import java.util.HashMap;
import java.net.*;
import org.w3c.dom.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;


//This class has two methods. The init that calls the method that parsers the files and classifies them into error, fatalerror and correct files 
//The second method is the doGet() that calls all the JSP pages with the objective of showing all the screens in browser mode
public class Sint183P3 extends HttpServlet {

    //To call the methods that are in the DataModel class
    DataModel dataModel= new DataModel();
    //The correct password that is going to be compared with the password entered
    private final static String goodPasswd = "HenymSINT9";

    //It calls the method that parsers the files and classifies them into error, fatalerror and correct files
    public void init(){
  
        try{
            //Calling the method to parse all the files
            dataModel.parserDocs();
            }catch(Exception e){

            }
    }
    
    //It calls all the JSP pages with the objective of showing all the screens in browser mode
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        
        try{
            //To create a servlet context to call the JSP of the screen
            ServletContext sc = getServletContext();
            PrintWriter out = res.getWriter(); 
            //To collect all the parameters that will determined the correct screen
            //The password entered
            String passwd= req.getParameter("p");
            //The phase entered
            String pphase= req.getParameter("pphase");
            //The country entered
            String country = req.getParameter("pcountry");
            //The aid of the album entered
            String paid= req.getParameter("paid");
            //To pass the parameter that is missing 
            String countryMissingString= "pcountry";
            String aidMissingString= "paid";
            //To call the beans of each phase
            BeanPhase01 beanPhase01= new BeanPhase01();
            BeanPhase02 beanPhase02= new BeanPhase02();
            BeanPhase11 beanPhase11= new BeanPhase11();
            BeanPhase12 beanPhase12= new BeanPhase12();
            BeanPhase13 beanPhase13= new BeanPhase13();
            BeanParamMissing beanParamMissing= new BeanParamMissing();

            RequestDispatcher paramMissing;
            RequestDispatcher pphase01;
            //Here the parameters are analyzed to call the correct JSP page and the correct method of the DataModel class
            //There is no password
            if(passwd== null){  
                //Calling the JSP of the correct screen
                RequestDispatcher pMissing = sc.getRequestDispatcher("/PMissing.jsp");
                //Passing the request and response
                pMissing.forward(req,res);
                
            //The password is wrong
            }else if(!(passwd.equals(goodPasswd))){ 
                //Calling the JSP of the correct screen
                RequestDispatcher pWrong = sc.getRequestDispatcher("/PWrong.jsp");
                //Passing the request and response
                pWrong.forward(req,res);

            //The pphase is null, so there is no pphase and the initial screen is called
            }else if(pphase==null){  
                //Passing the password to the bean
                beanPhase01.setPassword(passwd);
                //Passing the bean to the request
                req.setAttribute("beanPhase01",beanPhase01);
                //Calling the JSP of the correct screen
                pphase01 = sc.getRequestDispatcher("/Pphase01.jsp");
                //Passing the request and response
                pphase01.forward(req,res);

            }else{
                //The value of the pphase is analyzed
                switch(pphase){

                    //The pphase is 01, so the initial screen is called
                    case "01":  
                        //Passing the password to the bean
                        beanPhase01.setPassword(passwd);
                        //Passing the bean to the request
                        req.setAttribute("beanPhase01",beanPhase01);
                        //Calling the JSP of the correct screen
                        pphase01 = sc.getRequestDispatcher("/Pphase01.jsp");
                        //Passing the request and response
                        pphase01.forward(req,res);
                        break;

                    //The pphase is 02, so the screen with all the error and fatalerror filles is called
                    case "02": 
                        //Passing the password to the bean
                        beanPhase02.setPassword(passwd);
                        //Passing the bean to the request
                        req.setAttribute("beanPhase02", beanPhase02);
                        //Calling the JSP of the correct screen
                        RequestDispatcher pphase02 = sc.getRequestDispatcher("/Pphase02.jsp");
                        //Passing the request and response
                        pphase02.forward(req,res);
                        break;

                    //The pphase is 11, so the screen with all the countries is called
                    case "11":
                        //Passing the password to the bean
                        beanPhase11.setPassword(passwd);
                        //Passing the bean to the request
                        req.setAttribute("beanPhase11", beanPhase11);
                        //Calling the JSP of the correct screen
                        RequestDispatcher pphase11 = sc.getRequestDispatcher("/Pphase11.jsp");
                        //Passing the request and response
                        pphase11.forward(req,res);
                        break;

                    //The pphase is 12, so the screen with all the albums of a given country is called
                    case "12":
                        //A compulsory parameter (pcountry) is missing
                        if(country == null){ 
                            //Passing the parameter missing
                            beanParamMissing.setParam(countryMissingString);
                            //Passing the bean to the request
                            req.setAttribute("beanParamMissing", beanParamMissing);
                            //Calling the JSP of the correct screen
                            paramMissing = sc.getRequestDispatcher("/ParamMissing.jsp");
                            //Passing the request and response
                            paramMissing.forward(req,res);
                        } 
                        else {
                            //The parameter pcountry is not null. We use it to get the albums of this country calling the method getQ1Albums of the DataModel class
                            //Passing the password to the bean
                            beanPhase12.setPassword(passwd);
                            beanPhase12.setCountry(country);
                            //Passing the bean to the request
                            req.setAttribute("beanPhase12", beanPhase12);
                            //Calling the JSP of the correct screen
                            RequestDispatcher pphase12 = sc.getRequestDispatcher("/Pphase12.jsp");
                            //Passing the request and response
                            pphase12.forward(req,res);
                        }
                        break;

                    //The pphase is 13, so the screen with all the songs of a given country and aid is called
                    case "13": 
                        //A compulsory parameter (pcountry) is missing
                        if((country == null)){ 
                            //Passing the parameter missing
                            beanParamMissing.setParam(countryMissingString);
                            //Passing the bean to the request
                            req.setAttribute("beanParamMissing", beanParamMissing);
                            //Calling the JSP of the correct screen
                            paramMissing = sc.getRequestDispatcher("/ParamMissing.jsp");
                            //Passing the request and response
                            paramMissing.forward(req,res);

                        //A compulsory parameter (paid) is missing
                        } else if((paid==null)){
                            //Passing the parameter missing
                            beanParamMissing.setParam(aidMissingString);
                            //Passing the bean to the request
                            req.setAttribute("beanParamMissing", beanParamMissing);
                            //Calling the JSP of the correct screen
                            paramMissing = sc.getRequestDispatcher("/ParamMissing.jsp");
                            //Passing the request and response
                            paramMissing.forward(req,res);
                        }else {
                            //The parameters pcountry and paid are not null. We use them to get the songs of this country and this aid calling the method getQ1Songs of the DataModel class
                            //Passing the password to the bean
                            beanPhase13.setPassword(passwd);
                            beanPhase13.setAid(paid);
                            beanPhase13.setCountry(country);
                            //Passing the bean to the request
                            req.setAttribute("beanPhase13", beanPhase13);
                            //Calling the JSP of the correct screen
                            RequestDispatcher pphase13 = sc.getRequestDispatcher("/Pphase13.jsp");
                            //Passing the request and response
                            pphase13.forward(req ,res);
                        }
                        break;
                } //end of the switch
            } //end of the else
        }catch(Exception e){
        
        }
    } //ed of the doGet() method
} //end of the Sint183P3 class
