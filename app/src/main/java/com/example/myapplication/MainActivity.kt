import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    private lateinit var rootLayout: ConstraintLayout
    private lateinit var changeBackgroundButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the views
        rootLayout = findViewById(R.id.constraintLayout)
        changeBackgroundButton = findViewById(R.id.changeBackgroundButton)

        // Set initial background color or image (white in this case)
        rootLayout.setBackgroundColor(Color.WHITE)

        // Set a click listener to the button to change the background
        changeBackgroundButton.setOnClickListener {
            // Call the function to change the background color or image
            changeBackground()
        }
    }

    private fun changeBackground() {
        // You can set a new background color or image here
        // For example, setting a new color:
        rootLayout.setBackgroundColor(Color.BLUE)

        // Or, you can set a background image from a drawable resource:
        // rootLayout.setBackgroundResource(R.drawable.your_background_image)

        // Note: If you want to set an image, make sure to place it in the res/drawable folder.
    }
}
