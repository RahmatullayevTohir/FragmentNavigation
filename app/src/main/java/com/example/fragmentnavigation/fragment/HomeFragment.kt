package com.example.fragmentnavigation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.fragmentnavigation.R
import com.example.fragmentnavigation.databinding.FragmentHomeBinding
import com.example.fragmentnavigation.model.User
import com.example.fragmentnavigation.model.Utils
import me.ruyeo.jetpacknavigationb13.ui.utils.viewBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

private val binding by viewBinding { FragmentHomeBinding.bind(it) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var user = User("Kimdir",25)
        binding.clickMe.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_secondFragment,
            bundleOf("key" to "value", "user" to user),Utils.navOption())
        }
    }
}