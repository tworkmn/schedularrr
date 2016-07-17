package app

class Business {
	
	Long id
	Long version
	
	String name
	String address
	String city
	String zip
	String state

    static constraints = {
		name(blank:false)
		address(blank:false)
		city(blank:false)
		zip(blank:false)
		state(blank:false)
    }
}
