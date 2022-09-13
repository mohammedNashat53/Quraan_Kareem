package com.example.quraankareem

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import com.example.quraankareem.databinding.FragmentTasbeehBinding


class TasbeehFragment : Fragment() {
    lateinit var binding: FragmentTasbeehBinding
    var remainingZecker = 33
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTasbeehBinding.inflate(inflater, container, false)
        binding.tvCounter.setOnClickListener {
            Log.i("TAG", "TAB")
            remainingZecker--
            binding.tvRemainingNumbe.text = remainingZecker.toString()
        }
        return binding.root

    }
}

