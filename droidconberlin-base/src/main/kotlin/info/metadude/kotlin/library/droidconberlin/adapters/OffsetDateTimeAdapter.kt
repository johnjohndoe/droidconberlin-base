package info.metadude.kotlin.library.droidconberlin.adapters

import com.squareup.moshi.FromJson
import com.squareup.moshi.ToJson
import org.threeten.bp.DateTimeException
import org.threeten.bp.OffsetDateTime
import org.threeten.bp.format.DateTimeFormatter
import org.threeten.bp.format.DateTimeParseException

class OffsetDateTimeAdapter {

    private val dateTimeFormatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME!!

    @FromJson
    fun fromJson(text: String?) = text?.let {
        try {
            OffsetDateTime.parse(text, dateTimeFormatter)
        } catch (e: DateTimeParseException) {
            null
        }
    }

    @ToJson
    fun toJson(dateTime: OffsetDateTime?) = dateTime?.let {
        try {
            it.format(dateTimeFormatter)
        } catch (e: DateTimeException) {
            null
        }
    }

}
