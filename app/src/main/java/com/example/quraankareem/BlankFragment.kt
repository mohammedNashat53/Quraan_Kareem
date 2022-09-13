package com.example.quraankareem

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.quraankareem.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {

lateinit var binding: FragmentBlankBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlankBinding.inflate(inflater,container,false)

        binding.apply {
            tvQuraan.setOnClickListener{ currentFragment(it)}
            tvAzkar.setOnClickListener{ currentFragment(it)}
            tvDoaa.setOnClickListener{ currentFragment(it)}
            tvTasbeeh.setOnClickListener{ currentFragment(it)}
        }

        return binding.root
    }


    private fun currentFragment(view: View){
        when(view){
            binding.tvQuraan -> view.findNavController().navigate(BlankFragmentDirections.actionBlankFragmentToQuraanFragment())
            binding.tvAzkar -> view.findNavController().navigate(BlankFragmentDirections.actionBlankFragmentToAzkarFragment())
            binding.tvDoaa -> view.findNavController().navigate(BlankFragmentDirections.actionBlankFragmentToDoaaFragment())
            binding.tvTasbeeh -> view.findNavController().navigate(BlankFragmentDirections.actionBlankFragmentToTasbeehFragment())

        }
    }

}