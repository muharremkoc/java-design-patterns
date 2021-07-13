package com.pattern.designpatterns.behavioral.chainresponsibilty;

import com.pattern.designpatterns.behavioral.chainresponsibilty.middleware.MiddleWare;
import com.pattern.designpatterns.behavioral.chainresponsibilty.middleware.RoleCheckMiddleWare;
import com.pattern.designpatterns.behavioral.chainresponsibilty.middleware.ThrottlingMiddleWare;
import com.pattern.designpatterns.behavioral.chainresponsibilty.middleware.UserExistsMiddleWare;
import com.pattern.designpatterns.behavioral.chainresponsibilty.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChainResponsibilityMain {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        // All checks are linked. Client can build various chains using the same
        // components.
        MiddleWare middleware = new ThrottlingMiddleWare(2);
        middleware.linkWith(new UserExistsMiddleWare(server))
                .linkWith(new RoleCheckMiddleWare());

        // Server gets a chain from client code.
        server.setMiddleWare(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}
