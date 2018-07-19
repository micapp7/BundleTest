package android.micgon.com.bundletest.view

import android.micgon.com.bundletest.R
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class MasterFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_master, container, false)
        val masterButton = view.findViewById<Button>(R.id.master_button)
        val editText = view.findViewById<EditText>(R.id.et_username)

        masterButton.setOnClickListener {
            val secondFragment: SecondFragment = SecondFragment.newInstance(editText.text.toString())
            activity?.supportFragmentManager?.beginTransaction()
                    ?.replace(R.id.fragment_container, secondFragment, "second fragment tag")
                    ?.addToBackStack(null)
                    ?.commit()
            editText.text.clear()
        }

        return view
    }

}