package DIUsingSelfTypes

case class Response(res: String)

trait AuthenticationService {
  def authenticate(userInfo: String) : Response
}