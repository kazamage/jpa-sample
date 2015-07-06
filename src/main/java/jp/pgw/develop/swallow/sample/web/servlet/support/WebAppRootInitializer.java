package jp.pgw.develop.swallow.sample.web.servlet.support;

import jp.pgw.develop.swallow.sample.config.AppConfig;
import jp.pgw.develop.swallow.sample.persistence.PersistenceConfig;
import org.springframework.core.annotation.Order;
import org.springframework.web.context.AbstractContextLoaderInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@Order(1)
public class WebAppRootInitializer extends AbstractContextLoaderInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext);
    }

    @Override
    protected WebApplicationContext createRootApplicationContext() {
        AnnotationConfigWebApplicationContext rootAppContext = new AnnotationConfigWebApplicationContext();
        rootAppContext.register(new Class[]{AppConfig.class, PersistenceConfig.class});
        return rootAppContext;
    }

}
