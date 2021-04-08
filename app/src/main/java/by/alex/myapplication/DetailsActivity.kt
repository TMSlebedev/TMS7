package by.alex.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val detailsText = findViewById<TextView>(R.id.details_text)

        val extraText = intent.getStringExtra(TEXT_EXTRA)

        detailsText.text = extraText.orEmpty()
    }
}