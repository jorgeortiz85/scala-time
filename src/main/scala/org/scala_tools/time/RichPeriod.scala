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

class RichPeriod(pd: Period) {
  def days: Int =
    pd.getDays
  def hours: Int =
    pd.getHours
  def millis: Int =
    pd.getMillis
  def minutes: Int =
    pd.getMinutes
  def months: Int =
    pd.getMonths
  def seconds: Int =
    pd.getSeconds
  def weeks: Int =
    pd.getWeeks
  def years: Int =
    pd.getYears
  def -(period: ReadablePeriod): Period =
    pd.minus(period)
  def +(period: ReadablePeriod): Period =
    pd.plus(period)
  def ago: DateTime =
    Instants.now.minus(pd)
  def from(dt: DateTime): DateTime =
    dt.plus(pd)
}
