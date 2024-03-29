package com.example.homework18.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import com.example.homework18.viewModels.MainViewModel


typealias Inflate<T> = (LayoutInflater,ViewGroup?,Boolean) -> T


abstract class BaseFragment<VB: ViewBinding, VM : ViewModel >(private val inflate: Inflate<VB>, viewModel: Class<VM>) : Fragment() {

    var binding : VB? = null
    val viewModel : VM by lazy{ ViewModelProvider(this).get(viewModel) }






    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        if (binding == null){
            binding = inflate(inflater,container,false)
            start(inflater,container)
        }



        return binding!!.root

    }


    abstract fun start (inflater: LayoutInflater,container: ViewGroup?)


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }


}