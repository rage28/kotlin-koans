package ii_collections

fun example4() {
    val max = listOf(1, 42, 4).max()
    val longestString = listOf("a", "b").maxBy { it.length }
}

fun Shop.getCustomerWithMaximumNumberOfOrders(): Customer? = customers.sortedByDescending { it.orders.count() }.firstOrNull()

fun Customer.getMostExpensiveOrderedProduct(): Product? = orderedProducts.sortedByDescending { it.price }.firstOrNull()
