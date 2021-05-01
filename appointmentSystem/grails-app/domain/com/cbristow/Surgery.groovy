package com.cbristow

class Surgery {

	String 	name
	String 	address
	String	postcode
	String 	telephone	
	int	numberOfPatients
	String 	description
	String 	openingTime

	String toString(){
	return name
	}

    static constraints = {

	name			nullable:false, blank:false;
	address			nullable:false, blank:false;
	postcode		nullable:false, blank:false;
	telephone		nullable:false, blank:false, unique:true;
	numberOfPatients	nullable:false, blank:false, min:1, max:200;
	description		nullable:false, blank:false, maxSize:5000, widget:'textarea';
	openingTime		nullable:false, blank:false, scale:2;

    }

static hasMany = [nurses:Nurse, patients:Patient, receptionists:Receptionist, doctors:Doctor, appointments:Appointment]
static belongsTo = [doctors:Doctor]
}
