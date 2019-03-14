package modules

import geb.Module

class SideMenuModule extends Module {
    static content = {
        searchForUser { $("a", text: contains('Search for user')) }
        signupRequests {$("a", text: contains('Signup requests'))}
        customerActivity {$("a", text: contains('Customer activity'))}
        notifications {$("a", text: contains('Notifications'))}
    }
}
