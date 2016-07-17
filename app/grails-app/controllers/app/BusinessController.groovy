package app

class BusinessController {

    def beforeInterceptor = [action: this.&checkUser]
	
	def scaffold = Business
	
	def checkUser() {
		// do shit eventually maybe
	}
		
}
