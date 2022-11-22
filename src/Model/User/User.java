package Model.User;


import Model.GeneralInformation;

import java.util.HashSet;
import java.util.Set;

public class User extends GeneralInformation {
    private int idUser;
    private String name;
    private String userName;
    private String password;
    private String email;
    private String phone;

    private boolean statusUser;
    private Set<Role> roleList;

    public User(int id, String creator, String name, String userName,
                String password, String email, String phone) {
        super(creator);
        this.idUser = id;
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.statusUser = true;
        this.email = email;
        this.phone = phone;
        this.roleList = new HashSet<>();
    }

    public User() {
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
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

    public boolean isStatusUser() {
        return statusUser;
    }

    public void setStatusUser(boolean statusUser) {
        this.statusUser = statusUser;
    }
}
