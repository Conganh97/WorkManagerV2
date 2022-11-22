package Model;

import java.util.List;

public class Task extends WorkItem {
    private int idTask;
    private int timeEstimate;
    private int timeRemaining;
    private static int incrementId = 0;

    public Task(String creator, String code, String name, String description,
                Status status, int timeEstimate, User worker) {
        super(creator, code, name, description, status);
        this.idTask = incrementId++;
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

    public static int getIncrementId() {
        return incrementId;
    }

    public static void setIncrementId(int incrementId) {
        Task.incrementId = incrementId;
    }

    public int getTimeEstimate() {
        return timeEstimate;
    }

    public void setTimeEstimate(int timeEstimate) {
        this.timeEstimate = timeEstimate;
    }

}
