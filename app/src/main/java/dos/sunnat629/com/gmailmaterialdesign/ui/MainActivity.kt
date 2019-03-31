package dos.sunnat629.com.gmailmaterialdesign.ui

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import dos.sunnat629.com.gmailmaterialdesign.R
import dos.sunnat629.com.gmailmaterialdesign.model.entities.MailContent
import dos.sunnat629.com.gmailmaterialdesign.ui.adapters.MailListAdapter
import dos.sunnat629.com.gmailmaterialdesign.utils.Calculate
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupListUpdate()
    }


    private fun setupListUpdate() {
        val mailList = Array(100) { count -> MailContent("User$count",23,"April $count",
            "Mail Subject $count",getString(R.string.dummy), Calculate.getRandomBoolean(),
            Calculate.getRandomBoolean(),Calculate.getRandomBoolean(),"") }

        val adapter = MailListAdapter(this, mailList)
        list.adapter = adapter
        list.layoutManager = LinearLayoutManager(this)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(dos.sunnat629.com.gmailmaterialdesign.R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            dos.sunnat629.com.gmailmaterialdesign.R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
