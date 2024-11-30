package chainofresponsibility.example2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AuthenticationProcessor {

  private static final Logger logger = LoggerFactory.getLogger(AuthenticationProcessor.class);

  private AuthenticationProcessor nextProcessor;

  protected AuthenticationProcessor(AuthenticationProcessor nextProcessor) {
    this.nextProcessor = nextProcessor;
  }

  protected abstract boolean isAuthorized(AuthenticationProvider authProvider);

  public AuthenticationProcessor getNextProcessor() {
    return nextProcessor;
  }

  public void setNextProcessor(AuthenticationProcessor nextProcessor) {
    this.nextProcessor = nextProcessor;
  }


  public boolean processAuthorization(AuthenticationProvider authProvider) {
    logger.info("{} started check", getProcessorName());
    boolean result = isAuthorized(authProvider);
    logger.info("{} check result: {}", getProcessorName(), result);
    if (!result && nextProcessor != null) {
      return nextProcessor.processAuthorization(authProvider);
    }
    return result;
  }

  protected abstract String getProcessorName();

}