/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.seniorsolutions.activelife.backend.protocol.user;

import com.google.gson.GsonBuilder;
import com.seniorsolutions.activelife.backend.protocol.Response;

/**
 *
 * @author man
 */
public class UserLoginSuccess extends Response {

    private String SessionID = "";

    public String getSessionID() {
        return SessionID;
    }

    public void setSessionID(String SessionID) {
        this.SessionID = SessionID;
    }
    
    
    public UserLoginSuccess() 
    {
        super.setObjectType("Response");
        super.setObjectSubType("LoginSuccess");
        //setSessionID(SessionID);
    }
    
}
