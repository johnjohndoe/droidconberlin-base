import info.metadude.kotlin.library.droidconberlin.ApiModule
import info.metadude.kotlin.library.droidconberlin.ApiService
import info.metadude.kotlin.library.droidconberlin.models.Session
import kotlinx.coroutines.experimental.runBlocking
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import ru.gildor.coroutines.retrofit.awaitResponse

class ProductionApiTest {

    companion object {
        const val BASE_URL = "https://cfp.droidcon.de"
    }

    @Test
    fun `Validates a sessions response`() = runBlocking {
        val response = service.getSessions().awaitResponse()
        if (response.isSuccessful) {
            val sessions = response.body()
            assertNotNull(sessions)
            sessions!!.forEach(::assertSession)
        }
    }

    private fun assertSession(session: Session) {
        assertThat(session.abstract).isNotNull()
        assertThat(session.audio).isNotNull
        assertThat(session.category).isNotNull()
        assertThat(session.category_id).isNotNull()
        assertThat(session.end_iso).isNotNull
        assertThat(session.format).isNotNull()
        assertThat(session.format_id).isNotNull()
        assertThat(session.label).isNotNull()
        assertThat(session.language).isNotNull()
        assertThat(session.language_id).isNotNull()
        assertThat(session.level).isNotNull()
        assertThat(session.level_id).isNotNull()
        assertThat(session.nid).isNotNull()
        assertThat(session.partner_ids).isNotNull
        assertThat(session.partner_names).isNotNull
        assertThat(session.room).isNotNull
        assertThat(session.room_id).isNotNull
        assertThat(session.slide).isNotNull
        assertThat(session.speaker_names).isNotNull
        assertThat(session.speaker_uids).isNotNull
        assertThat(session.start_iso).isNotNull
        assertThat(session.title).isNotNull()
        assertThat(session.type).isNotNull()
        assertThat(session.updated_date).isNotNull()
        assertThat(session.uri).isNotNull()
        assertThat(session.video).isNotNull
    }

    private fun assertNotNull(it: Any?) = assertThat(it).isNotNull

    private val service: ApiService by lazy {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BASIC
        val okHttpClient = OkHttpClient.Builder()
                .addNetworkInterceptor(interceptor)
                .build()
        ApiModule.provideApiService(BASE_URL, okHttpClient)
    }

}
