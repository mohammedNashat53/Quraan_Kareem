package com.example.quraankareem

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.quraankareem.databinding.FragmentStartAppBinding

class StartAppFragment : Fragment() {
    lateinit var binding:FragmentStartAppBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
      binding = FragmentStartAppBinding.inflate(inflater, container, false)
      binding.btnStartApp.setOnClickListener(){
          it.findNavController().navigate(R.id.action_startAppFragment_to_blankFragment)
      }
setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.overflow,menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        Toast.makeText(this.context,"dfdfd",Toast.LENGTH_SHORT).show()

        return NavigationUI.onNavDestinationSelected(item!!,requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }


}