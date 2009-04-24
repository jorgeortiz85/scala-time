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

class RichAbstractReadableInstantFieldProperty(pty: AbstractReadableInstantFieldProperty) {
  def shortText: String =
    pty.getAsShortText
  def asShortText: String =
    pty.getAsShortText
  def shortText(locale: Locale): String =
    pty.getAsShortText(locale)
  def asShortText(locale: Locale): String =
    pty.getAsShortText(locale)
  def asString: String =
    pty.getAsString
  def text: String =
    pty.getAsText
  def asText: String =
    pty.getAsText
  def text(locale: Locale): String =
    pty.getAsText(locale)
  def asText(locale: Locale): String =
    pty.getAsText(locale)
  def durationField: DurationField =
    pty.getDurationField
  def field: DateTimeField =
    pty.getField
  def fieldType: DateTimeFieldType =
    pty.getFieldType
  def leapAmount: Int =
    pty.getLeapAmount
  def leapDurationField: DurationField =
    pty.getLeapDurationField
  def maximumValue: Int =
    pty.getMaximumValue
  def maxValue: Int =
    pty.getMaximumValue
  def maximumValueOverall: Int =
    pty.getMaximumValueOverall
  def maxValueOverall: Int =
    pty.getMaximumValueOverall
  def minimumValue: Int =
    pty.getMinimumValue
  def minValue: Int =
    pty.getMinimumValue
  def minimumValueOverall: Int =
    pty.getMinimumValueOverall
  def minValueOverall: Int =
    pty.getMinimumValueOverall
  def name: String =
    pty.getName
  def rangeDurationField: DurationField =
    pty.getRangeDurationField

  def interval: Interval =
    pty.toInterval
}
