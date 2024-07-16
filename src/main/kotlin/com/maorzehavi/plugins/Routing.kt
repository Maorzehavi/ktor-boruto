package com.maorzehavi.plugins

import com.maorzehavi.routes.getAllHeroes
import com.maorzehavi.routes.root
import com.maorzehavi.routes.searchHeroes
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        root()
        getAllHeroes()
        searchHeroes()

        staticResources(remotePath = "/images", basePackage = "images")
    }
}
