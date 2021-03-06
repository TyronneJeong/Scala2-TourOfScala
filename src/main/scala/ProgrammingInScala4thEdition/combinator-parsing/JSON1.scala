package ProgrammingInScala4thEdition.combinator-parsing

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

import scala.util.parsing.combinator.syntactical._
import scala.util.parsing.input.StreamReader

import scala.util.parsing.combinator._

class JSON1 extends JavaTokenParsers {   

  def obj: Parser[Map[String, Any]] = 
    "{"~> repsep(member, ",") <~"}" ^^ (Map() ++ _)

  def arr: Parser[List[Any]] =
    "["~> repsep(value, ",") <~"]" 

  def member: Parser[(String, Any)] = 
    stringLiteral~":"~value ^^ 
      { case name~":"~value => (name, value) }

  def value: Parser[Any] = (
    obj
  | arr 
  | stringLiteral
  | floatingPointNumber ^^ (_.toDouble) 
  | "null"  ^^ (x => null) 
  | "true"  ^^ (x => true) 
  | "false" ^^ (x => false)
  )
}

//object JSON1Test extends JSON1 {
//  def main(args: Array[String]) {
//    val reader = StreamReader(new java.io.FileReader(args(0)))
//    val tokens = new lexical.Scanners.Scanner(reader)
//    println(phrase(value)(tokens))
//  }
//}
