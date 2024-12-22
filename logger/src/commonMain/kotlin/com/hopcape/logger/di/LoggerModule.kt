package com.hopcape.logger.di

import com.hopcape.logger.logger.Logger
import com.hopcape.logger.system_logger.SystemLogger
import org.koin.core.module.Module
import org.koin.dsl.module

internal val loggerModule: Module = module {
    single<Logger> {
        SystemLogger()
    }
}