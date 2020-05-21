package com.loong.learJava;

import com.loong.learJava.entity.User;
import com.loong.learJava.service.UserService;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@ComponentScan
@PropertySource("jdbc.properties")
@EnableTransactionManagement // 使用声明式事务
public class AppConfig {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
//        userService.register("bob@example.com", "password1", "Bob");
        User user = userService.login("bob@example.com", "password1");
        System.out.println(user);
//        userService.register("bob@example.com", "password1", "Bob");
//        userService.register("alice@example.com", "password2", "Alice");
//        User bob = userService.getUserByName("Bob");
//        System.out.println(bob);
//        User tom = userService.register("tom@example.com", "password3", "Tom");
//        System.out.println(tom);
        context.close();
    }


    @Value("${jdbc.url}")
    String jdbcUrl;

    @Value("${jdbc.username}")
    String jdbcUsername;

    @Value("${jdbc.password}")
    String jdbcPassword;

    @Bean
    DataSource createDataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(jdbcUrl);
        config.setUsername(jdbcUsername);
        config.setPassword(jdbcPassword);
        config.addDataSourceProperty("autoCommit", true);
        config.addDataSourceProperty("connectionTimeout", 5);
        config.addDataSourceProperty("idleTimeout", "60");
        return new HikariDataSource(config);
    }

//    @Bean
//    JdbcTemplate createJdbcTemplate(@Autowired DataSource dataSource) {
//        return new JdbcTemplate(dataSource);
//    }
//
//    @Bean
//    PlatformTransactionManager createTxManager(@Autowired DataSource dataSource) {
//        return new DataSourceTransactionManager(dataSource);
//    }

    @Bean
    LocalSessionFactoryBean createSessionFactory(@Autowired DataSource dataSource) {
        Properties props = new Properties();
        // 自动生成表结构
        props.setProperty("hibernate.hbm2ddl.auto", "update"); // 生产环境不要使用
        // 指示Hibernate使用的数据库是HSQLDB。Hibernate使用一种HQL的查询语句，它和SQL类似，但真正在“翻译”成SQL时，会根据设定的数据库“方言”来生成针对数据库优化的SQL；
        props.setProperty("hibernate.dialect", "org.hibernate.dialect.HSQLDialect");
        // 让Hibernate打印执行的SQL，这对于调试非常有用，我们可以方便地看到Hibernate生成的SQL语句是否符合我们的预期。
        props.setProperty("hibernate.show_sql", "true");
        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource);
        // 扫描指定的package获取所有entity class:
        sessionFactoryBean.setPackagesToScan("com.loong.learJava.entity");
        sessionFactoryBean.setHibernateProperties(props);
        return sessionFactoryBean;
    }

    @Bean
    HibernateTemplate createHibernateTemplate(@Autowired SessionFactory sessionFactory) {
        return new HibernateTemplate(sessionFactory);
    }

    @Bean
    PlatformTransactionManager createTxManager(@Autowired SessionFactory sessionFactory) {
        return new HibernateTransactionManager(sessionFactory);
    }
}
