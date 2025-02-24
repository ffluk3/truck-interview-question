package com.example

class BoxTruck: Truck() {

    override var name = "BOX_TRUCK"

    override var capacity = 400

    override fun canLoad(shipment: Shipment): Boolean {
        return super.canLoad(shipment)
    }
}