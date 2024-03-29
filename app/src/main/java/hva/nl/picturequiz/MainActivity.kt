package hva.nl.picturequiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Sets the activity layout resource file.

        // Using the id given in the layout file you can access the component.
        // Set an action when the user clicks on the confirm button.
        btnConfirm.setOnClickListener {
            checkAnswer()
        }

    }


    /**
     * Check if the submitted answer is correct.
     */
    private fun checkAnswer() {
        val answer = etAnswer.text.toString()

        if (answer != getString(R.string.giraffe)) {
            Toast.makeText(this, getString(R.string.incorrect), Toast.LENGTH_LONG).show()
            return
        }
        Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_LONG).show()

    }
}