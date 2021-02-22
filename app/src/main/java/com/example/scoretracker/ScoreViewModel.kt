package com.example.scoretracker

import androidx.lifecycle.ViewModel

class ScoreViewModel : ViewModel() {

    var scoreOne = 0
    var scoreTwo = 0

    fun addScoreOne() {
        scoreOne++
    }

    fun addScoreTwo() {
        scoreTwo++
    }

    fun resetScore() {
        scoreOne = 0
        scoreTwo = 0
    }

    override fun onCleared() {
        super.onCleared()

        scoreOne = 0
        scoreTwo = 0
    }

}