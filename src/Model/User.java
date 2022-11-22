package Model;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User extends GeneralInformation {
    private int idUser;
    private String name;
    private String userName;
    private String password;
    private String email;
    private String phone;
    private Set<Role> roleList;
    private static int incrementId = 0;

    public User(String creator, String name, String userName,
                String password, String email, String phone) {
        super(creator);
        this.id = incrementId++;
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.roleList = new HashSet<>();
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Set<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(Set<Role> roleList) {
        this.roleList = roleList;
    }
}
