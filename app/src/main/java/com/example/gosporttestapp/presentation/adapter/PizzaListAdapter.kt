package com.example.gosporttestapp.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.gosporttestapp.R
import com.example.gosporttestapp.databinding.FragmentPizzaCardBinding
import com.example.gosporttestapp.domain.entity.PizzaCardEntity

class PizzaListAdapter:
    ListAdapter<PizzaCardEntity, PizzaListAdapter.PizzaItemViewHolder>(Comparator()) {

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PizzaItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.fragment_pizza_card,
            parent,
            false
        )
        return PizzaItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: PizzaItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class PizzaItemViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        private val binding = FragmentPizzaCardBinding.bind(view)


        fun bind(pizzaCardEntity: PizzaCardEntity) = with(binding) {

                idPizzaInCard.text = pizzaCardEntity.id.toString()
                titlePizza.text = pizzaCardEntity.title.toString()
                pizzaDescription.text = pizzaCardEntity.description.toString()
                pizzaPrice.text = pizzaCardEntity.price.toString()


        }
    }


    class Comparator : DiffUtil.ItemCallback<PizzaCardEntity>() {
        override fun areItemsTheSame(oldItem: PizzaCardEntity, newItem: PizzaCardEntity): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(
            oldItem: PizzaCardEntity,
            newItem: PizzaCardEntity
        ): Boolean {
            return oldItem == newItem
        }

    }


}


//class PizzaListAdapter : RecyclerView.Adapter<PizzaListAdapter.PizzaItemViewHolder>() {
//
//    var pizzaList = listOf<PizzaCardEntity>()
//        set(value) {
//            field = value
//            notifyDataSetChanged()
//        }
//
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PizzaItemViewHolder {
//        val view = LayoutInflater.from(parent.context).inflate(
//            R.layout.fragment_pizza_card,
//            parent,
//            false
//        )
//
//        return PizzaItemViewHolder(view)
//    }
//
//    override fun getItemCount(): Int {
//        return pizzaList.size
//    }
//
//    override fun onBindViewHolder(viewHolder: PizzaItemViewHolder, position: Int) {
//        val pizzaItem = pizzaList[position]
//        viewHolder.pizzaTitle.text = pizzaItem.title
//        viewHolder.pizzaDescription.text = pizzaItem.description
//        viewHolder.pizzaPrice.text = pizzaItem.price
//
//    }
//
//    class PizzaItemViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
//        val pizzaTitle = view.findViewById<TextView>(R.id.titlePizza)
//        val pizzaDescription = view.findViewById<TextView>(R.id.pizzaDescription)
//        val pizzaPrice = view.findViewById<TextView>(R.id.pizzaPrice)
//        val pizzaImage = view.findViewById<ImageView>(R.id.pizzaImage)
//
//    }
//}


