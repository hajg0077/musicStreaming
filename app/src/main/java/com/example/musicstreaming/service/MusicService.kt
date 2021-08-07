package com.example.musicstreaming.service

import retrofit2.Call
import retrofit2.http.GET

interface MusicService {

    @GET("/v3/c4b971fa-ba86-4dcb-9b14-c84eeaefc79c")
    fun listMusics(): Call<MusicDto>
}