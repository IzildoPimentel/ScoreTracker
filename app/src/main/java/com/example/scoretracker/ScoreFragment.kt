package com.example.scoretracker

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.scoretracker.databinding.FragmentScoreBinding


class ScoreFragment : Fragment(R.layout.fragment_score) {

    private lateinit var viewModelScore: ScoreViewModel

    var nameOne: String? = ""
    var nameTwo: String? = ""

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModelScore = ViewModelProvider(this).get(ScoreViewModel::class.java)

        val binding = FragmentScoreBinding.bind(view)

        // Declaring the arguments passed over
        nameOne = arguments?.getString("nameOne")
        binding.teamOne.text = nameOne

        nameTwo = arguments?.getString("nameTwo")
        binding.teamTwo.text = nameTwo

        // Onclick for button one
        binding.btnAddOne.setOnClickListener {
            viewModelScore.addScoreOne()
            binding.txtScoreOne.text = viewModelScore.scoreOne.toString()
        }

        // Onclick for button two
        binding.btnAddTwo.setOnClickListener {
            viewModelScore.addScoreTwo()
            binding.txtScoreTwo.text = viewModelScore.scoreTwo.toString()
        }

        // Onclick reset score
        binding.btnReset.setOnClickListener {
            viewModelScore.resetScore()
            binding.txtScoreOne.text = viewModelScore.scoreOne.toString()
            binding.txtScoreTwo.text = viewModelScore.scoreTwo.toString()
        }
    }
}