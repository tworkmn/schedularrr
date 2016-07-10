package org.example

class Biz {
	String name
	String address1
	String city
	String state
	String phone
	
    static constraints = {
		name(blank: false)
		address1(blank: false)
		city(blank: false)
		state(blank: false)
		phone(blank: false)
    }
}
