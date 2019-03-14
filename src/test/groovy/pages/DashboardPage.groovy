package pages

import geb.Page
import modules.SideMenuModule

class DashboardPage extends Page {
    static url = "/login"
    static at = {
        side.searchForUser.displayed
        side.signupRequests.displayed
    }
    static content = {
        side { module SideMenuModule }
    }
    def "we are the champions"() {
        return side.searchForUser
    }
}
