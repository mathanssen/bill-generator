public class Bill implements IDisplay {

  // Properties
  private int id;
  private String date;
  private String type;
  private double amount;

  // Constructor
  public Bill(int id, String date, String type, double amount) {
    this.id = id;
    this.date = date;
    this.type = type;
    this.amount = amount;
  }

  // Methods
  @Override
  public void display() {
    System.out.println("Bill ID: " + this.id);
    System.out.println("Bill Date: " + this.date);
    System.out.println("Bill Type: " + this.type);
    System.out.println("Bill Total: " + this.amount);
  }

  // Getters and Setters
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }
}
