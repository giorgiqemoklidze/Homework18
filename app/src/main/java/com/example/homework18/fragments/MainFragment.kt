package com.example.homework18.fragments



import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.homework18.databinding.MainFragmentBinding
import com.example.homework18.viewModels.MainViewModel


class MainFragment : BaseFragment<MainFragmentBinding,MainViewModel>(MainFragmentBinding::inflate,MainViewModel::class.java) {



    override fun start(inflater: LayoutInflater, container: ViewGroup?) {
        init()
    }


    private fun init(){
        binding?.txt?.text  = "Hello Hello"


    }


}


