package DIUsingSelfTypes

trait LoginServiceComponent { this: OAuthAuthenticationServiceComponent =>

  val loginService: LoginService

  class LoginService {
    def login(userInfo: String) : Response =   authenticationService.authenticate(userInfo)
  }
}