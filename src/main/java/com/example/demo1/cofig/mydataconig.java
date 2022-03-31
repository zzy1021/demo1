//package com.example.demo1.cofig;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import com.alibaba.druid.support.http.StatViewFilter;
//import com.alibaba.druid.support.http.StatViewServlet;
//import com.sun.org.apache.bcel.internal.generic.NEW;
//import com.sun.org.glassfish.gmbal.Description;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//import java.sql.SQLException;
//
////@Configuration
//public class mydataconig {
//
//    @ConfigurationProperties("spring.datasource")
////    @Bean
//    public DataSource dataSource() throws SQLException {
//        DruidDataSource druidDataSource = new DruidDataSource();
////        druidDataSource.setFilters("stat");
////        druidDataSource.addConnectionProperty("loginUsername","admin");
////        druidDataSource.addConnectionProperty("loginPassword","123456");
//        return druidDataSource;
//    }
////    @Bean
//    public ServletRegistrationBean servletRegistrationBean(){
//        StatViewServlet statViewServlet = new StatViewServlet();
//        ServletRegistrationBean<StatViewServlet> statViewServletServletRegistrationBean = new ServletRegistrationBean<>(statViewServlet, "/druid/*");
//        return statViewServletServletRegistrationBean;
//    }
//}
