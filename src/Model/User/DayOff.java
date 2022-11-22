package Model.User;

import java.util.Date;

public class DayOff {
    private int idDayOff;
    private User user;
    private String reason;
    private Date dayOff;

    public DayOff(int idDayOff, User user, String reason, Date dayOff) {
        this.idDayOff = idDayOff;
        this.user = user;
        this.reason = reason;
        this.dayOff = dayOff;
    }

    public int getIdDayOff() {
        return idDayOff;
    }

    public void setIdDayOff(int idDayOff) {
        this.idDayOff = idDayOff;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getDayOff() {
        return dayOff;
    }

    public void setDayOff(Date dayOff) {
        this.dayOff = dayOff;
    }
}
