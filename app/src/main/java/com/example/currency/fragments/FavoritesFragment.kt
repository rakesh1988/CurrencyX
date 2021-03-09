package com.example.currency.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.currency.R

class FavoritesFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, fl_wrapper: ViewGroup?, savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.fragment_favorites, fl_wrapper, false)

    companion object {
        fun newInstance(): FavoritesFragment = FavoritesFragment()
    }
}