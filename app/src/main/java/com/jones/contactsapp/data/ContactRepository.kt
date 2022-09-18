package com.jones.contactsapp.data

import android.app.Application
import android.content.Context
import androidx.lifecycle.LiveData
import com.jones.contacstapp.data.ContactDao

class ContactRepository(private val db: ContactRoomDatabase) {

    suspend fun insert(item:Contact) = db.contactDao().insert(item)
    suspend fun delete(item:Contact) = db.contactDao().delete(item)

    fun allContacts() = db.contactDao().getAllContacts()

}
