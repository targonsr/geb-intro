package pages

import geb.Page
import modules.SideMenuModule

class DashboardPage extends Page {
    static at = {
        side.searchForUser.displayed
    }
    static content = {
        side { module SideMenuModule }
    }
}
