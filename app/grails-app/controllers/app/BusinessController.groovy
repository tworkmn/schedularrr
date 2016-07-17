package app

class BusinessController {

    def beforeInterceptor = [action: this.&checkUser]
	
	def scaffold = Business
	
	def checkUser() {
		if(!session.user) {
			// i.e. user is NOT logged in
			redirect(controller: 'user', action: 'login')
			return false
		}
	}
		
}
