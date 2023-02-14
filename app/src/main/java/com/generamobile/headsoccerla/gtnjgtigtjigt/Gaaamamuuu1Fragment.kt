package com.generamobile.headsoccerla.gtnjgtigtjigt

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.generamobile.headsoccerla.R
import com.generamobile.headsoccerla.databinding.FragmentGaaamamuuu1Binding
import kotlin.random.Random


class Gaaamamuuu1Fragment : Fragment() {


    private fun tguthgutbbghbvhbvbbf() {
        Toast.makeText(
            requireContext(),
            "I have error, try again",
            Toast.LENGTH_SHORT
        ).show()
    }

    val namess = listOf(
        "Carlos",
        "Markus",
        "Mark",
        "Carl",
        "Ernandos",
        "Hose",
    )


    override fun onDestroy() {
        fragmentGaaamamuuu1Binding = null
        super.onDestroy()
    }

    override fun onPause() {
        onDestroy()
        super.onPause()
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            binding.cennttt.setOnClickListener {
                val num = Random.nextDouble(from = 100.0, until = 1000.0)
                Toast.makeText(requireContext(), "${namess.random()} bonus ${num}", Toast.LENGTH_SHORT).show()
            }
            binding.lefyyyy.setOnClickListener {
                val num = Random.nextDouble(from = 100.0, until = 1000.0)
                Toast.makeText(requireContext(), "${namess.random()} bonus ${num}", Toast.LENGTH_SHORT).show()
            }
            binding.doovn.setOnClickListener {
                val num = Random.nextDouble(from = 100.0, until = 1000.0)
                Toast.makeText(requireContext(), "${namess.random()} bonus ${num}", Toast.LENGTH_SHORT).show()
            }
            binding.lotMainhyhyhyhyhy.setOnClickListener {
                findNavController().navigate(R.id.action_gaaamamuuu1Fragment_to_gaammuuu2Fragment)
            }


        } catch (e: Exception) {
            tguthgutbbghbvhbvbbf()
        }

        super.onViewCreated(view, savedInstanceState)
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentGaaamamuuu1Binding = FragmentGaaamamuuu1Binding.inflate(inflater, container, false)
        return binding.root
    }



    private var fragmentGaaamamuuu1Binding: FragmentGaaamamuuu1Binding? = null
    private val binding
        get() = fragmentGaaamamuuu1Binding ?: throw RuntimeException("FragmentGaaamamuuu1Binding = null")
}