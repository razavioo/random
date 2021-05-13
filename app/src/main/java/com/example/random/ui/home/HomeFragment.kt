package com.example.random.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.random.R

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)

        homeViewModel.loadData()

        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        val recyclerViewAnimal: RecyclerView = root.findViewById(R.id.recycler_view_animal)

        homeViewModel.text.observe(viewLifecycleOwner, {
            textView.text = it
        })

        homeViewModel.animals.observe(viewLifecycleOwner, { animals ->
            recyclerViewAnimal.adapter = AnimalAdapter(animals)
        })

        homeViewModel.elephants.observe(viewLifecycleOwner, { elephants ->
            // TODO: Show view regarding that data
        })

        return root
    }
}