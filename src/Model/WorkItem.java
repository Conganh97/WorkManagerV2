package Model;

import java.util.ArrayList;
import java.util.List;

public class WorkItem extends GeneralInformation {
    private String code;

    private String name;

    private String description;

    private Status status;

    private List<Comment> commentList;

    public WorkItem(String creator, String code, String name, String description, Status status) {
        super(creator);
        this.code = code;
        this.name = name;
        this.description = description;
        this.status = status;
        this.commentList = new ArrayList<>();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }
}
