package com.example.scoretracker

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), Communicator {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Method for passing value between fragments
    override fun passDataCom(nameOne: String, nameTwo: String) {
        val bundle = Bundle()

        bundle.putString("nameOne", nameOne)
        bundle.putString("nameTwo", nameTwo)

        val transaction = this.supportFragmentManager.beginTransaction()
        val scoreFragment = ScoreFragment()

        scoreFragment.arguments = bundle
        scoreFragment.arguments = bundle

        transaction.replace(R.id.fragment, scoreFragment)
        transaction.commit()
    }
}