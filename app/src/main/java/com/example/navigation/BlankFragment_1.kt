package com.example.navigation

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigation.databinding.FragmentBlankFragment1Binding

class BlankFragment_1 : BaseFragment() {


    private lateinit var binding: FragmentBlankFragment1Binding

    companion object {
        fun newInstance() = BlankFragment_1()
    }

    private lateinit var viewModel: BlankFragment1ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlankFragment1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = ViewModelProvider(this).get(BlankFragment1ViewModel::class.java)

        observeNavigation(viewModel)
        binding.button.setOnClickListener {
            var cat = Cat()
            var bundle = Bundle()
            bundle.putParcelable("cat", cat)
//            findNavController().navigate(R.id.blankFragment_2, bundle)
//            findNavController().navigate(R.id.action_blankFragment_1_to_blankFragment_2, bundle)
//            var action = BlankFragment_1Directions.actionBlankFragment1ToBlankFragment2(cat)
//            action.arguments.putParcelable("cat", cat)
//            findNavController().navigate(action)
            viewModel.toNextFragment(cat)

        }

    }


}