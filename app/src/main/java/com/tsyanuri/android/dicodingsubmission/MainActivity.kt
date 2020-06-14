package com.tsyanuri.android.dicodingsubmission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvComposer: RecyclerView
    private var list: ArrayList<Composer> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        rvComposer = findViewById(R.id.rv_composer)
        rvComposer.setHasFixedSize(true)

        list.addAll(ComposerData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvComposer.layoutManager = LinearLayoutManager(this)
        val listComposerAdapter = ListComposerAdapter(list)
        rvComposer.adapter = listComposerAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_about, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }


    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.myProfile -> {
                val aboutMe = Intent(this@MainActivity, About::class.java)
                startActivity(aboutMe)
            }
        }
    }
}
