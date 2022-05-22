package DIUsingSelfTypes

trait OAuthAuthenticationServiceComponent {
  val authenticationService: AuthenticationService

  class OAuthAuthenticationService extends AuthenticationService {
    def authenticate(userInfo: String) : Response = {
      println(s"Authenticating userInfo: ${userInfo}")
      Response("Authenticated!!!")
    }
  }
}