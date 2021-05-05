package com.cbristow

class Prescription {
	String 		pharmacyName
	String		prescripNumber
	String		medicine
	String 		totalCost
	String 		daysOfSupply
	Date 		dateIssued
	Boolean 	patientPaying
	
	String toString(){
	return medicine
	}
    
	static constraints = {

	pharmacyName		nullable:false, blank:false;
	prescripNumber		nullable:false, blank:false;
	daysOfSupply		nullable:false, blank:false;
	medicine		nullable:false, blank:false;
	totalCost		nullable:false, blank:false, scale:2;
	dateIssued		nullable:false, blank:false;
	patientPaying		nullable:false, blank:false;
	
	
    }

static belongsTo = [doctor:Doctor, patient:Patient]
}
