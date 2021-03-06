package com.example.ecome.data.vos

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "user_table")
data class LoginVO (

    @PrimaryKey
    @ColumnInfo
    val user_id: Int ,

    @ColumnInfo
    val name: String,

    @ColumnInfo
    val address: String,

    @ColumnInfo
    val phone_no: String,

    @ColumnInfo
    val profile_image : String
)