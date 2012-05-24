package org.scala_tools.time

import org.joda.time._

/** Wrapper that used in an implicit to convert a tuple of year, month, day into
  *  either a [[java.sql.Date]], a [[java.util.Date]], or [[org.jodatime.DateMidnight]]
  *
  *  {{{(2010, 12, 13).toJodaDateTime}}}
  *     will return a [[org,jodatime.DateMidnight]] object.
  *
  *  {{{(2010, 12, 13).toJavaSQLDate}}}
  *     will return a [[java.sql.Date]] object at midnight on 12/13/2010 UTC.
  *
  *  {{{(2010, 12, 13, 19, 10, 13, 120).toJavaDate}}}
  *     will return a [[java.util.Date]] object at midnight on 12/13/2010 UTC.
  *
  * @author Daniel Hinojosa
  * @param underlying the Tuple3 that will be decorated */
 class RichTuple3(underlying: Tuple3[Int, Int, Int]) {

  /** Converts the tuple member variable to a [[java.sql.Date]]
    * @returns [[java.util.Date]] representation of the tuple member variable */
   def toJavaSQLDate = new java.sql.Date(toJavaDate.getTime)

  /** Converts the tuple member variable to a [[java.util.Date]]
    * @returns [[java.util.Date]] representation of the tuple member variable */
   def toJavaDate = toJodaDateMidnight.toDate

  /** Converts the tuple member variable to a [[org.joda.time.DateMidnight]]
   * @returns [[org.joda.time.DateMidnight]] representation of the tuple member variable */
   def toJodaDateMidnight = new DateMidnight(underlying._1, underlying._2, underlying._3)
}
