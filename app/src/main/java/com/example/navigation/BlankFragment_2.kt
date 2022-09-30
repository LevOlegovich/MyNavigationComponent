package com.example.navigation

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigation.databinding.FragmentBlankFragment1Binding
import com.example.navigation.databinding.FragmentBlankFragment2Binding

class BlankFragment_2 : Fragment() {

    private lateinit var binding: FragmentBlankFragment2Binding

    companion object {
        fun newInstance() = BlankFragment_2()
    }

    private lateinit var viewModel: BlankFragment2ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlankFragment2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(BlankFragment2ViewModel::class.java)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        println(arguments?.getParcelable<Cat>("cat"))
        println(arguments?.getString("hello"))
        binding.button2.setOnClickListener {
            findNavController().navigate(R.id.blankFragment_1)
        }
        binding.button3.setOnClickListener {
            findNavController().navigate(R.id.mainActivity2)
        }

    }

}