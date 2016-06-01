package com.pizzaa.application;

import com.pizzaa.infrastructure.dbrepository.AdminRepositoryIM;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jjpikoov on 5/31/16.
 */
@Configuration
//@ComponentScan({SpringConfiguration.class, AdminServiceIM.class})
@ComponentScan(basePackageClasses = {SpringConfiguration.class, AdminServiceIM.class, AdminRepositoryIM.class})
public class Config {
}
