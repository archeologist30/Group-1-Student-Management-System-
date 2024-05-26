
package main;

import java.security.Permission;
import javax.management.relation.Role;


public class Main {

    
    public static void main(String[] args) {
        // Create some permissions
        Permission readPermission = new Permission("READ") {
            @Override
            public boolean implies(Permission permission) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean equals(Object obj) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public int hashCode() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public String getActions() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        Permission writePermission = new Permission("WRITE") {
            @Override
            public boolean implies(Permission permission) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean equals(Object obj) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public int hashCode() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public String getActions() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        Permission deletePermission = new Permission("DELETE") {
            @Override
            public boolean implies(Permission permission) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean equals(Object obj) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public int hashCode() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public String getActions() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };

        // Create some roles and assign permissions to them
        Role adminRole = new Role("ADMIN");
        adminRole.addPermission(readPermission);
        adminRole.addPermission(writePermission);
        adminRole.addPermission(deletePermission);

        Role userRole = new Role("USER");
        userRole.addPermission(readPermission);

        // Create a user and assign roles to them
        User adminUser = new User("admin");
        adminUser.addRole(adminRole);
        adminUser.addRole(userRole);

        User normalUser = new User("user");
        normalUser.addRole(userRole);

        // Print out the users and their permissions
        System.out.println("Admin User: " + adminUser);
        System.out.println("Admin Permissions: " + adminUser.getPermissions());

        System.out.println("Normal User: " + normalUser);
        System.out.println("Normal Permissions: " + normalUser.getPermissions());
    }
}
    
    

