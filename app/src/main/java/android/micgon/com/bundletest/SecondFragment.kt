package android.micgon.com.bundletest

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class SecondFragment : Fragment() {
    lateinit var sharedViewModel: SharedViewModel

    lateinit var secondText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        val secondText = view.findViewById<TextView>(R.id.second_text)
        val sharedViewModel = ViewModelProviders.of(this).get(SharedViewModel::class.java)
        val username = arguments?.get(USERNAME) as CharSequence?

        secondText.text = getString(R.string.welcome_second, username)


        return view
    }

    fun newInstance(name: String): SecondFragment{
        val args = Bundle()
        args.putString(USERNAME, name)
        val fragment = SecondFragment()
        fragment.arguments = args
        return fragment
    }

    companion object {
        val USERNAME = "username"
    }


}