package com.example.fragmentnavigation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.fragmentnavigation.R
import com.example.fragmentnavigation.model.User


class SecondFragment : Fragment(R.layout.fragment_second) {

    private var use : User? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            use = it.getSerializable("user") as User
        }

        Toast.makeText(requireContext(), use?.toString(), Toast.LENGTH_SHORT).show()
    }
}