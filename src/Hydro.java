public class Hydro extends Bill {

  // Properties
  private String agencyName;
  private double unitConsumed;

  // Constructor
  public Hydro(int id, String date, double amount, String agencyName, double unitConsumed) {
    super(id, date, "Hydro", amount);
    this.agencyName = agencyName;
    this.unitConsumed = unitConsumed;
  }

  // Methods
  @Override
  public void display() {
    super.display();
    System.out.println("Agency: " + this.agencyName);
    System.out.println("Units used: " + this.unitConsumed);
    System.out.println("*******************************************");
  }

  // Getters and Setters
  public String getAgencyName() {
    return agencyName;
  }

  public void setAgencyName(String agencyName) {
    this.agencyName = agencyName;
  }

  public double getUnitConsumed() {
    return unitConsumed;
  }

  public void setUnitConsumed(double unitConsumed) {
    this.unitConsumed = unitConsumed;
  }
}
