package Model.Work;

import Model.User.User;
import Model.WorkItem;

public class Task extends WorkItem {
    private int idTask;
    private int timeEstimate;
    private int timeRemaining;

    public Task(int id, String creator, String code, String name, String description,
                Status status, int timeEstimate, User worker) {
        super(creator, code, name, description, status);
        this.idTask = id;
        this.timeRemaining = timeEstimate;
        this.timeEstimate = timeEstimate;
    }

    public Task() {
    }

    public int getIdTask() {
        return idTask;
    }

    public void setIdTask(int idTask) {
        this.idTask = idTask;
    }

    public int getTimeRemaining() {
        return timeRemaining;
    }

    public void setTimeRemaining(int timeRemaining) {
        this.timeRemaining = timeRemaining;
    }


    public int getTimeEstimate() {
        return timeEstimate;
    }

    public void setTimeEstimate(int timeEstimate) {
        this.timeEstimate = timeEstimate;
    }

}
