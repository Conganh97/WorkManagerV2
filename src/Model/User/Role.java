package Model.User;

public class Role {
    private int idRole;

    private String roleName;

    public Role(int id, String roleName) {
        this.roleName = roleName;
    }

    public Role() {
    }

    public int getIdRole() {
        return idRole;
    }

    public String getRolesName() {
        return roleName;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

}
