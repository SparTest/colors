package edu.upc.dama.mobile.samples.colors.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import edu.upc.dama.mobile.samples.colors.R

public class BlueFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        return LayoutInflater.from(container?.context).inflate(R.layout.fragment_blue, container, false)
    }

}
