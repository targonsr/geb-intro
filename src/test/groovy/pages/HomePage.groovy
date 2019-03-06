package pages

import geb.Page

class HomePage extends Page {
    static at = {
        loginButton.displayed
        title == 'Card E-services - Circle K'
    }
    static content = {
        loginButton(wait: true, to: LoginPage) { $("a#example1 button") }
    }

}
