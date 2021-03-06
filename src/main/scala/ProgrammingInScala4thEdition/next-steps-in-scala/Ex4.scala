package ProgrammingInScala4thEdition.next-steps-in-scala

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

import scala.io.Source

object Ex4 {
  def main(args: Array[String]): Unit = {
    def countchars2(args: Array[String]): Unit = {
      def widthOfLength(s: String) = s.length.toString.length

      if (args.length > 0) {
        val lines = Source.fromFile(args(0)).getLines().toList
        var maxWidth = 0
        for (line <- lines)
          maxWidth = maxWidth.max(widthOfLength(line))
        println("maxWidth [" + (maxWidth) + "]")
      }
    }
    countchars2(Array("countchars1.scala"))
  }
}
