
package Model;

import java.util.Date;

public class  GeneralInformation {
    protected int id;

    protected Date dateCreated;

    protected String creator;

    protected Date dateUpdated;

    protected String editor;

    public GeneralInformation(String creator) {
        this.dateCreated = new Date();
        this.creator = creator;
    }

    public GeneralInformation() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }
}
