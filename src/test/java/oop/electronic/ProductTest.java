package oop.electronic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

  private Product product;
  @BeforeEach
  void setUp() {
     product = new Product(
      "P01",
      "iPhone 14",
      "Smartphone Apple",
      1500f,
      Category.TELEPHONE,
      20,
      24
    );
  }

  @Test
  void testReducingUnitPriceByValidPercentage() {
    product.reducePrice(10);
    assertEquals(1350f, product.getUnitPrice(), 0.01f); //this delta 0.01 allow une marge d'erreur de 0.01f
  }

  @Test
  void testReducingUnitPriceByInvalidPercentage() {
    List<Integer> invalidPercentages = List.of(-1, -5, 101, 200);
    invalidPercentages.forEach(value ->
      assertThrows(IllegalArgumentException.class, () -> product.reducePrice(value)));

    invalidPercentages.forEach(p -> {
      IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> product.reducePrice(p));
      assertEquals(String.format("Invalid percentage: %s%%", p), ex.getMessage());
    });
  }

  @Test
  void testRaisingUnitPriceByValidPercentage() {
    List<Integer> validPercentages = List.of(50, 75, 90, 10);
    List<Float> expected = List.of(2250f, 3937.5f, 7481.25f, 8229.375f);
    for (int i = 0; i < validPercentages.size(); i++) {
      product.raisePrice(validPercentages.get(i));
      assertEquals(expected.get(i), product.getUnitPrice(), 0.01f);
    }
  }
}
