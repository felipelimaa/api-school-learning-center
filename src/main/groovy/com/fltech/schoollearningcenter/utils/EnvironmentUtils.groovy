package com.fltech.schoollearningcenter.utils

class EnvironmentUtils {

    private static final String APPLICATION_NAME_VARIABLE_NAME = "APPLICATION_NAME"
    private static final String SYSTEM_VERSION = "SYSTEM_VERSION"

    final String applicationName
    final String systemVersion

    EnvironmentUtils() {
        applicationName = System.getenv(APPLICATION_NAME_VARIABLE_NAME)?:"schoollearningcenter"
        systemVersion = System.getenv(SYSTEM_VERSION)?:"dev"
    }

}
