package com.moses.design.pattern.mediator.session;

import lombok.Setter;

import java.sql.Connection;
import java.util.Map;

/**
 *
 */
@Setter
public class Configuration {
    public Connection connection;
    protected Map<String, String> dataSource;
    public Map<String, XNode> mapperElement;
}
