package info.metadude.kotlin.library.droidconberlin.models

import org.threeten.bp.OffsetDateTime

data class Session(

        val abstract: String,
        val audio: List<Any>,
        val category: String,
        val category_id: String,
        val end_iso: List<OffsetDateTime>,
        val format: String,
        val format_id: String,
        val label: String,
        val language: String,
        val language_id: String,
        val level: String,
        val level_id: String,
        val nid: String,
        val partner_ids: List<Any>,
        val partner_names: List<Any>,
        val room: List<String>,
        val room_id: List<String>,
        val slide: List<Any>,
        val speaker_names: List<String>,
        val speaker_uids: List<String>,
        val start_iso: List<OffsetDateTime>,
        val title: String,
        val type: String,
        val updated_date: OffsetDateTime,
        val uri: String,
        val video: List<Any>

)
