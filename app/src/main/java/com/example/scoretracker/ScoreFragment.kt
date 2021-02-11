package com.example.scoretracker

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.scoretracker.databinding.FragmentScoreBinding


class ScoreFragment : Fragment(R.layout.fragment_score) {

    private lateinit var viewModel: ScoreViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this).get(ScoreViewModel::class.java)

        val binding = FragmentScoreBinding.bind(view)

        // Onclick for button one
        binding.btnAddOne.setOnClickListener {
            viewModel.addScoreOne()
            binding.txtScoreOne.text = viewModel.scoreOne.toString()
        }

        // Onclick for button two
        binding.btnAddTwo.setOnClickListener {
            viewModel.addScoreTwo()
            binding.txtScoreTwo.text = viewModel.scoreTwo.toString()
        }

        // Onclick reset score
        binding.btnReset.setOnClickListener {
            viewModel.resetScore()
            binding.txtScoreOne.text = viewModel.scoreOne.toString()
            binding.txtScoreTwo.text = viewModel.scoreTwo.toString()
        }
    }
}