package com.example

fun main() {

    val reeferTruck = ReeferTruck()
    val boxTruck = BoxTruck()
    val trucks = listOf(reeferTruck, boxTruck)


    val shipments = listOf(
        Shipment(500, true),
        Shipment(600, false),
        Shipment(20, false),
        Shipment(20, false),
        Shipment(200, true),
    )

    val result = trucks.solve(shipments)

    println(result)
}

fun List<Truck>.solve(shipments: List<Shipment>): List<Truck> {
    shipments.forEach { shipment ->
        try {
            this.first { it.canLoad(shipment) }.addShipment(shipment)
        } catch (e: NoSuchElementException) {
            println("No truck can load shipment: $shipment")
        }
    }
    return this
}