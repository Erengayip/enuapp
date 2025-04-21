package com.example.enuapp.data

import android.content.Context

class AuthRepository(private val userDao: UserDao) {

    suspend fun register(username: String, password: String): Boolean {
        val existing = userDao.getUserByUsername(username)
        if (existing != null) return false
        userDao.registerUser(User(username = username, password = password))
        return true
    }

    suspend fun login(username: String, password: String): Boolean {
        val user = userDao.login(username, password)
        return user != null
    }
}
