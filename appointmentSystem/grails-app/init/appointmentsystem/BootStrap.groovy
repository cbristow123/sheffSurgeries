package com.cbristow

class BootStrap {

    def init = { servletContext ->
    
	def surgery1 = new Surgery(
		name: 'Sheffield Centre Surgery',
		address: '73 The Moor',
		postcode: 'S10 8RD',
		telephone: '0123 456 789',
		numberOfPatients: 150,
		description: 'Great Centre Surgery',
		openingTime: '24hrs').save()
	
	def surgery2 = new Surgery(
		name: 'Sheffield Northern Surgery',
		address: '35 West Street',
		postcode: 'S13 4TX',
		telephone: '0123 888 521',
		numberOfPatients: 100,
		description: 'Great Northern Surgery',
		openingTime: '24hrs').save()

	def surgery3 = new Surgery(
		name: 'Sheffield Southern Surgery',
		address: '69 Ligma Lane',
		postcode: 'S08 3TU',
		telephone: '0123 194 332',
		numberOfPatients: 125,
		description: 'Great Southern Surgery',
		openingTime: '24hrs').save()	

	def receptionist1 = new Receptionist(
		recepName: 'Jen Arthur',
		recepEmail: 'JenArthur@SheffieldSurgeries.co.uk',
		recepUsername: 'JenArthurSheffSurgeries',
		recepPassword: 'password',
		recepPhone: '0123 421 889',
		surgery: surgery1).save()
	
	def receptionist2 = new Receptionist(
		recepName: 'Ella Burton',
		recepEmail: 'EllaBurton@SheffieldSurgeries.co.uk',
		recepUsername: 'EllaBurtonSheffSurgeries',
		recepPassword: 'password',
		recepPhone: '0123 421 822',
		surgery: surgery2).save()
	
	def receptionist3 = new Receptionist(
		recepName: 'Lucy Nodding',
		recepEmail: 'LucyNodding@SheffieldSurgeries.co.uk',
		recepUsername: 'LucyNoddingSheffSurgeries',
		recepPassword: 'password',
		recepPhone: '0123 351 812',
		surgery: surgery3).save()

	def nurse1 = new Nurse(
		nurseName: 'Clare Sarup',
		qualifications: 'BSc (Honours) Nursing',
		nurseEmail: 'Clare@NHSNurse.com',
		nurseOffice: '01',
		nursePhone: '0123 499 132',
		surgery: surgery1).save()
	
	def nurse2 = new Nurse(
		nurseName: 'Lois Williams',
		qualifications: 'BSc (Honours) Nursing',
		nurseEmail: 'Lois@NHSNurse.com',
		nurseOffice: '02',
		nursePhone: '0123 420 911',
		surgery: surgery2).save()

	def nurse3 = new Nurse(
		nurseName: 'Corrie Adams',
		qualifications: 'BSc (Honours) Nursing',
		nurseEmail: 'Corrie@NHSNurse.com',
		nurseOffice: '03',
		nursePhone: '0123 442 582',
		surgery: surgery3).save()

	def doctor1 = new Doctor(
		fullName: 'Dr Brettdog',
		qualification: 'PHD',
		position: 'Neuro Surgeon',
		doctorEmail: 'Brettdog@NHSDoctor.com',
		password: 'Brett123',
		doctorOffice: '1234',
		doctorPhone: '01337 232 211',
		bio: 'Great doctor',
		nurses: nurse1,		
		surgeries: surgery1).save()

	def doctor2 = new Doctor(
		fullName: 'Dr Skiddler',
		qualification: 'PHD',
		position: 'Proctologist Surgeon',
		doctorEmail: 'Skiddler@NHSDoctor.com',
		password: 'Skiddler123',
		doctorOffice: '4112',
		doctorPhone: '01337 553 194',
		bio: 'Great doctor',
		nurses: nurse2,	
		surgeries: surgery2).save()
	
	def doctor3 = new Doctor(
		fullName: 'Dr Gigsy',
		qualification: 'PHD',
		position: 'Heart Surgeon',
		doctorEmail: 'Gigsy@NHSDoctor.com',
		password: 'Gigsy123',
		doctorOffice: '1942',
		doctorPhone: '01337 553 196',
		bio: 'Great doctor',
		nurses: nurse3,	
		surgeries: surgery3).save()


	def patient1 = new Patient(
		patientName: 'Juan Smith',
		patientAddress: '11 Smorc Street',
		patientResidence: 'Sheffield',
		patientDob: new Date('23/01/1990'),
		patientID: "1",
		dateRegistered: new Date('05/05/2015'),
		patientPhone: '071324112',
		surgery: surgery1,
		doctor: doctor1).save()
	
	def patient2 = new Patient(
		patientName: 'Jim Fixit',
		patientAddress: '11 Kappa Road',
		patientResidence: 'Barnsley',
		patientDob: new Date('05/01/1990'),
		patientID: "2",
		dateRegistered: new Date('05/07/2017'),
		patientPhone: '0713233112',
		surgery: surgery2,
		doctor: doctor2).save()

	def patient3 = new Patient(
		patientName: 'Tom Zanetti',
		patientAddress: '11 WutFace Avenue',
		patientResidence: 'Doncaster',
		patientDob: new Date('01/08/1985'),
		patientID: "3",
		dateRegistered: new Date('05/09/2011'),
		patientPhone: '071324115',		
		surgery: surgery3,
		doctor: doctor3).save()
	

	def appointment1 = new Appointment(
		appID: '01',
		appDate: new Date('18/05/2021'),
		appTime: '09:00',
		appDuration: '60',
		roomNumber: '01',
		patient: patient1,
		doctor: doctor1,
		surgery: surgery1).save()

	def appointment2 = new Appointment(
		appID: '02',
		appDate: new Date('15/06/2021'),
		appTime: '10:30',
		appDuration: '45',
		roomNumber: '02',
		patient: patient2,
		doctor: doctor2,
		surgery: surgery2).save()

	def appointment3 = new Appointment(
		appID: '03',
		appDate: new Date('08/06/2021'),
		appTime: '11:00',
		appDuration: '30',
		roomNumber: '03',
		patient: patient3,
		doctor: doctor3,
		surgery: surgery3).save()

	def prescription1 = new Prescription(
		pharmacyName: 'Boots',
		prescripNumber: '1',
		daysOfSupply: '30',
		medicine: 'Amoxicillin',
		totalCost: '13.00',
		dateIssued: new Date('05/07/2021'),
		patientPaying: true,
		doctor: doctor1,
		patient: patient1).save()
	
	def prescription2 = new Prescription(
		pharmacyName: 'Waitrose',
		prescripNumber: '2',
		daysOfSupply: '30',
		medicine: 'Penicillin',
		totalCost: '15.00',
		dateIssued: new Date('05/06/2021'),
		patientPaying: true,
		doctor: doctor2,
		patient: patient2).save()
	
	def prescription3 = new Prescription(
		pharmacyName: 'Tesco',
		prescripNumber: '3',
		daysOfSupply: '30',
		medicine: 'Citalopram',
		totalCost: '12.00',
		dateIssued: new Date('05/05/2021'),
		patientPaying: false,
		doctor: doctor3,
		patient: patient3).save()


}
    def destroy = {
    }
}
