package modules

import geb.Module

class SideMenuModule extends Module {
    static content = {
        searchForUser { $("a", text: contains('Search for user')) }
    }
}
