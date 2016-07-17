package app

class User {
	
	Long id
	Long version
	
	String username
	String password
	boolean enabled = true
	boolean accountExpired
	boolean accountLocked
	boolean credentialsExpired
	
	String toString() {
		"$username"
	}
	
    static constraints = {
		username(blank: false, unique: true)
		password(blank: false, password: true)
    }
	
	static mapping = {
		password column: '`password`'
	}
}
