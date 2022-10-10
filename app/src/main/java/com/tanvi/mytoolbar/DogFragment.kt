package com.tanvi.mytoolbar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tanvi.mytoolbar.databinding.FragmentDogBinding

class DogFragment : Fragment() {
    // this can be simplified
       // private var _binding: FragmentDogBinding? = null
        //private val binding get() = _binding!! // !! neans force check for null

  //  another way of writing this is
    lateinit var binding:FragmentDogBinding   //siply use this line
    var dogList:MutableList<DogItemData> = mutableListOf()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDogBinding.inflate(layoutInflater)
        //yha.......
        formData() // yha s phle data form kiya or dog list m store kiya
        return binding.root
    }
    fun setAdapter(){
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext(),RecyclerView.VERTICAL, false)
        val adapter = DogAdapter(dogList)
        binding.recyclerView.adapter = adapter
    }
 fun formData(){
     val dog1 = DogItemData("Dog 1",R.drawable.iv15)
     val dog2 = DogItemData("Dog 2",R.drawable.iv15)
     val dog3 = DogItemData("Dog 3",R.drawable.iv15)
     val dog4 = DogItemData("Dog 4",R.drawable.iv15)
     dogList.add(dog1)
     dogList.add(dog2)
     dogList.add(dog3)
     dogList.add(dog4)
     // yha doglist m data a chuka h
    // ab hum adapter set karenge
     setAdapter()
     //phone connect kro

     // dame sare frag,ment mmkr


 }
}

