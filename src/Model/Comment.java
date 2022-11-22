package Model;

public class Comment extends GeneralInformation {
    private int idComment;

    private User userComment;

    private String content;
    private static int incrementId = 0;

    public Comment(String creator, User userComment, String content) {
        super(creator);
        this.idComment = incrementId++;
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
