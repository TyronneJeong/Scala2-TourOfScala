package ProgrammingInScala4thEdition./** Finally, a Point class with a good equals method and
 *  a good hashCode method. */
object Points3 {
  class Point(val x: Int, val y: Int) {
    override def hashCode = (x, y).##
    override def equals(other: Any) = other match {
      case that: Point => this.x == that.x && this.y == that.y
      case _ => false
    }
  }
}equality

/*
 * Copyright (C) 2007-2019 Artima, Inc. All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Example code from:
 *
 * Programming in Scala, Fourth Edition
 * by Martin Odersky, Lex Spoon, Bill Venners
 *
 * http://booksites.artima.com/programming_in_scala_4ed
 */

/** Finally, a Point class with a good equals method and
 *  a good hashCode method. */
object Points3 {
  class Point(val x: Int, val y: Int) {
    override def hashCode = (x, y).##
    override def equals(other: Any) = other match { 
      case that: Point => this.x == that.x && this.y == that.y 
      case _ => false 
    }
  }
}
