
package main;

import java.security.Permission;
import java.util.HashSet;
import java.util.Set;
import javax.management.relation.Role;


class User {
    private String username;
    private Set<Role> roles;

    public User(String username) {
        this.username = username;
        this.roles = new HashSet<>();
    }

    public String getUsername() {
        return username;
    }

    public void addRole(Role role) {
        this.roles.add(role);
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public Set<Permission> getPermissions() {
        Set<Permission> permissions = new HashSet<>();
        for (Role role : roles) {
            permissions.addAll(role.getPermissions());
        }
        return permissions;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", roles=" + roles +
                '}';
    }
}
    

