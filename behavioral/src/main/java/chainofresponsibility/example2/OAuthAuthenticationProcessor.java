package chainofresponsibility.example2;

public class OAuthAuthenticationProcessor extends AuthenticationProcessor {

  public OAuthAuthenticationProcessor(AuthenticationProcessor nextProcessor) {
    super(nextProcessor);
  }

  @Override
  public boolean isAuthorized(AuthenticationProvider authProvider) {
    if (authProvider instanceof OAuthTokenProvider) {
      return Boolean.TRUE;
    }
    return Boolean.FALSE;
  }

  @Override
  public String getProcessorName() {
    return "OAuthAuthenticationProcessor";
  }

}