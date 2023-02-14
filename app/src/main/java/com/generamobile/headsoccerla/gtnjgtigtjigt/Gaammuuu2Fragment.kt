package com.generamobile.headsoccerla.gtnjgtigtjigt

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.generamobile.headsoccerla.R
import com.generamobile.headsoccerla.databinding.FragmentGaammuuu2Binding
import kotlin.random.Random


class Gaammuuu2Fragment : Fragment() {

    var points = 0


    private val listBiiinds by lazy {
        listOf(
            binding.cennttt,
            binding.doovn,
            binding.lefyyyy,
        )
    }

    private fun chechgggg(): Boolean {
        listBiiinds.forEach {
            if (it.visibility == View.VISIBLE) return false
        }
        return true
    }

    override fun onDestroy() {
        fragmentGaammuuu2Binding = null
        super.onDestroy()
    }

    private fun tguthgutbbghbvhbvbbf() {
        Toast.makeText(
            requireContext(),
            "I have error, try again",
            Toast.LENGTH_SHORT
        ).show()
    }


    override fun onPause() {
        onDestroy()
        super.onPause()
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            binding.lefyyyy.setOnClickListener {
                val number = Random.nextInt(from = 100, until = 500)
                it.visibility = View.INVISIBLE
                points += number
                val tttt = "Points ${points}"
                binding.scoore.text = tttt
                if (chechgggg()) {
                    Toast.makeText(requireContext(), "Game over", Toast.LENGTH_SHORT).show()
                    findNavController().navigate(R.id.action_gaammuuu2Fragment_to_gaaamamuuu1Fragment)
                }
            }
            binding.cennttt.setOnClickListener {
                val number = Random.nextInt(from = 100, until = 500)
                it.visibility = View.INVISIBLE
                points += number
                val tttt = "Points ${points}"
                binding.scoore.text = tttt
                if (chechgggg()) {
                    Toast.makeText(requireContext(), "Game over", Toast.LENGTH_SHORT).show()
                    findNavController().navigate(R.id.action_gaammuuu2Fragment_to_gaaamamuuu1Fragment)
                }
            }
            binding.doovn.setOnClickListener {
                val number = Random.nextInt(from = 100, until = 500)
                it.visibility = View.INVISIBLE
                points += number
                val tttt = "Points ${points}"
                binding.scoore.text = tttt
                if (chechgggg()) {
                    Toast.makeText(requireContext(), "Game over", Toast.LENGTH_SHORT).show()
                    findNavController().navigate(R.id.action_gaammuuu2Fragment_to_gaaamamuuu1Fragment)
                }
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
        fragmentGaammuuu2Binding = FragmentGaammuuu2Binding.inflate(inflater, container, false)
        return binding.root
    }


    private var fragmentGaammuuu2Binding: FragmentGaammuuu2Binding? = null
    private val binding
        get() = fragmentGaammuuu2Binding
            ?: throw RuntimeException("FragmentGaammuuu2Binding = null")
}