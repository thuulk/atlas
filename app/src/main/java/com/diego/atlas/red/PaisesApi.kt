package com.diego.atlas.red

import com.diego.atlas.modelos.Pais
import retrofit2.http.GET
import retrofit2.http.Query

interface PaisesApi {

    // GET https://countries.dev/countries?fields=...
    @GET("countries")
    suspend fun obtenerPaises(
        @Query("fields") campos: String
    ): List<Pais>
}
