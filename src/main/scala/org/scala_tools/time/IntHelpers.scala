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

import org.joda.time._

class IntHelpers(n: Int) {
  def millis: Period = Period.millis(n)
  def seconds: Period = Period.seconds(n)
  def minutes: Period = Period.minutes(n)
  def hours: Period = Period.hours(n)
  def days: Period = Period.days(n)
  def weeks: Period = Period.weeks(n)
  def months: Period = Period.months(n)
  def years: Period = Period.years(n)

  def milli: Period = Period.millis(n)
  def second: Period = Period.seconds(n)
  def minute: Period = Period.minutes(n)
  def hour: Period = Period.hours(n)
  def day: Period = Period.days(n)
  def week: Period = Period.weeks(n)
  def month: Period = Period.months(n)
  def year: Period = Period.years(n)
}
