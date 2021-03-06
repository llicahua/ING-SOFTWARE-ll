package net.cyancj.sistemae_cepuns.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Configuration
public class AppServlet extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{JpaHibernate.class,AppMVC.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{AppMVC.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
