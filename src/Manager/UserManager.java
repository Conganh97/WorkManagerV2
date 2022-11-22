package Manager;


import Model.User.Role;
import Model.User.User;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    public User create() {
        return new User();
    }

    public void addUserToUserList(User user) {
    }

    public void editTask(User userEdit) {
    }

    public User findById(int idUser) {
        return new User();
    }

    public List<User> findAllUser(int idSprint) {
        return new ArrayList<User>();
    }

    public void deleteUser(int idUser) {
    }

    public void changeRoleUser(int idUser, int idRole){
        findById(idUser).getRoleList().add(findRoleById(idRole));
    }

    public Role findRoleById(int idRole){
        return new Role();
    }
}
