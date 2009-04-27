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

object Imports extends Imports
object TypeImports extends TypeImports
object StaticForwarderImports extends StaticForwarderImports

trait Imports extends TypeImports with StaticForwarderImports with Implicits

trait TypeImports {
  type DateTime     = org.joda.time.DateTime
  type Interval     = org.joda.time.Interval
  type Duration     = org.joda.time.Duration
  type Period       = org.joda.time.Period
  type DateTimeZone = org.joda.time.DateTimeZone
  type Chronology   = org.joda.time.Chronology
}

trait StaticForwarderImports {
  val DateTime     = org.scala_tools.time.StaticDateTime
  val Interval     = org.scala_tools.time.StaticInterval
  val Duration     = org.scala_tools.time.StaticDuration
  val Period       = org.scala_tools.time.StaticPeriod
  val DateTimeZone = org.scala_tools.time.StaticDateTimeZone
}
