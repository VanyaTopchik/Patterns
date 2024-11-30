package chainofresponsibility.example2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    AuthenticationProcessor oAuthProcessor = new OAuthAuthenticationProcessor(null);
    AuthenticationProcessor unamePasswordProcessor = new UsernamePasswordAuthenticationProcessor(oAuthProcessor);

    logger.info("is authorized by username and password: {}", unamePasswordProcessor.processAuthorization(new UsernamePasswordProvider()));
    logger.info("is authorized by oAuth: {}", unamePasswordProcessor.processAuthorization(new OAuthTokenProvider()));
    logger.info("is authorized by saml: {}", unamePasswordProcessor.processAuthorization(new SamlAuthenticationProvider()));
  }
}
