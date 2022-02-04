package com.example.databindingwithlivedata.game

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModel

/**
 * Created by PrernaSurbhi on 03/02/22.
 */
class GameViewModel: ViewModel() {

    fun onSkip(){
        Log.d("onSkipClicked","onSkipClicked001")
    }

    fun onCorrect(){
        Log.d("onCorrect","onCorrect002")
    }

    fun onGameFinish(){
        Log.d("onGameFinish", "onGameFinish")
    }
}