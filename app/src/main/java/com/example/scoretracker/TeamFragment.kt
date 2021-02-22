package com.example.scoretracker

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.scoretracker.databinding.FragmentTeamBinding

class TeamFragment : Fragment(R.layout.fragment_team) {

    private lateinit var communicator: Communicator

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentTeamBinding.bind(view)

        communicator = activity as Communicator

        binding.btnNext.setOnClickListener {
            communicator.passDataCom(binding.txtTeamOne.text.toString(), binding.txtTeamTwo.text.toString())
        }
    }
}