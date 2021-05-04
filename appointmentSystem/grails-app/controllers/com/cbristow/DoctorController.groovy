package com.cbristow

class DoctorController {

    def scaffold = Doctor

def login(){


}

def validate(){

def user2 = Doctor.findByDoctorEmail(params.username)

if (user2 && user2.password == params.password){

session.user2 = user2

render view:'home'

}

else {

flash.message = "Invalid username or Password"

render view:'login'

}
}

def logout ={

session.user2 = null

redirect (uri:'/')
}
}
