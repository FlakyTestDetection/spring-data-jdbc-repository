package com.nurkiewicz.jdbcrepository.hsqldb;

import com.nurkiewicz.jdbcrepository.JdbcRepositoryGeneratedKeyTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 * @author Tomasz Nurkiewicz
 * @since 1/9/13, 10:20 PM
 */
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = JdbcRepositoryTestHsqldbConfig.class)
public class JdbcRepositoryGeneratedKeyHsqldbTest extends JdbcRepositoryGeneratedKeyTest {
}
