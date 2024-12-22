package com.hopcape.logger.logger

data class Log(
    val source: String,
    val message: String?,
    val status: Status = Status.INFO
)
