package Model.Work;

public class Status {
    private int idStatus;

    private String name;

    private String nameClass;


    public Status(int id, String name, String nameClass) {
        this.idStatus = id;
        this.name = name;
        this.nameClass = nameClass;
    }

    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

}
