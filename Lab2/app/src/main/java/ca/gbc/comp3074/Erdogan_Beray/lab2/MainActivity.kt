package ca.gbc.comp3074.Erdogan_Beray.lab2
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private var counter = 0
    private var stepSize = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val tvOutput = findViewById<TextView>(R.id.tvOutput)
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnSubtract = findViewById<Button>(R.id.btnSubtract)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val btnStep = findViewById<Button>(R.id.btnStep)

        btnAdd.setOnClickListener {
            counter += stepSize
            tvOutput.text = counter.toString()
        }

        btnSubtract.setOnClickListener {
            counter -= stepSize
            tvOutput.text = counter.toString()
        }

        btnReset.setOnClickListener {
            counter = 0
            stepSize = 1
            tvOutput.text = counter.toString()
        }

        btnStep.setOnClickListener {
            stepSize = 2
        }
    }
}