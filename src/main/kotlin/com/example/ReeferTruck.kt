package com.example

class ReeferTruck: Truck() {

    override var name = "REEFER_TRUCK"

    override fun canLoad(shipment: Shipment): Boolean {
        return shipment.needsRefrigeration && super.canLoad(shipment)
    }
}