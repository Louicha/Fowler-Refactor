
import java.lang.*;
import java.util.*;

class Customer {
    private String name;
    private Vector rentals = new Vector();
    public Customer (String newname){
        name = newname;
    };
    public void addRental(Rental arg) {
        rentals.addElement(arg);
    };
    public String getName (){
        return name;
    };
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration enum_rentals = rentals.elements();	    
        String result = "Rental Record for " + this.getName() + "\n";
        result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";

        while (enum_rentals.hasMoreElements()) {
            double result = 0;
            Rental aRental = (Rental) enum_rentals.nextElement();

            frequentRenterPoints += each.getFrequentRenterPoints();
                   
            //show figures for this rental
            result += "\t" + aRental.getMovie().getTitle()+ "\t" + "\t" + aRental.getDaysRented() + "\t" + String.valueOf result) + "\n";
            totalAmount += result;
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return result;
    }

   private double amountFor(Rental aRental) {
       return aRental.getCharge();
   }

}
    