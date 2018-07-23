package enzapps.com.recyclerview_kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycler.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val users = ArrayList<User>()
        users.add(User("Jack"))
        users.add(User("Smith"))
        users.add(User("Henry"))
        users.add(User("Marques"))
        users.add(User("Paulo"))
        users.add(User("Gabriel"))

        val adapter=CustomAdapter(users)
        recycler.adapter=adapter


    }
}
