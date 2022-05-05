package com.example.teknooo.ui.gallery

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.teknooo.R
import com.example.teknooo.model.DataGallery

class GalleryViewModel : ViewModel() {

    private val _image = MutableLiveData<Int>()
    val image: LiveData<Int> = _image

    private val _judul = MutableLiveData<String>()
    val judul: LiveData<String> = _judul

    private val _genre = MutableLiveData<String>()
    val genre: LiveData<String> = _genre

    fun loadData(): List<DataGallery>{
        return listOf(
            DataGallery(R.drawable.mousea,R.string.M001,R.string.aM001),
            DataGallery(R.drawable.mouseb,R.string.M002, R.string.aM002),
            DataGallery(R.drawable.mousece,R.string.M003, R.string.aM003),
            DataGallery(R.drawable.moused,R.string.X001,R.string.aX001),
            DataGallery(R.drawable.mousee,R.string.X002, R.string.aX002),
            DataGallery(R.drawable.mousef,R.string.X003, R.string.aX003),
        )
    }
    fun loadData2(): List<DataGallery>{
        return listOf(
            DataGallery(R.drawable.moused,R.string.X001,R.string.aX001),
            DataGallery(R.drawable.mousee,R.string.X002, R.string.aX002),
            DataGallery(R.drawable.mousef,R.string.X003, R.string.aX003),
            DataGallery(R.drawable.mousea,R.string.M001,R.string.aM001),
            DataGallery(R.drawable.mouseb,R.string.M002, R.string.aM002),
            DataGallery(R.drawable.mousece,R.string.M003, R.string.aM003),
        )
    }


    fun setData(data: DataGallery, context: Context) {
        _judul.value = context.getString(data.judulResourceId)
        _image.value = data.imageResourceId
        _genre.value = context.getString(data.subResourceId)
    }
}