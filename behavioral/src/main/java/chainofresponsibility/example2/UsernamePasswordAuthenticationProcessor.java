package chainofresponsibility.example2;

public class UsernamePasswordAuthenticationProcessor extends AuthenticationProcessor {

  public UsernamePasswordAuthenticationProcessor(AuthenticationProcessor nextProcessor) {
    super(nextProcessor);
  }

  @Override
  public boolean isAuthorized(AuthenticationProvider authProvider) {
    if (authProvider instanceof UsernamePasswordProvider) {
      return Boolean.TRUE;
    }
    return Boolean.FALSE;
  }

  @Override
  public String getProcessorName() {
    return "UsernamePasswordAuthenticationProcessor";
  }

}