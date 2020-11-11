package com.cubis.roomwordsample

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "word_table")
data class Word(@PrimaryKey @ColumnInfo(name = "word") val word: String) {
    // can auto generate primary key using the autogenerate keyword
    // https://developer.android.com/reference/androidx/room/PrimaryKey.html
    // @PrimaryKey(autoGenerate = true) val id: Int

}