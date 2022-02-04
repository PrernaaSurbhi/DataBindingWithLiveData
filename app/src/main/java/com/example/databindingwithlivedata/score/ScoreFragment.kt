package com.example.databindingwithlivedata

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.databindingwithlivedata.databinding.FragmentScoreBinding
import com.example.databindingwithlivedata.score.ScoreViewModel


class ScoreFragment : Fragment() {
    lateinit var binding:FragmentScoreBinding
    var scoreViewModel:ScoreViewModel? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_score, container, false)
        scoreViewModel = activity?.let { ViewModelProvider(it).get(ScoreViewModel::class.java) }
        binding.scoreFragmnetViewModel = scoreViewModel
        return binding.root
    }


}