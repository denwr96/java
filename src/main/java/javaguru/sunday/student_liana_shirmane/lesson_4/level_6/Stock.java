package main.java.javaguru.sunday.student_liana_shirmane.lesson_4.level_6;

class Stock {
    String name;
    double price;
    double minPrice;
    double maxPrice;

    Stock (String name, double price) {
        this.name = name;
        this.price = price;
        this.minPrice = price;
        this.maxPrice = price;
    }

  public double updatePrice (double updatedPrice){
      if (updatedPrice < minPrice) {
          minPrice = updatedPrice;
          price = updatedPrice;
      } else if (updatedPrice > maxPrice) {
          maxPrice = updatedPrice;
          price = updatedPrice;
      } else {
          price = updatedPrice;
      }
      return updatedPrice;
  }

  public String getPriceInformation() {
      return ( "Company = "+ name +", Current Price = "+ price +", Min Price = " + minPrice + ", Max Price = " + maxPrice);
  }
}

