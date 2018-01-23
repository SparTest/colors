package edu.upc.dama.testjitpackpublic

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentManager
import edu.upc.dama.mobile.samples.colors.fragments.GreenFragment


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.launchFragment()
    }

    fun launchFragment() : Unit {
        val frag = GreenFragment()

        val mgr : FragmentManager = this.supportFragmentManager

        mgr.beginTransaction().replace(R.id.container, frag).commit()
    }
}
