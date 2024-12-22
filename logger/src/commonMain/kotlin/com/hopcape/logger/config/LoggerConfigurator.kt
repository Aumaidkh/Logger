package com.hopcape.logger.config

import com.hopcape.logger.di.loggerModule
import org.koin.core.context.loadKoinModules

fun configureLogger(config: LoggerConfiguration){
    loadKoinModules(loggerModule)
}