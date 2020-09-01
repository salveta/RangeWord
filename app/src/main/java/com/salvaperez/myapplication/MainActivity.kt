package com.salvaperez.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        btnSubmit.setOnClickListener {
            val isLegalRegex = viewModel.checkTextWithRegex(edtUserText.text.toString())
            Toast.makeText(this, "First letter of enter string is found in the range [A-Z]: $isLegalRegex", Toast.LENGTH_SHORT ).show()
        }
    }
}