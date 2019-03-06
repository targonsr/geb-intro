package tests

import geb.spock.GebReportingSpec
import pages.HomePage

class LoginAsCSRTest extends GebReportingSpec{
    def "Login as CSR test"() {
        given: "at Home Page"
        to HomePage

        when: "clicking login button"
        loginButton.click()

        and: "fulfill the form"
        emailInput << "some@email.com"
        passInput << "password"

    }
}
