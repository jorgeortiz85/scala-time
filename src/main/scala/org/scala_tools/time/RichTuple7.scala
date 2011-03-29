package org.scala_tools.time

import org.joda.time.DateTime

/** Wrapper that used in an implicit to convert a tuple of year, month, day, hour, minute, second, and millis into
  *  either a java.sql.Date, a java.util.Date, or org.jodatime.DateTime
  *
  *  {{{(2010, 12, 13, 19, 10, 13, 120).toJodaDateTime}}}
  *     will return a [[org.jodatime.DateTime]] object at 7:10:13:120 PM on 12/13/2010 UTC.
  *
  *  {{{(2010, 12, 13, 19, 10, 13, 120).toJavaSQLDate}}}
  *     will return a [[java.sql.Date]] object at 7:10:13:120 PM on 12/13/2010 UTC.
  *
  *  {{{(2010, 12, 13, 19, 10, 13, 120).toJavaDate}}}
  *     will return a [[java.util.Date]] object at 7:10:13:120 PM on 12/13/2010 UTC.
  *
  * @author Daniel Hinojosa
  * @param underlying the Tuple7 that will be decorated */
class RichTuple7(underlying: Tuple7[Int, Int, Int, Int, Int, Int, Int]) {

  /** Converts the tuple member variable to a [[java.sql.Date]]
    * @returns [[java.util.Date]] representation of the tuple member variable */
  def toJavaSQLDate = new java.sql.Date(toJavaDate.getTime)

  /** Converts the tuple member variable to a [[java.util.Date]]
    * @returns [[java.util.Date]] representation of the tuple member variable */
  def toJavaDate = toJodaDateTime.toDate

  /** Converts the tuple member variable to a [[org.joda.time.DateTime]]
    * @returns [[org.joda.time.DateTime]] representation of the tuple member variable */
  def toJodaDateTime = new DateTime(underlying._1, underlying._2, underlying._3, underlying._4, underlying._5,
    underlying._6, underlying._7)
}