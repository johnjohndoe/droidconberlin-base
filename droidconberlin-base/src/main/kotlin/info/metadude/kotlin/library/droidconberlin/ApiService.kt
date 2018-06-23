package info.metadude.kotlin.library.droidconberlin

import info.metadude.kotlin.library.droidconberlin.models.Session
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("rest/sessions.json")
    fun getSessions(): Call<List<Session>>

}
