package mx.edu.itson.popcornfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MovieDetail : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

            val header_image: ImageView = findViewById(R.id.header_image)
            val title: TextView = findViewById(R.id.title)
            val sinopsis: TextView = findViewById(R.id.sinopsis)

            var extras = intent.extras

            var titulo_pelicula = extras?.getString("titulo")
            var pelicula_des = extras?.getString("sinopsis")
            var imagen_pelicula = extras?.getInt("header")

            title.text = titulo_pelicula
            sinopsis.text = pelicula_des
            header_image.setImageResource(imagen_pelicula!!)



        }
}