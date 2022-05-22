package DIUsingSelfTypes

object DIUsingSelfTypesBootstrap extends App {
  val response = ComponentRegistry.loginService.login("Mukesh")
  println(s"Response:::: ${response}")
}
