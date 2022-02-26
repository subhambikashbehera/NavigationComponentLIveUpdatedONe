package com.example.navigationcomponentlivedata.SndData

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationcomponentlivedata.R

class showDataFragment : Fragment() {

    companion object {
        fun newInstance() = showDataFragment()
    }

    private lateinit var viewModel: ShowDataViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.show_data_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ShowDataViewModel::class.java)
        // TODO: Use the ViewModel
    }

}