package dev.hackwithsodiq.gitng

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.RecyclerView
import dev.hackwithsodiq.gitng.recycler.Adapter
import dev.hackwithsodiq.gitng.retrofit.RestApiService
import kotlinx.coroutines.launch

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    lateinit var retrofit: Retrofit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        retrofit = Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val service = retrofit.create(RestApiService::class.java)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        lifecycleScope.launch {
            val response = service.getUsers()

            val adapter = Adapter(response ?: emptyList())
            recyclerView.adapter = adapter
        }
    }
}