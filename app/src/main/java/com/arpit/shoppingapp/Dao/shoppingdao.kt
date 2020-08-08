package com.arpit.shoppingapp.Dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.arpit.shoppingapp.Model.Shopping

@Dao
interface shoppingdao {

    @Insert(onConflict=OnConflictStrategy.REPLACE)
   suspend fun insert(shopping:Shopping)

    @Delete
     suspend fun delete(shopping: Shopping)

    @Query("SELECT * FROM shopping")
    fun getAlldata():LiveData<List<Shopping>>




}