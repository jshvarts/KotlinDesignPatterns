package statepattern

sealed class AuthState {
    class Unauthenticated : AuthState()
    class Authenticated(val userName: String) : AuthState()
}