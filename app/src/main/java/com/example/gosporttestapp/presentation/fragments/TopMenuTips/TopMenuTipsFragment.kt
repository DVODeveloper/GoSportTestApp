package com.example.gosporttestapp.presentation.fragments.TopMenuTips

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gosporttestapp.R
import com.example.gosporttestapp.databinding.FragmentTopMenuTipsBinding

class TopMenuTipsFragment : Fragment() {

    private lateinit var binding: FragmentTopMenuTipsBinding

    companion object {
        fun newInstance() = TopMenuTipsFragment()
    }

    private val viewModel: TopMenuTipsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTopMenuTipsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}