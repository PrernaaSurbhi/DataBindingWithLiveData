package com.example.databindingwithlivedata.score

import android.util.Log
import androidx.lifecycle.ViewModel

/**
 * Created by PrernaSurbhi on 03/02/22.
 */
class ScoreViewModel:ViewModel() {

    fun onPlayAgain(){
        Log.d("ScoreViewModelPlay_again","play again clicked")
    }
}