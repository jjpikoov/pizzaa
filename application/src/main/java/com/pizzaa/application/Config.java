package com.pizzaa.application;

import com.pizzaa.infrastructure.dbrepository.AdminRepositoryIM;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jjpikoov on 5/31/16.
 */
@Configuration
@ComponentScan(basePackageClasses = {AdminRepositoryIM.class, AdminServiceIM.class, SpringConfiguration.class})
public class Config {
}
