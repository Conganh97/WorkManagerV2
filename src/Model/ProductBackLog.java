package Model;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductBackLog extends WorkItem{

    private Date targetDate;

    private List<Task> taskList;

    private Team team;

    public ProductBackLog(String creator, String code, String name,
                          String description, Status status, Date targetDate, Team team) {
        super(creator, code, name, description, status);
        this.targetDate = targetDate;
        this.taskList = new ArrayList<>();
        this.team = team;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
