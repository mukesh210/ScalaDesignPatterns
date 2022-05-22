package DIUsingSelfTypes

object ComponentRegistry extends LoginServiceComponent
  with OAuthAuthenticationServiceComponent {
  override val loginService: ComponentRegistry.LoginService = new LoginService

  override val authenticationService: AuthenticationService = new OAuthAuthenticationService
}