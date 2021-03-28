public class Internet extends Bill {

  // Properties
  private String providerName;
  private double GBUsed;

  // Constructor
  public Internet(int id, String date, double amount, String providerName, double GBUsed) {
    super(id, date, "Internet", amount);
    this.providerName = providerName;
    this.GBUsed = GBUsed;
  }

  // Getters and Setters
  public String getProviderName() {
    return providerName;
  }

  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }

  public double getGBUsed() {
    return GBUsed;
  }

  public void setGBUsed(double GBUsed) {
    this.GBUsed = GBUsed;
  }
}
