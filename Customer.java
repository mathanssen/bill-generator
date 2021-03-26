import java.util.ArrayList;

public class Customer implements IDisplay {

  // Properties
  private int id;
  private String firstName;
  private String lastName;
  private String fullName;
  private String email;
  private ArrayList<Bill> bills;
  private double totalAmount;

  // Constructor
  public Customer(int id, String firstName, String lastName, String email) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.fullName = this.firstName + " " + this.lastName;
    this.email = email;
    this.totalAmount = 0;
    this.bills = new ArrayList<Bill>();
  }

  // Methods
  public void calculateTotalAmount() {
    double total = 0;
    for (int i = 0; i < this.bills.size(); i++) {
      total += this.bills.get(i).getAmount();
    }
    this.totalAmount = total;
  }

  @Override
  public void display() {
    System.out.println("Customer id: " + this.id);
    System.out.println("Customer name: " + this.fullName);
    System.out.println("Customer email: " + this.email);

    if (this.bills.isEmpty()) {
      System.out.println("This customer has no bills!");
    } else {
      System.out.println("************* Bill information *************");
      for (int i = 0; i < this.bills.size(); i++) {
        this.bills.get(i).display();
      }

      this.calculateTotalAmount();
      System.out.println("TOTAL TO PAY: $" + this.totalAmount);
    }
  }

  // Getters and Setters
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ArrayList<Bill> getBills() {
    return bills;
  }

  public void setBills(ArrayList<Bill> bills) {
    this.bills = bills;
  }

  public double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(double totalAmount) {
    this.totalAmount = totalAmount;
  }
}
