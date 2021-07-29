package com.example.nasa_mars_api_service.ui.fragment.photo_view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.nasa_mars_api_service.repository.interfaces.BaseRepository

/**
 * Created by Matvey Popov.
 * Date: 11.01.2021
 * Time: 21:33
 * Project: NASA-Mars-API-Service
 */
class PhotoViewViewModelFactory(
        private val repository: BaseRepository
): ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(PhotoViewViewModel::class.java)) {
            return PhotoViewViewModel(repository) as T
        }
        throw IllegalArgumentException("Unexpected view model to create: $modelClass")
    }

}