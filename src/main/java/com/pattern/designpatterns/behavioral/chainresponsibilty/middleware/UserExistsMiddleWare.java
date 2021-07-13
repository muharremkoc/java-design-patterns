package com.pattern.designpatterns.behavioral.chainresponsibilty.middleware;

import com.pattern.designpatterns.behavioral.chainresponsibilty.server.Server;

public class UserExistsMiddleWare extends MiddleWare{
    private Server server;

    public UserExistsMiddleWare(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
if (!server.hasEmail(email)){
    System.out.println("This email is not registered!");
    return false;
}
if (!server.isValidPassword(email,password)){
    System.out.println("Wrong Password");
    return false;
}
return checkNext(email,password);
    }
}
