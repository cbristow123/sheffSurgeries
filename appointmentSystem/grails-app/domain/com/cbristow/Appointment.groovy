package com.cbristow

class Appointment {

	Date 	appDate
	String 	appTime
	String 	appDuration
	String 	roomNumber
	String 	appID

	String toString (){
	return appID
	}

    static constraints = {
	
	appDate		nullable:false, blank:false;
	appTime 	nullable:false, blank:false, scale:2;
	appDuration	nullable:false, blank:false, inList:["30","45","60"];
	roomNumber	nullable:false, blank:false, size:1..6; 
    

	}
static belongsTo = [patient:Patient, doctor:Doctor, surgery:Surgery]
}
