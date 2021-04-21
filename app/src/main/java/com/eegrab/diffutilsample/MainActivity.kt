package com.eegrab.diffutilsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.eegrab.diffutilsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val myAdapter by lazy { MyAdapter() }

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = myAdapter


        val person1 = Person(1,"John",21)
        val person2 = Person(2,"Steve",22)
        val person3 = Person(3,"Mary",23)

//        myAdapter.setData(listOf(person1,person2,person3))

        binding.btnAdd.setOnClickListener {
            val person4 = Person(3,"Mary",23)
            myAdapter.setData(listOf(person1,person2,person3,person4))
        }
    }
}