package ir.MrMohamadHosein.simplemvp

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentA :Fragment() , MainContract.View {
    private val mainPresenter :MainContract.Presenter = MainPresenter()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        mainPresenter.onAttach(this)
    }

    override fun onStop() {
        super.onStop()
        mainPresenter.onDetach()
    }

    override fun showStudents(data: List<Student>) {
        Log.v("testLog" , data.toString())
    }


}