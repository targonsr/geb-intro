package pages

import geb.Page

class LoginPage extends Page {
    static at = {
        emailInput.displayed
        passInput.displayed
    }
    static content = {
        emailInput(wait: true) { loginForm.$("#loginEmail") }
        passInput { loginForm.$("#loginPassword") }
        terms { $("#acceptTerms") }
        loginButton(to: DashboardPage) { $("button", text: 'Log in') }

        loginForm { $("form", name: "loginForm") }
    }
}
