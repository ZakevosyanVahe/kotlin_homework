// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrders(): Set<Customer> = customers.filter {
    val(positiv, negativ) = it.orders.partition { !it.isDelivered }
    positiv.size > negativ.size
}.toSet()
