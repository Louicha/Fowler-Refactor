 abstract class Price {
 abstract int getPriceCode();
 }
 class ChildrensPrice extends Price {
 int getPriceCode() {
 return Movie.CHILDRENS;
 }
 }
 class NewReleasePrice extends Price {
 int getPriceCode() {
 return Movie.NEW_RELEASE;
 }
 }
 class RegularPrice extends Price {
 int getPriceCode() {
 return Movie.REGULAR;
}
}
 public int getPriceCode() {
 return _priceCode;
 }
 public setPriceCode (int arg) {
 _priceCode = arg;
 }
 private int _priceCode;
