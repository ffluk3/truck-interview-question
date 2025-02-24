package com.example

abstract class Truck {

    companion object {
        protected const val MAX_CAPACITY = 1000
    }

    protected open var name = "BASE_TRUCK"

    protected open var capacity = MAX_CAPACITY

    private val shipments = mutableListOf<Shipment>()

    fun addShipment(shipment: Shipment) {
        shipments.add(shipment)
        capacity -= shipment.size
    }

    open fun canLoad(shipment: Shipment): Boolean {
        return shipment.size <= capacity
    }

    override fun toString(): String {
        return "$name(remaining_capacity=$capacity, shipments=$shipments)"
    }

}