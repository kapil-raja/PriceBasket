import org.scalatest.funsuite.AnyFunSuite
import pricebasket.PriceBasket

class PriceBasketTest extends AnyFunSuite{

  test("PriceBasket should calculate subtotal correctly") {
    val basket = List("Soup", "Soup", "Bread", "Apples", "Apples")
    val subtotal = PriceBasket.calculateSubtotal(basket)
    assert(subtotal === 4.10)
  }

  test("PriceBasket should calculate subtotal correctly Test2") {
    val basket = List("Bread", "Bread", "Apples", "Apples", "Apples", "Apples", "Apples")
    val subtotal = PriceBasket.calculateSubtotal(basket)
    assert(subtotal === 6.6)
  }

    test("PriceBasket should calculate discounts correctly") {
      val basket = List("Soup", "Soup", "Bread", "Apples", "Apples")
      val discounts = PriceBasket.calculateDiscounts(basket)
      assert(discounts === List(0.40, 0.40, 0.2))
    }

    test("PriceBasket should format price correctly") {
      val formattedPrice = PriceBasket.formatPrice(3.5)
      assert(formattedPrice === "3.50")
    }

    test("PriceBasket should format discount correctly") {
      val formattedDiscount = PriceBasket.formatDiscount(0.75)
      assert(formattedDiscount === "-0.75 off")
    }


}