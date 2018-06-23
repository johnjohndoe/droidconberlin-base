package info.metadude.kotlin.library.droidconberlin

import com.squareup.moshi.Moshi
import info.metadude.kotlin.library.droidconberlin.adapters.OffsetDateTimeAdapter
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object ApiModule {

    @JvmStatic
    fun provideApiService(baseUrl: String, okHttpClient: OkHttpClient): ApiService =
            createRetrofit(baseUrl, okHttpClient).create(ApiService::class.java)

    private fun provideMoshiBuilder(): Moshi {
        return Moshi.Builder()
                .add(OffsetDateTimeAdapter())
                .build()
    }

    private fun createRetrofit(baseUrl: String, okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(MoshiConverterFactory.create(provideMoshiBuilder()))
                .client(okHttpClient)
                .build()
    }

}
