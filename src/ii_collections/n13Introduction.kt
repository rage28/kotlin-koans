package ii_collections

/*
 * This part of workshop was inspired by:
 * https://github.com/goldmansachs/gs-collections-kata
 */

/*
 *  There are many operations that help to transform one collection into another, starting with 'to'
 */

fun Shop.getSetOfCustomers(): Set<Customer> {
    // Return a set containing all the customers of this shop
    return customers.toSet()
}

