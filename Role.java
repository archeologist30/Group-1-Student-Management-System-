
package role;

import java.security.Permission;
import java.util.HashSet;
import java.util.Set;


public class Role {
  private String name;
    private Set<Permission> permissions;

    public Role(String name) {
        this.name = name;
        this.permissions = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void addPermission(Permission permission) {
        this.permissions.add(permission);
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                ", permissions=" + permissions +
                '}';
    }
}
    
     
        
    
    

