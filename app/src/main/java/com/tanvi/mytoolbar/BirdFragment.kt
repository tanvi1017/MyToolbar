package com.tanvi.mytoolbar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tanvi.mytoolbar.databinding.FragmentBirdBinding


class BirdFragment: Fragment() {
        private var _binding: FragmentBirdBinding? = null
        private val binding get() = _binding!!

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            _binding = FragmentBirdBinding.inflate(layoutInflater)
            return binding.root
        }
    }




