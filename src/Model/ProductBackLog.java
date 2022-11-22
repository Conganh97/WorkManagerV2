package Model;


import java.util.ArrayList;
import java.util.List;

public class ProductBackLog extends WorkItem{
    private int idProductBackLog;
    private List<Feature> featureList;
    private static int incrementId = 0;
    public ProductBackLog(String creator, String code, String name,
                          String description, Status status) {
        super(creator, code, name, description, status);
        this.idProductBackLog = incrementId++;
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
