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
object BuilderImplicits extends Implicits
object IntImplicits extends IntImplicits
object JodaImplicits extends JodaImplicits

trait Implicits extends BuilderImplicits with IntImplicits with JodaImplicits

trait BuilderImplicits {
  implicit def forcePeriod(builder: DurationBuilder): Period =
    builder.underlying
  implicit def forceDuration(builder: DurationBuilder): Duration =
    builder.underlying.toStandardDuration
}

trait IntImplicits {
  implicit def RichInt(n: Int) = new org.scala_tools.time.RichInt(n)
  implicit def RichLong(n: Long) = new org.scala_tools.time.RichLong(n)
}

trait JodaImplicits {
  implicit def RichAbstractReadableInstantFieldProperty(pty: AbstractReadableInstantFieldProperty) =
    new RichAbstractReadableInstantFieldProperty(pty)
  implicit def RichChronology(ch: Chronology) = new RichChronology(ch)
  implicit def RichDateMidnight(dm: DateMidnight) = new RichDateMidnight(dm)
  implicit def RichDateTime(dt: DateTime) = new RichDateTime(dt)
  implicit def RichDateTimeProperty(pty: DateTime.Property) = new RichDateTimeProperty(pty)
  implicit def RichDateTimeZone(zone: DateTimeZone) = new RichDateTimeZone(zone)
  implicit def RichDuration(dur: Duration) = new RichDuration(dur)
  implicit def RichInstant(in: Instant) = new RichInstant(in)
  implicit def RichPeriod(per: Period) = new RichPeriod(per)
  implicit def RichReadableDateTime(dt: ReadableDateTime) = new RichReadableDateTime(dt)
  implicit def RichReadableDuration(dur: ReadableDuration) = new RichReadableDuration(dur)
  implicit def RichReadableInstant(in: ReadableInstant) = new RichReadableInstant(in)
  implicit def RichReadableInterval(in: ReadableInterval) = new RichReadableInterval(in)
  implicit def RichReadablePeriod(per: ReadablePeriod) = new RichReadablePeriod(per)
}
