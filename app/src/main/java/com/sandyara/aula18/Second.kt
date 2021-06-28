package com.sandyara.aula18

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment

class Second : Fragment(){

    //val texto = getString(R.string.texto)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.screen1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //val texto = texto
        Toast.makeText(requireActivity(), getString(R.string.texto), Toast.LENGTH_SHORT).show()
    }
}