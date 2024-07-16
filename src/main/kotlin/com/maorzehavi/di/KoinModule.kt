package com.maorzehavi.di

import com.maorzehavi.repository.HeroRepository
import com.maorzehavi.repository.HeroRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<HeroRepository> {
        HeroRepositoryImpl()
    }
}