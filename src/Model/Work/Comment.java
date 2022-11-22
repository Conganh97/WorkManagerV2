package Model.Work;

import Model.GeneralInformation;
import Model.User.User;

public class Comment extends GeneralInformation {
    private int idComment;

    private User userComment;

    private String content;

    public Comment(int id, String creator, User userComment, String content) {
        super(creator);
        this.idComment = id;
        this.userComment = userComment;
        this.content = content;
    }


    public int getIdComment() {
        return idComment;
    }

    public void setIdComment(int idComment) {
        this.idComment = idComment;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUserComment() {
        return userComment;
    }

    public void setUserComment(User userComment) {
        this.userComment = userComment;
    }
}
