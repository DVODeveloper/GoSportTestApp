package com.example.gosporttestapp.presentation.fragments.menu.PizzaMenuFragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gosporttestapp.R
import com.example.gosporttestapp.data.repository.PizzaListRepositoryImpl
import com.example.gosporttestapp.databinding.FragmentPizzaMenuBinding
import com.example.gosporttestapp.presentation.adapter.PizzaListAdapter
import com.example.gosporttestapp.presentation.fragments.TopBannerFragment.TopBannerFragment
import com.example.gosporttestapp.presentation.fragments.TopMenuTips.TopMenuTipsFragment
import com.example.gosporttestapp.presentation.fragments.menu.TopMenuHorizontal.TopMenuHorizontalFragment
import kotlinx.coroutines.launch

class PizzaMenuFragment : Fragment() {
      private lateinit var adapter: PizzaListAdapter
      private lateinit var binding: FragmentPizzaMenuBinding
      private lateinit var factory: PizzaMenuViewModelFactory
      private lateinit var viewModel: PizzaMenuViewModel


//
//    private lateinit var recyclerView: RecyclerView

    companion object {
        fun newInstance() : PizzaMenuFragment {
            return PizzaMenuFragment()
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPizzaMenuBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragmentManager = activity?.supportFragmentManager
        val fragmentTransaction = fragmentManager?.beginTransaction()
        fragmentTransaction?.replace(R.id.itemsOfCities, TopMenuTipsFragment())
        fragmentTransaction?.commit()

        val fragmentTransaction2 = fragmentManager?.beginTransaction()
        fragmentTransaction2?.replace(R.id.banners, TopBannerFragment())
        fragmentTransaction2?.commit()

        val fragmentTransaction3 = fragmentManager?.beginTransaction()
        fragmentTransaction3?.replace(R.id.appBar, TopMenuHorizontalFragment())
        fragmentTransaction3?.commit()



        adapter = PizzaListAdapter()
        binding.recyclerView.adapter = adapter

        val layoutManager = LinearLayoutManager(context)
        binding.recyclerView.layoutManager = layoutManager

        val repository = PizzaListRepositoryImpl()
        val factory = PizzaMenuViewModelFactory(repository)

        viewModel = ViewModelProvider(this, factory).get(PizzaMenuViewModel::class.java)

        viewModel.getPizzaList()

        viewModel.pizzaList.observe(viewLifecycleOwner) { pizzaList ->
            adapter.submitList(pizzaList)
            Log.d("PizzaMenuFragment", pizzaList.toString())
        }




        }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


    }


}