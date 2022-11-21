package Model;

public class Role {
    private int idRole;

    private String roleName;

    private static int incrementId = 0;


    public Role(String roleName) {
        this.idRole = incrementId++;
        this.roleName = roleName;
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

    public static int getIncrementId() {
        return incrementId;
    }

    public static void setIncrementId(int incrementId) {
        Role.incrementId = incrementId;
    }
}
