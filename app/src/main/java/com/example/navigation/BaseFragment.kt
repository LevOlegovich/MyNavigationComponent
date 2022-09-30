package com.example.navigation

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.findNavController

open class BaseFragment : Fragment() {

    fun observeNavigation(viewModel: BaseViewModel) {
        viewModel.navigation.observeNonNull(viewLifecycleOwner) {
            it.getContentIfNotHandled()?.let { navigationCommand ->
                handleNavigation(navigationCommand)
            }
        }
    }

    private fun handleNavigation(navCommand: NavigationCommand) {
        when (navCommand) {
            is NavigationCommand.ToDirection -> findNavController().navigate(navCommand.directions)
            is NavigationCommand.Back -> findNavController().navigateUp()
        }
    }

}