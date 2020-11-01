package com.example.tugasrecycleview

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tugasrecycleview.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Users> ()
    val listUsers = arrayOf(
        "Primandika Hakiki",
        "Talytakum Suryah",
        "M. Nurfian Triantono",
        "Nurisa Rahma Shantika",
        "Pratama Puji A.",
        "Cready Celgie G.",
        "Inas Syarifah A.",
        "Brian Firmansyah K. S.",
        "Zabrina Tuzzahra",
        "Tiara Karunia"

    )

    val hai = arrayOf( "hai"

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.layoutManager = LinearLayoutManager (this)
        for (i in 0 until listUsers.size) {
            list.add(Users(listUsers.get(i)))
            if(listUsers.size - 1 == i) {
                val adapter = Adapter(list)
                adapter.notifyDataSetChanged()
                mRecyclerView.adapter = adapter
                adapter.setOnClickListener {
                    Toast.makeText(this, "Hai " + listUsers[it], Toast.LENGTH_SHORT).show()
                }
            }
        }
        mRecyclerView.scrollToPosition(hai.size -1);
    }
}