abstract class Price {
	abstract int getPriceCode();

	double getCharge(int daysRented) {
		double result = 0;
		switch (getPriceCode()) {
		case Movie.REGULAR:
			result += 2;
			if (daysRented > 2)
				result += (daysRented - 2) * 1.5;
			break;
		case Movie.NEW_RELEASE:
			result += daysRented * 3;
			break;
		case Movie.CHILDRENS:
			result += 1.5;
			if (daysRented > 3)
				result += (daysRented - 3) * 1.5;
			break;
        default break;
		}
		return result;
	}

	int getFrequentRenterPoints(int daysRented) {
		return 1;
	}

}

class ChildrensPrice extends Price {
 double getCharge(int daysRented){
 double result = 1.5;
 if (daysRented > 3)
 result += (daysRented - 3) * 1.5;
 return result;
 }

 }
 class NewReleasePrice {
 int getFrequentRenterPoints(int daysRented) {
 return (daysRented > 1) ? 2: 1;
 }
 }

abstract double getCharge(int daysRented){
 return daysRented * 3;
 }
 }

class RegularPrice extends Price {
	int getPriceCode() {
		return Movie.REGULAR;
	}

	double getCharge(int daysRented) {
		double result = 2;
		if (daysRented > 2)
			result += (daysRented - 2) * 1.5;
		return result;
	}
}

	public int getPriceCode() {
		return _priceCode;
	}

	public setPriceCode (int arg) {
 _priceCode = arg;
 }

private int _priceCode;
