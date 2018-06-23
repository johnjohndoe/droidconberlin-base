package info.metadude.kotlin.library.droidconberlin.adapters

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.threeten.bp.LocalDateTime
import org.threeten.bp.OffsetDateTime
import org.threeten.bp.ZoneOffset


class OffsetDateTimeAdapterTest {

    private val adapter = OffsetDateTimeAdapter()

    @Test
    fun `Converts a valid offset datetime into its string representation`() {
        val date = OffsetDateTime.of(LocalDateTime.of(2018, 6, 20, 19, 15, 47), ZoneOffset.ofHours(2))
        val actual = adapter.toJson(date)
        assertThat(actual).isEqualTo("2018-06-20T19:15:47+02:00")
    }

    @Test
    fun `Converts a valid offset datetime string into a date object`() {
        val actual = adapter.fromJson("2018-06-20T19:15:47+02:00")
        val expected = OffsetDateTime.of(LocalDateTime.of(2018, 6, 20, 19, 15, 47), ZoneOffset.ofHours(2))
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun `Converts a date string to null`() {
        assertThat(adapter.fromJson("2016-12-27")).isEqualTo(null)
    }

    @Test
    fun `Converts a datetime string to null`() {
        assertThat(adapter.fromJson("2016-12-27T08:15:05")).isEqualTo(null)
    }

    @Test
    fun `Converts an empty string to null`() {
        val actual = adapter.fromJson("")
        assertThat(actual).isEqualTo(null)
    }

    @Test
    fun `Converts null to null`() {
        val actual = adapter.fromJson(null)
        assertThat(actual).isEqualTo(null)
    }

}
