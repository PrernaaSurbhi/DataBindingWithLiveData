package com.example.databindingwithlivedata

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.databindingwithlivedata.databinding.FragmentGameBinding
import com.example.databindingwithlivedata.game.GameViewModel

class GameFragment : Fragment() {
    lateinit var binding:FragmentGameBinding
     var viewModel: GameViewModel? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_game, container, false)
        viewModel = activity?.let { ViewModelProvider(it).get(GameViewModel::class.java) }
        binding.gameViewModel = viewModel
        return binding.root
    }

}