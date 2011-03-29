package org.scala_tools.time

import org.junit.Test

class RichTupleTest {

  import org.scala_tools.time.Imports._

  @Test def testRichTuple3 {
    assert(((2010, 12, 13).toJodaDateMidnight.day) == 13)
  }

  @Test def testRichTuple7 {
    assert(((2010, 12, 13, 19, 10, 13, 120).toJodaDateTime.getDayOfMonth) == 13)
  }

  @Test def testRichTuple8WithStringTZ {
    assert(((2010, 12, 13, 19, 10, 13, 120, "US/Central").toJodaDateTime.getZone.getID) == "America/Chicago")
  }

  @Test def testRichTuple8WithTZ {
    assert(((2010, 12, 13, 19, 10, 13, 120, DateTimeZone.forID("US/Central")).toJodaDateTime.getZone.getID) ==
            "America/Chicago")
  }
}