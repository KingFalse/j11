package com.example.j11

import org.springframework.http.MediaType
import java.net.URI
import java.net.http.HttpRequest
import java.time.Duration

fun main() {
    val build = HttpRequest.newBuilder()
            .uri(URI.create(""))
            .header("", MediaType.APPLICATION_JSON_VALUE)
            .timeout(Duration.ofSeconds(10))
            .POST(HttpRequest.BodyPublishers.ofString(""))
            .build()


}