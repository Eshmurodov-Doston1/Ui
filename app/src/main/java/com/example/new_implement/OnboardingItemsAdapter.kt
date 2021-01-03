package com.example.new_implement

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class OnboardingItemsAdapter(private var onboardingItems:List<OnboadringItem>):RecyclerView.Adapter<OnboardingItemsAdapter.OnboardingItemViewHolder>() {
    inner class OnboardingItemViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
     private val imageOnboarding = itemView.findViewById<ImageView>(R.id.imageOnboarding)
        private var  textTitle = itemView.findViewById<TextView>(R.id.textTitle)
        private val textDescription = itemView.findViewById<TextView>(R.id.textDescription)
        fun onBind(onboadringItem: OnboadringItem){
           imageOnboarding.setImageResource(onboadringItem.onboardingImg)
            textTitle.text = onboadringItem.title
            textDescription.text = onboadringItem.description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnboardingItemViewHolder {
         return OnboardingItemViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.onboarding_item_container,parent,false))
    }

    override fun onBindViewHolder(holder: OnboardingItemViewHolder, position: Int) {
      holder.onBind(onboardingItems[position])
    }

    override fun getItemCount(): Int {
        return onboardingItems.size
    }
}