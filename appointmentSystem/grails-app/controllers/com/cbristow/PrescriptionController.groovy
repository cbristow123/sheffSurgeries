package com.cbristow

class PrescriptionController {

    def scaffold = Prescription

def search(){

}

def results(String name){

def prescriptions=Prescription.where{
(medicine=~name) || (totalCost=~name) || (daysOfSupply=~name)
}.list()

return [prescriptions:prescriptions,
term:params.name,
totalPrescriptions: Prescription.count()]
}

}
