package com.example.gosporttestapp.presentation.fragments.menu.PizzaBasketFragment

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gosporttestapp.R

class PizzaBasketFragment : Fragment() {

    companion object {
        fun newInstance() = PizzaBasketFragment()
    }

    private val viewModel: PizzaBasketViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_pizza_basket, container, false)
    }
}