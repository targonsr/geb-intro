import org.openqa.selenium.Dimension
import org.openqa.selenium.Point
import org.openqa.selenium.chrome.ChromeDriver

Dimension dimension = new Dimension(1920, 1080)

baseUrl = "http://qa-card-e-service.qa.gneis.io"
reportsDir = "reports"
reportOnTestFailureOnly = true
atCheckWaiting = 20
baseNavigatorWaiting = true

driver = {
    def driverInstance = new ChromeDriver()
    driverInstance.manage().window().setPosition(new Point(0, 0))
    driverInstance.manage().window().setSize(dimension)
    driverInstance.manage().deleteAllCookies()
    driverInstance
}

waiting {
    timeout = 25
    retryInterval = 0.3
    includeCauseInMessage = true
    presets {
        quick {
            timeout = 3
        }
        half_minute {
            timeout = 30
            retryInterval = 0.5
        }
        longer {
            timeout = 90
            retryInterval = 0.5
        }
    }
}