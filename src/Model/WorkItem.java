package Model;

import Model.User.User;
import Model.Work.Comment;
import Model.Work.Status;

import java.util.ArrayList;
import java.util.List;

public class WorkItem extends GeneralInformation {
    public String code;
    public String name;
    public String description;
    public Status status;
    public User worker;
    public List<Comment> commentList;

    public WorkItem(String creator, String code, String name, String description, Status status) {
        super(creator);
        this.code = code;
        this.name = name;
        this.description = description;
        this.status = status;
        this.commentList = new ArrayList<>();
    }

    public WorkItem() {
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

    public User getWorker() {
        return worker;
    }

    public void setWorker(User worker) {
        this.worker = worker;
    }

}
