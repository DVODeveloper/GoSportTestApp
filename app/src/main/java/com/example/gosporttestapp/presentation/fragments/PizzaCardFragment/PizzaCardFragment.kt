package com.example.gosporttestapp.presentation.fragments.PizzaCardFragment

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gosporttestapp.R

class PizzaCardFragment : Fragment() {

    companion object {
        fun newInstance() = PizzaCardFragment()
    }

    private val viewModel: PizzaCardViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_pizza_card, container, false)
    }
}