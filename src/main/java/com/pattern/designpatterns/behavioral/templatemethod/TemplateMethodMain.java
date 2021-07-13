package com.pattern.designpatterns.behavioral.templatemethod;

import com.pattern.designpatterns.behavioral.templatemethod.networks.Facebook;
import com.pattern.designpatterns.behavioral.templatemethod.networks.Network;
import com.pattern.designpatterns.behavioral.templatemethod.networks.Twitter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TemplateMethodMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        Network network=null;
        System.out.print("Input UserName:");
        String userName=reader.readLine();
        System.out.print("Input Password:");
        String password=reader.readLine();
        System.out.print("Input Message:");
        String message=reader.readLine();
        System.out.println("Choose Social Network for message:\n"+
                "1-Facebook\n"+
                "2-Twitter");
           int choose=Integer.parseInt(reader.readLine());
           if (choose==1){
               network=new Facebook(userName,password);
           }else  if(choose==2){
               network=new Twitter(userName,password);
           }
           network.post(message);

    }
}
