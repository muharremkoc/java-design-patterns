package com.pattern.designpatterns.behavioral.templatemethod.networks;

public  abstract class Network {
   String userName;
   String password;


    public Network() {
    }
    public boolean post(String message){
        if (logIn(this.userName,this.password)){
            boolean result=sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }
    abstract boolean logIn(String userName,String password);
    abstract boolean sendData(byte[] data);
    abstract void logOut();
}
