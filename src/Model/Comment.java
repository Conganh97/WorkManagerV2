package Model;

public class Comment extends GeneralInformation {

    private User userComment;

    private String content;

    public Comment(String creator, User userComment, String content) {
        super(creator);
        this.userComment = userComment;
        this.content = content;
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
