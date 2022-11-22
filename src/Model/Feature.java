package Model;

import java.util.Date;

public class Feature extends WorkItem{
    private int idFeature;
    private int priority;
    private String acceptanceCriteria;
    private static int incrementId = 0;

    public Feature(String creator, String code, String name, String description,
                   Status status, int priority, String acceptanceCriteria) {
        super(creator, code, name, description, status);
        this.idFeature = incrementId++;
        this.priority = priority;
        this.acceptanceCriteria = acceptanceCriteria;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getAcceptanceCriteria() {
        return acceptanceCriteria;
    }

    public void setAcceptanceCriteria(String acceptanceCriteria) {
        this.acceptanceCriteria = acceptanceCriteria;
    }
}
