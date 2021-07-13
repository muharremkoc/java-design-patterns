package com.pattern.designpatterns.behavioral.chainresponsibilty.middleware;

public class RoleCheckMiddleWare extends MiddleWare{
    @Override
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")){
            System.out.println("Hello Muharrem");
            return true;
        }
        System.out.println("Hello,Other");

        return checkNext(email,password);
    }
}
