package Model;

public class Status {
    private int idStatus;

    private String name;

    private String nameClass;

    private static int incrementId = 0;


    public Status(String name, String nameClass) {
        this.idStatus = incrementId++;
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

    public static int getIncrementId() {
        return incrementId;
    }

    public static void setIncrementId(int incrementId) {
        Status.incrementId = incrementId;
    }
}
