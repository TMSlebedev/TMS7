package by.alex.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlin.reflect.KClass

const val TEXT_EXTRA = "Text Extra"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button_next)
        val inputField = findViewById<EditText>(R.id.input_field)
        val intent = Intent(this, DetailsActivity::class.java)

        button.setOnClickListener {

            intent.putExtra(TEXT_EXTRA,inputField.text.toString())

            startActivity(intent)
        }

    }
}