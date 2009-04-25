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

import java.util.Locale
import org.joda.time._
import org.joda.time.field.AbstractReadableInstantFieldProperty

object Implicits extends Implicits
object IntImplicits extends IntImplicits
object JodaImplicits extends JodaImplicits

trait Implicits extends IntImplicits with JodaImplicits

trait IntImplicits {
  implicit def intHelpers(n: Int) = new IntHelpers(n)
}

trait JodaImplicits {
  implicit def richAbstractReadableInstantFieldProperty(pty: AbstractReadableInstantFieldProperty) =
    new RichAbstractReadableInstantFieldProperty(pty)
  implicit def richChronology(ch: Chronology) = new RichChronology(ch)
  implicit def richDateMidnight(dm: DateMidnight) = new RichDateMidnight(dm)
  implicit def richDateTime(dt: DateTime) = new RichDateTime(dt)
  implicit def richDateTimeProperty(pty: DateTime.Property) = new RichDateTimeProperty(pty)
  implicit def richDateTimeZone(zone: DateTimeZone) = new RichDateTimeZone(zone)
  implicit def richDuration(dur: Duration) = new RichDuration(dur)
  implicit def richInstant(in: Instant) = new RichInstant(in)
  implicit def richPeriod(per: Period) = new RichPeriod(per)
  implicit def richReadableDateTime(dt: ReadableDateTime) = new RichReadableDateTime(dt)
  implicit def richReadableDuration(dur: ReadableDuration) = new RichReadableDuration(dur)
  implicit def richReadableInstant(in: ReadableInstant) = new RichReadableInstant(in)
  implicit def richReadableInterval(in: ReadableInterval) = new RichReadableInterval(in)
  implicit def richReadablePeriod(per: ReadablePeriod) = new RichReadablePeriod(per)
}
