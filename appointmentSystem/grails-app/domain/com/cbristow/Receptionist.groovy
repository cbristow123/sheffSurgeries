package com.cbristow

class Receptionist {
	
	String	recepName
	String	recepEmail
	String	recepUsername
	String	recepPassword
	String	recepPhone

	String toString(){
	return recepName
	}

    static constraints = {
	
	recepName	nullable:false, blank:false;
	recepEmail	nullable:false, blank:false, unique:true, email:true;
	recepUsername	nullable:false, blank:false, unique:true;
	recepPassword	nullable:false, blank:false;
	recepPhone	nullable:false, blank:false, unique:true;
    }

static belongsTo = [surgery:Surgery]
}
