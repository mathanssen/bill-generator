public class Main {

  public static void main(String[] args) {
    Internet i1 = new Internet(1, "Wed June 19 2020", 56.50, "Rogers", 500);
    Internet i2 = new Internet(2, "Monday Sept 22 2020", 75.00, "Fido", 1000);
    Internet i3 = new Internet(3, "Friday Oct 15 2020", 30.00, "Rogers", 500);
    Mobile m1 = new Mobile(4, "Oct 20 2020", 253.55, "Galaxy Phone", "416-966-8877", 5, 356);
    Mobile m2 = new Mobile(5, "Oct 25 2020", 75.00, "iPhone XS", "289-111-1234", 10, 1000);
    Hydro h1 = new Hydro(6, "Feb 5, 2020", 150, "Enbridge", 2000);
    Hydro h2 = new Hydro(7, "March 15, 2020", 20, "Enbridge", 1);
    Customer c1 = new Customer(1, "Peter", "Byge", "peter@gmail.com");

    c1.getBills().add(i1);
    c1.getBills().add(i2);
    c1.getBills().add(i3);
    c1.getBills().add(m1);
    c1.getBills().add(m2);
    c1.getBills().add(h1);
    c1.getBills().add(h2);

    c1.display();
  }
}
