package com.arpit.shoppingapp.viewmodel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.arpit.shoppingapp.Model.Shopping
import com.arpit.shoppingapp.Repo.shoppingRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

class shoppingviewmodel:ViewModel() {

       fun insert(context: Context , shopping: Shopping){
           shoppingRepository.insert(context ,shopping)
       }
    fun delete(context: Context , shopping: Shopping){
        shoppingRepository.delete(context  ,shopping)
    }
    fun getalldata(context: Context):LiveData<List<Shopping>>?{
        return shoppingRepository.getalldata(context)
    }
    }
