package com.pattern.designpatterns.behavioral.chainresponsibilty.server;

import com.pattern.designpatterns.behavioral.chainresponsibilty.middleware.MiddleWare;

import java.util.HashMap;
import java.util.Map;

public class Server {
    private Map<String,String> users=new HashMap<>();
    private MiddleWare middleWare;

    public void setMiddleWare(MiddleWare middleWare) {
        this.middleWare = middleWare;
    }
    public boolean logIn(String email,String password){
        if (middleWare.check(email, password)){
            System.out.println("Authorization have been successful!");
        return true;
        }
        return false;
    }
    public void register(String email,String password){
        users.put(email, password);
    }
    public boolean hasEmail(String email){
        return users.containsKey(email);
    }
    public boolean isValidPassword(String email,String password){
        return users.get(email).equals(password);
    }
}
