package specs

import configuration.TestData
import geb.spock.GebReportingSpec
import spock.lang.Shared

class TestSpec extends GebReportingSpec{
    @Shared data = TestData.data
}
