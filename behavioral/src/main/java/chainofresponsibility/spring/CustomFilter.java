package chainofresponsibility.spring;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("loggingFilter")
public class CustomFilter implements Filter {

  private static final Logger logger = LoggerFactory.getLogger(CustomFilter.class);

  @Override
  public void init(FilterConfig config) {
  }

  @Override
  public void doFilter(ServletRequest request, ServletResponse response,
                       FilterChain chain) throws IOException, ServletException {
    HttpServletRequest req = (HttpServletRequest) request;
    logger.info("Request Info : {}", req);
    chain.doFilter(request, response);
  }

  @Override
  public void destroy() {
  }
}