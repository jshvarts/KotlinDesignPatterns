package statepattern

class AuthProcessor {
    private var state: AuthState = AuthState.Unauthenticated()

    fun loginUser(userLogin: String) {
        state = AuthState.Authenticated(userLogin)
    }

    fun logoutUser() {
        state = AuthState.Unauthenticated()
    }

    val isLoggedIn: Boolean
        get() = when (state) {
                    is AuthState.Authenticated -> true
                    else -> false
        }

    val userLogin: String
        get() = when (state) {
                is AuthState.Authenticated -> (state as AuthState.Authenticated).userName
                is AuthState.Unauthenticated -> "Unknown"
        }

    override fun toString(): String {
        return "User '$userLogin' is logged in: $isLoggedIn"
    }
}