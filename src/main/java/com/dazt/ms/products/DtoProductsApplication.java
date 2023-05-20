package com.dazt.ms.products;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * DtoProductsApplication.
 *
 * @author David Alvarez.
 * @version 1.0.0, 20-09-2022
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class})
public class DtoProductsApplication {


}