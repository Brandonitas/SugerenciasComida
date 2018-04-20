package mx.itesm.edu.earthone.sugerenciascena

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    val cenas = arrayListOf("Hotdog", "Comida china","Quesadillas","Tamales")
    val cal = arrayListOf("290", "1400", "300", "153")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        comidaText.text = cenas[0]
        calorias.text = cal[0]
        agrega.setOnClickListener{
            val nuevacena = nuevaText.text.toString()
            cenas.add(nuevacena)
            nuevaText.text.clear()

            val agregarcaloria = agregarCaloria.text.toString()
            cal.add(agregarcaloria)
            agregarCaloria.text.clear()

        }

        selecciona.setOnClickListener {
            val aleatorio = Random()
            val cenaAleatorio = aleatorio.nextInt(cenas.count())
            comidaText.text = cenas[cenaAleatorio]
            calorias.text = cal[cenaAleatorio]
        }

    }
}
