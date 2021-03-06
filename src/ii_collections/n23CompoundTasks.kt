package ii_collections

fun Shop.getCustomersWhoOrderedProduct(product: Product): Set<Customer> = customers.filter { it.orderedProducts.any { p -> p == product } }.toSet()

fun Customer.getMostExpensiveDeliveredProduct(): Product? = orders.filter { it.isDelivered }.flatMap { it.products }.maxBy { it.price }

fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int = customers.flatMap { it.orders }
        .fold(0, {acc, order -> acc + order.products.count { it == product }})
