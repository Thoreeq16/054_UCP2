package com.example.ucp2.ui.theme.component

import androidx.lifecycle.ViewModel
import com.example.ucp2.data.DataForm
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SkripsiViewModel : ViewModel() {
    private val _stateData = MutableStateFlow(DataForm())
    val stateDF:StateFlow<DataForm> =_stateData.asStateFlow()


    fun setNama(list: MutableList<String>){
        _stateData.update { stateSaatIni -> stateSaatIni.copy(
            nama = list[0],
            nim = list[1],
            konsentrasi = list[2],
            judul = list[3],
            namados = list[4]
        ) }
    }
}