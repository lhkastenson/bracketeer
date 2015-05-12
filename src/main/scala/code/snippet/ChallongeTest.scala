package code
package snippet

import code.lib._

import java.util.Date
import scala.xml.{NodeSeq, Text}

import net.liftweb._
import common._
import util._
import Helpers._
import scalaj.http._

import net.liftmodules.extras.Gravatar

object ChallongeTest extends SimpleInjector {

  // replace the contents of the element with id "time" with the date
   def render = {
   	var api_key = sys.env("CHALLONGE_API_KEY")
   	val printer = new scala.xml.PrettyPrinter(80, 2)
   	val response = Http(" https://api.challonge.com/v1/tournaments.xml").param("api_key", api_key).asString
    "#test-tournament *" #> printer.format(scala.xml.XML.loadString(response.body))
  }
}
