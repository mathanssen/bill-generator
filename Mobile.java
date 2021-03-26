public class Mobile extends Bill {

    // Properties
    private String modelName;
    private String mobileNumber;
    private double GBUsed;
    private double minuteUsed;

    // Constructor
    public Mobile(int id, String date, double amount, String modelName, String mobileNumber, double GBUsed,
            double minuteUsed) {
        super(id, date, "Mobile", amount);
        this.modelName = modelName;
        this.mobileNumber = mobileNumber;
        this.GBUsed = GBUsed;
        this.minuteUsed = minuteUsed;
    }

    // Getters and Setters
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public double getGBUsed() {
        return GBUsed;
    }

    public void setGBUsed(double GBUsed) {
        this.GBUsed = GBUsed;
    }

    public double getMinuteUsed() {
        return minuteUsed;
    }

    public void setMinuteUsed(double minuteUsed) {
        this.minuteUsed = minuteUsed;
    }
}
