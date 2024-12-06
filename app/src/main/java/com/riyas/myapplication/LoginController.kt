package com.riyas.myapplication

class LoginController {

    fun doLogin(username: String, password: String) {
        // do login with cloud communication
    }
    private fun isValidEmail(email: String): Boolean {
        return true
    }

    private fun isValidPassword(password: String): Boolean {
        return true
    }

    fun isValidLogIn(email: String, password: String): Boolean {
        return isValidEmail(email) && isValidPassword(password)
    }
}