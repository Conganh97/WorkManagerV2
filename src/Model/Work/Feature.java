package Model.Work;

import Model.WorkItem;

public class Feature extends WorkItem {
    private int idFeature;
    private int priority;
    private String acceptanceCriteria;


    public Feature(int id, String creator, String code, String name, String description,
                   Status status, int priority, String acceptanceCriteria) {
        super(creator, code, name, description, status);
        this.idFeature = id;
        this.priority = priority;
        this.acceptanceCriteria = acceptanceCriteria;
    }

    public int getIdFeature() {
        return idFeature;
    }

    public void setIdFeature(int idFeature) {
        this.idFeature = idFeature;
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
