package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        val id = item?.getItemId()
        if(id == R.id.action_one){
            Toast.makeText(this,"It is action one", Toast.LENGTH_LONG).show()
            return true
        }

        if(id == R.id.action_two){
            Toast.makeText(this,"It is action two",Toast.LENGTH_LONG).show()
            return true
        }

        if(id == R.id.action_three){
            Toast.makeText(this,"It is action three",Toast.LENGTH_LONG).show()
            return true
        }

        return super.onOptionsItemSelected(item)
    }


}
