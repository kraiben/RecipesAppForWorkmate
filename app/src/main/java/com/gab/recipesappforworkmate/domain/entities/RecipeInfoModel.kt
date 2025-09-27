package com.gab.recipesappforworkmate.domain.entities

import android.net.Uri
import androidx.core.net.toUri
import com.google.gson.GsonBuilder
import com.google.gson.TypeAdapter
import com.google.gson.stream.JsonReader
import com.google.gson.stream.JsonWriter

data class RecipeInfoModel(
    val id: Long,
    val title: String,
    val cookingTimeInMinutes: Int,
    val dishTypes: List<DishType>,
    val ingredients: List<IngredientInfoModel>,
    val recipeImageUri: Uri,
    val summaryDescription: String,
    val instructions: List<RecipeStepInfoModel>,
) {
    fun toJson(): String = gson.toJson(this).encode()

    companion object {
        val EMPTY = RecipeInfoModel(
            id = -1,
            title = "",
            cookingTimeInMinutes = -1,
            dishTypes = emptyList(),
            ingredients = emptyList(),
            recipeImageUri = Uri.EMPTY,
            summaryDescription = "",
            instructions = emptyList()
        )

        fun fromJson(str: String): RecipeInfoModel {
            return gson.fromJson(str, RecipeInfoModel::class.java)
        }

        private object UriTypeAdapter : TypeAdapter<Uri>() {
            override fun write(out: JsonWriter, value: Uri) {
                out.value(value.toString())
            }

            override fun read(reader: JsonReader): Uri {
                return reader.nextString().toUri()
            }
        }

        private val gson = GsonBuilder()
            .registerTypeAdapter(Uri::class.java, UriTypeAdapter)
            .create()
        fun String.encode(): String {
            return Uri.encode(this)
        }
    }
}