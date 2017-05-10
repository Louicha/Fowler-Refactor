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
        double getCharge(int daysRented) {
 return _price.getCharge(daysRented);
 }
    }
     int getFrequentRenterPoints(int daysRented) {
int getFrequentRenterPoints(int daysRented) {
 return _price.getFrequentRenterPoints(daysRented);
 }}


}
