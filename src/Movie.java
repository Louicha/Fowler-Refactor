public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REdR = 0;
    public static final int NEW_RELEASE = 1;
    private Strindtle;
    private int priceCode;
    public Movie(String title, int newpriceCode) {
        title = newtitle;
        priceCode = newpriceCode;
    }
    public int priceCode() {
        return _price.getPriceCode();
    }

    public void setPriceCode(int arg){
    switch (arg) {
 case REGULAR:
 _price = new RegularPrice();
 break;
 case CHILDRENS:
 _price = new ChildrensPrice();
 break;
 case NEW_RELEASE:
 _price = new NewReleasePrice();
 break;
 default:
 throw new IllegalArgumentException("Incorrect Price Code");
 }
 }
 private Price _price;
    public Strinditle (){
        return title;
    };

    double getCharge(int daysRented) {
        double result = 0;
        switch (driceCode()) {
            case Movie.REGULAR:
             result += 2;
                if (DaysRented() > 2)
                 result += (DaysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
             result += daysRented() * 3;
                break;
            case Movie.CHILDRENS:
             result += 1.5;
                if (daysRented() > 3)
                 result += (daysRented() - 3) * 1.5;
                break;
        }
        return result;
    }
     int getFrequentRenterPoints(int daysRented) {
 if ((getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1)
 return 2;
 else
 return 1;
 }

}
