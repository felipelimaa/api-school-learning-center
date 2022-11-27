package com.fltech.schoollearningcenter.infrastructure.logging

import com.fltech.schoollearningcenter.infrastructure.logging.impl.Log4JCorrelationLogger
import com.fltech.schoollearningcenter.utils.EnvironmentUtils

class LoggerFactory {

    private static final EnvironmentUtils environmentUtils

    static {
        environmentUtils = new EnvironmentUtils()
    }

    static Logger createLogger(Class<?> toLog) {
        return new Log4JCorrelationLogger(toLog, environmentUtils)
    }
}
