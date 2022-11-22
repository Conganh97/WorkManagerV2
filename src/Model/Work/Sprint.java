package Model.Work;

import Model.WorkItem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sprint extends WorkItem {
    private int idSprint;
    private Date dateStart;
    private Date dateEnd;
    private List<Feature> featureList;
    private List<Task> taskList;

    public Sprint(int id, String creator, String code, String name, String description,
                  Status status, Date dateStart, Date dateEnd) {
        super(creator, code, name, description, status);
        this.idSprint = id;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.featureList = new ArrayList<>();
        this.taskList = new ArrayList<>();
    }


    public int getIdSprint() {
        return idSprint;
    }

    public void setIdSprint(int idSprint) {
        this.idSprint = idSprint;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public List<Feature> getFeatureList() {
        return featureList;
    }

    public void setFeatureList(List<Feature> featureList) {
        this.featureList = featureList;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }
}
