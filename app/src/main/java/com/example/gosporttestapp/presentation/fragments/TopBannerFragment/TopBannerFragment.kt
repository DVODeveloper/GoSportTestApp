package com.example.gosporttestapp.presentation.fragments.TopBannerFragment

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gosporttestapp.R

class TopBannerFragment : Fragment() {

    companion object {
        fun newInstance() = TopBannerFragment()
    }

    private val viewModel: TopBannerViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_top_banner, container, false)
    }
}