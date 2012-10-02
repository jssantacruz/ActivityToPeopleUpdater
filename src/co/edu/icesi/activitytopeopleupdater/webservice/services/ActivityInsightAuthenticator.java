/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.icesi.activitytopeopleupdater.webservice.services;

import co.edu.icesi.activitytopeopleupdater.core.ConfigurationManager;
import java.io.IOException;
import java.net.Authenticator;
import java.net.PasswordAuthentication;

/**
 *
 * @author 1130619373
 */
public class ActivityInsightAuthenticator extends Authenticator{
    private static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ActivityInsightAuthenticator.class);
    private static String username;
    private static String password;
    
    static 
    {
        username = ConfigurationManager.getProperty("webservices.username");                  
        password = ConfigurationManager.getProperty("webservices.password");
    }
    
    private static ActivityInsightAuthenticator singleton = new ActivityInsightAuthenticator();
    
    private ActivityInsightAuthenticator(){}
    
    public static void login() throws IOException 
    {
        if (!isValidUsernamePassword()) 
        {
            throw new IOException("Invalid username and password");
        }
        
        Authenticator.setDefault(singleton);
    }
    
    private static boolean isValidUsernamePassword() {
        return (username != null && username.length() > 0
                && password != null && password.length() > 0);
    }
    
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(username, password.toCharArray());
    }

}
