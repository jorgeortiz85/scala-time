/**
 * Copyright 2009 Jorge Ortiz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 *
 **/
package org.scala_tools.time

import org.scala_tools.time.Implicits._
import org.joda.time._

object Intervals extends Intervals

trait Intervals {  
  def thisSecond = Instants.now.second.interval
  def thisMinute = Instants.now.minute.interval
  def thisHour   = Instants.now.hour.interval
  def thisDay    = Instants.now.day.interval
  def today      = Instants.now.day.interval
  def thisWeek   = Instants.now.week.interval
  def thisMonth  = Instants.now.month.interval
  def thisYear   = Instants.now.year.interval

  def nextSecond = Instants.nextSecond.second.interval
  def nextMinute = Instants.nextMinute.minute.interval
  def nextHour   = Instants.nextHour.hour.interval
  def nextDay    = Instants.nextDay.day.interval
  def tomorrow   = Instants.nextDay.day.interval
  def nextWeek   = Instants.nextWeek.week.interval
  def nextMonth  = Instants.nextMonth.month.interval
  def nextYear   = Instants.nextYear.year.interval

  def lastSecond = Instants.lastSecond.second.interval
  def lastMinute = Instants.lastMinute.minute.interval
  def lastHour   = Instants.lastHour.hour.interval
  def lastDay    = Instants.lastDay.day.interval
  def yesterday  = Instants.lastDay.day.interval
  def lastWeek   = Instants.lastWeek.week.interval
  def lastMonth  = Instants.lastMonth.month.interval
  def lastYear   = Instants.lastYear.year.interval
}
