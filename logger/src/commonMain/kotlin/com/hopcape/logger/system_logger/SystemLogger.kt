package com.hopcape.logger.system_logger

import com.hopcape.logger.logger.Log
import com.hopcape.logger.logger.Logger

internal class SystemLogger: Logger {

    override fun log(log: Log) {
        with(log){
            println(
                "[ LogSource -> $source ] " +
                        "[ Status -> ${status.name} ]" +
                        "[ Message -> $message ]"
            )
        }
    }
}