package deakin.gopher.guardian.model.login

data class Password(val password: String) {
    fun isValid(): Boolean {
        return password.length >= 6
    }

    fun confirmWith(other: String): Boolean {
        return password == other
    }
}
