package Model.User;

import java.util.Date;

public class TimeKeeping {
    private int idTimeKeeping;
    private Date hourComing;
    private Date returnTime;
    private User user;
    private boolean isLate;

    public TimeKeeping(int id, Date hourComing, Date returnTime, User user, boolean isLate) {
        this.idTimeKeeping = id;
        this.hourComing = hourComing;
        this.returnTime = returnTime;
        this.user = user;
        this.isLate = isLate;
    }

    public int getIdTimeKeeping() {
        return idTimeKeeping;
    }

    public void setIdTimeKeeping(int idTimeKeeping) {
        this.idTimeKeeping = idTimeKeeping;
    }

    public Date getHourComing() {
        return hourComing;
    }

    public void setHourComing(Date hourComing) {
        this.hourComing = hourComing;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isLate() {
        return isLate;
    }

    public void setLate(boolean late) {
        isLate = late;
    }
}
