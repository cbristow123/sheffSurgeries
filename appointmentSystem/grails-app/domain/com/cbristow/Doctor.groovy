package com.cbristow

class Doctor {

	String	fullName
	String	qualification
	String	position
	String	doctorEmail
	String	password	
	String	doctorOffice
	String	doctorPhone
	String	bio
	

    static constraints = {
	fullName	nullable:false, blank:false;
	qualification	nullable:false, blank:false;
	position	nullable:false, blank:false, inList:["GP", "Surgeon"];
	doctorEmail	nullable:false, blank:false, unique:true, email:true;
	password	nullable:false, blank:false;
	doctorOffice	nullable:false, blank:false, size:4..6;
	doctorPhone	nullable:false, blank:false;
	bio		nullable:false, blank:false, widget:'textarea', maxSize:5000;
    }
}	
