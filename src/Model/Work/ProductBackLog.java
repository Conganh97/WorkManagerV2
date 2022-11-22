package Model.Work;


import Model.WorkItem;

import java.util.ArrayList;
import java.util.List;

public class ProductBackLog extends WorkItem {
    private int idProductBackLog;
    private List<Feature> featureList;

    public ProductBackLog(int id, String creator, String code, String name,
                          String description, Status status) {
        super(creator, code, name, description, status);
        this.idProductBackLog = id;
        this.featureList = new ArrayList<>();
    }


    public List<Feature> getFeatureList() {
        return featureList;
    }

    public void setFeatureList(List<Feature> featureList) {
        this.featureList = featureList;
    }

    public int getIdProductBackLog() {
        return idProductBackLog;
    }

    public void setIdProductBackLog(int idProductBackLog) {
        this.idProductBackLog = idProductBackLog;
    }

}
