package android.micgon.com.bundletest.viewmodel

import android.arch.lifecycle.ViewModel
import android.micgon.com.bundletest.model.User

class SharedViewModel : ViewModel() {
    val user = User("Tasha")

}