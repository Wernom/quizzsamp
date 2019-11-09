package com.projet.gl.quizzHandler.storage

interface ApiResponse {
    fun onSuccess(response: String)
    fun onError()
}