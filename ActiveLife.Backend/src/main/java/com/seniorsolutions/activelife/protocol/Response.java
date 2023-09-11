/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.seniorsolutions.activelife.protocol;

/**
 *
 * @author q
 */
public class Response {
    
    
    private String objectType;
    
    private String objectSubType;
    
    private String debugMessage;

    
    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getObjectSubType() {
        return objectSubType;
    }

    public void setObjectSubType(String objectSubType) {
        this.objectSubType = objectSubType;
    }

    public String getDebugMessage() {
        return debugMessage;
    }

    public void setDebugMessage(String debugMessage) {
        this.debugMessage = debugMessage;
    }
  
    
}
