package com.example.enuapp.data

import android.content.Context
import androidx.datastore.preferences.core.*
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.first

val Context.dataStore by preferencesDataStore(name = "user_prefs")

class UserPreferences(private val context: Context) {
    private val USERNAME_KEY = stringPreferencesKey("username")

    suspend fun saveUsername(username: String) {
        context.dataStore.edit { prefs ->
            prefs[USERNAME_KEY] = username
        }
    }

    suspend fun getUsername(): String? {
        val prefs = context.dataStore.data.first()
        return prefs[USERNAME_KEY]
    }

    suspend fun clear() {
        context.dataStore.edit { it.clear() }
    }
}
