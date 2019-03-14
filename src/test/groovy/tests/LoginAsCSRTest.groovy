package tests

import pages.DashboardPage
import pages.HomePage
import specs.TestSpec
import spock.lang.Unroll

class LoginAsCSRTest extends TestSpec {

    @Unroll
    def "Login as #email CSR test"() {
        given: "at Home Page"
        to HomePage

        when: "clicking login button"
        loginButton.click()

        then: "redirected to login form"
        currentUrl.contains('login')

        when: "fulfill the form"
        emailInput << email
        passInput << pass
        terms.click()

        and: "click log in button"
        loginButton.click()

        then: "we're on CSR search page"
        at(DashboardPage)

        where:
        email = data.csr.email
        pass = data.csr.pass
    }
}
