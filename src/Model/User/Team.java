package Model.User;

import Model.GeneralInformation;
import Model.User.User;

import java.util.ArrayList;
import java.util.List;

public class Team extends GeneralInformation {
    private int idTeam;
    private String teamName;

    private List<User> userList;

    public Team(int id, String creator, String teamName) {
        super(creator);
        this.id = id;
        this.teamName = teamName;
        this.userList = new ArrayList<>();
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
