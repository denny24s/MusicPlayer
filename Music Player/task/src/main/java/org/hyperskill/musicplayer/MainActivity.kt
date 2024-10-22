package org.hyperskill.musicplayer

import android.app.AlertDialog
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var mainButtonSearch: Button
    private lateinit var mainSongList: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainButtonSearch = findViewById(R.id.mainButtonSearch)
        mainSongList = findViewById(R.id.mainSongList)

        mainButtonSearch.setOnClickListener {
            Toast.makeText(applicationContext, "no songs found", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.mainMenuAddPlaylist -> {
                Toast.makeText(
                    this,
                    "no songs loaded, click search to load songs",
                    Toast.LENGTH_SHORT
                ).show()
                return true
            }

            R.id.mainMenuLoadPlaylist -> {
                AlertDialog.Builder(this)
                    .setTitle("choose playlist to load")
                    .setNegativeButton("cancel", null)
                    .show()
                return true
            }

            R.id.mainMenuDeletePlaylist -> {
                AlertDialog.Builder(this)
                    .setTitle("choose playlist to delete")
                    .setNegativeButton("cancel", null)
                    .show()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
