/*
 * Developed by Suman Kumar Dey
 * Linkedln: www.linkedin.com/in/suman1040
 */

/*
 * Developed by Suman Kumar Dey
 * Linkedln: www.linkedin.com/in/suman1040
 */

/*
 * Developed by Suman Kumar Dey
 * Linkedln: www.linkedin.com/in/suman1040
 */

package com.example.iemcrp.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text
}