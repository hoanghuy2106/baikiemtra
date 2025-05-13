package listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.logging.Logger;

public class SessionListener implements HttpSessionListener {
    private static final Logger logger = Logger.getLogger(SessionListener.class.getName());

    public void sessionCreated(HttpSessionEvent se) {
        logger.info("Phiên làm việc mới được tạo: " + se.getSession().getId());
    }

    public void sessionDestroyed(HttpSessionEvent se) {
        logger.info("Phiên làm việc đã bị hủy: " + se.getSession().getId());
    }
}
