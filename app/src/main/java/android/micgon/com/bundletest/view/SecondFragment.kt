package android.micgon.com.bundletest.view

import android.arch.lifecycle.ViewModelProviders
import android.micgon.com.bundletest.R
import android.micgon.com.bundletest.viewmodel.SharedViewModel
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class SecondFragment : Fragment() {
    lateinit var sharedViewModel: SharedViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        val secondText = view.findViewById<TextView>(R.id.second_text)
        val sharedViewModel = ViewModelProviders.of(this).get(SharedViewModel::class.java)
        val USER_ID = arguments?.get(USER_ID) as CharSequence?

        secondText.text = getString(R.string.welcome_second, USER_ID)


        return view
    }



    companion object {
        private val USER_ID = "id"

        fun newInstance(name: String): SecondFragment {
            val args = Bundle()
            args.putString(USER_ID, name)
            val fragment = SecondFragment()
            fragment.arguments = args
            return fragment
        }
    }


}