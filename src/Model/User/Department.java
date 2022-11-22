package Model.User;

import Model.GeneralInformation;

public class Department extends GeneralInformation {
    private int idDepartment;
    private String name;
    private String code;
    private int numberUser;
    private String description;


    public Department(int id, String creator, String name, String code, int numberUser, String description) {
        super(creator);
        this.id = id;
        this.name = name;
        this.code = code;
        this.numberUser = numberUser;
        this.description = description;
    }

    public int getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(int idDepartment) {
        this.idDepartment = idDepartment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getNumberUser() {
        return numberUser;
    }

    public void setNumberUser(int numberUser) {
        this.numberUser = numberUser;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
