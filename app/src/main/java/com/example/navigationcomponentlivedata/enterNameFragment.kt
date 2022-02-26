package com.example.navigationcomponentlivedata

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.view.animation.TranslateAnimation
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.navigationcomponentlivedata.databinding.EnterNameFragmentBinding

class enterNameFragment : Fragment() {

    companion object {
        fun newInstance() = enterNameFragment()
    }

    private lateinit var viewModel: EnterNameViewModel
    lateinit var binding:EnterNameFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.enter_name_fragment,container,false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this)[EnterNameViewModel::class.java]

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)






        binding.actionImage.setOnClickListener {

          val x=TranslateAnimation(1,1f,1,1f,1,1f,1,1f)
           // it.startAnimation(AnimationUtils.loadAnimation(context, R.anim.slidein))
            it.startAnimation(x)
            Toast.makeText(requireContext(),"oo0 fuck",Toast.LENGTH_SHORT).show()
        }

        binding.button.setOnClickListener {



            it.findNavController().navigate(R.id.action_enterNameFragment_to_showDataFragment)
//           val navController= activity?.findNavController(R.id.nav_host_fragment)
//            NavigationUI.setupActionBarWithNavController(requireActivity()as AppCompatActivity,navController!!)
//            navController.navigate(R.id.action_enterNameFragment_to_showDataFragment)




        }

    }



}