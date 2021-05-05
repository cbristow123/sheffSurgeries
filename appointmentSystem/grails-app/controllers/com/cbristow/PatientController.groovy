package com.cbristow

class PatientController {

    def scaffold = Patient
	

def search(){

}

def results(String name){

def patients=Patient.where{
(patientName=~name) || (patientID=~name) || (patientResidence=~name)
}.list()

return [patients:patients,
term:params.name,
totalPatients: Patient.count()]

}
}
