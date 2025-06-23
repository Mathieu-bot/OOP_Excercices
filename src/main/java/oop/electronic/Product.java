package oop.electronic;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
  private String id;
  private String name;
  private String description;
  private Float unitPrice;
  private Category category;
  private int quantityInStock;
  private int warrantyMonths;


  public void reducePrice (int percentage) {
    if (percentage < 0 || percentage > 100) {
      throw new IllegalArgumentException("Invalid percentage: " + percentage + "%");
    }
    this.unitPrice = (this.unitPrice * (100 - percentage)) / 100;
  }

  public void raisePrice (int percentage) {
    if (percentage < 0) {
      throw new IllegalArgumentException("Invalid percentage: " + percentage + "%");
    }
    this.unitPrice += this.unitPrice * percentage / 100;
  }

  public Boolean isInStock () {
    return quantityInStock > 0;
  }

  public void sell(int number) {
    if (number < 0) {
      throw new IllegalArgumentException("Invalid number: " + number + ".");
    } else if ( number > quantityInStock) {
      throw new IllegalArgumentException("The product is out of stock.");
    }
    this.quantityInStock -= number;
  }
}
