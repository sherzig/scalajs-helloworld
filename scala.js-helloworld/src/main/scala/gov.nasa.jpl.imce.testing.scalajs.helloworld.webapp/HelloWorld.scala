import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.{RawJSType, ExposedJSMember, JSExport}

object HelloWorld extends JSApp {

  @JSExport("myList")
  val myList = List("One", "Two", "Three")

  def main(): Unit = {
    println("Hello world!")
  }

  @JSExport
  def foo() = {
    println("Foo was called!")
  }

}