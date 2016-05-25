package gsm;

/**
 *
 * @author mustafa
 */
public class Battery {
    private String model;
    private String idleTime;
    private String hoursTalk;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getIdleTime() {
        return idleTime;
    }

    public void setIdleTime(String idleTime) {
        this.idleTime = idleTime;
    }

    public String getHoursTalk() {
        return hoursTalk;
    }

    public void setHoursTalk(String hoursTalk) {
        this.hoursTalk = hoursTalk;
    }
}
