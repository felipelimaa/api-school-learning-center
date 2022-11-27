package com.fltech.schoollearningcenter.infrastructure.logging

interface Logger {

    LogMessage createMessage(String component, String message)
}
