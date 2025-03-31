package org.apache.flink.connector.jdbc.databases.dameng.dialect;

import org.apache.flink.annotation.Internal;
import org.apache.flink.connector.jdbc.dialect.JdbcDialect;
import org.apache.flink.connector.jdbc.dialect.JdbcDialectFactory;

/**
 * @author gaoyuan
 * @date 2025-03-28$
 */
@Internal
public class DamengDialectFactory implements JdbcDialectFactory {
    @Override
    public boolean acceptsURL(String url) {
        return url.startsWith("jdbc:dm:");
    }

    @Override
    public JdbcDialect create() {
        return new Damengdialect();
    }

}
