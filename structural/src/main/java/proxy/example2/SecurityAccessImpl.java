package proxy.example2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class SecurityAccessImpl implements SecurityAccess {
  private static final Logger logger = LoggerFactory.getLogger(SecurityAccessImpl.class);

  @Override
  public void access() {
    logger.info("access to bank account");
  }
}
