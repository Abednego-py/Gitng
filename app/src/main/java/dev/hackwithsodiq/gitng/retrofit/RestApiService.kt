package dev.hackwithsodiq.gitng.retrofit

import retrofit2.http.GET

interface RestApiService {

    @GET("users")
    suspend fun getUsers():List<UserObject>
}