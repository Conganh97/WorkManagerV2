package Model.Work;

import Model.GeneralInformation;
import Model.User.Team;

import java.util.ArrayList;
import java.util.List;

public class Project extends GeneralInformation {
    private int idProject;
    private String nameProject;
    private String aboutProject;
    private ProductBackLog productBackLog;
    private Team team;
    private List<Sprint> sprintList;


    public Project(int id, String creator, String nameProject, String aboutProject) {
        super(creator);
        this.idProject = id;
        this.nameProject = nameProject;
        this.aboutProject = aboutProject;
        this.sprintList = new ArrayList<>();
    }


    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    public String getNameProject() {
        return nameProject;
    }

    public void setNameProject(String nameProject) {
        this.nameProject = nameProject;
    }

    public String getAboutProject() {
        return aboutProject;
    }

    public void setAboutProject(String aboutProject) {
        this.aboutProject = aboutProject;
    }

    public ProductBackLog getProductBackLog() {
        return productBackLog;
    }

    public void setProductBackLog(ProductBackLog productBackLog) {
        this.productBackLog = productBackLog;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public List<Sprint> getSprintList() {
        return sprintList;
    }

    public void setSprintList(List<Sprint> sprintList) {
        this.sprintList = sprintList;
    }
}
