package com.projet.gl.quizzHandler.storage

import java.net.HttpURLConnection
import java.net.URL

fun GETrequest(): String {
    val url = URL("http://www.google.com/")
    var data = ""
    val thread = Thread {
        with(url.openConnection() as HttpURLConnection) {
            requestMethod = "GET"  // optional default is GET
            inputStream.bufferedReader().use {
                it.forEachLine { line ->
                    data += line
                }
            }
        }
    }

    thread.start()


    return data
}

