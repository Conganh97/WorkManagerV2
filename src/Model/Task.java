package Model;

import java.util.List;

public class Task extends WorkItem {

    private int TimeEstimate;

    private User worker;

    public Task(String creator, String code, String name, String description,
                Status status, int timeEstimate, User worker) {
        super(creator, code, name, description, status);
        TimeEstimate = timeEstimate;
        this.worker = worker;
    }

    public int getTimeEstimate() {
        return TimeEstimate;
    }

    public void setTimeEstimate(int timeEstimate) {
        TimeEstimate = timeEstimate;
    }

    public User getWorker() {
        return worker;
    }

    public void setWorker(User worker) {
        this.worker = worker;
    }
}