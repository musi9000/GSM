package gsm;

/**
 *
 * @author mustafa
 */
public class Call {

    public Call(String date, String startTime, int duration) {
        this.date = date;
        this.startTime = startTime;
        this.duration = duration;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    
    
    private String date;
    private String startTime;
    private int duration;
}
