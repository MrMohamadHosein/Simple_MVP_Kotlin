package ir.MrMohamadHosein.simplemvp

class MainPresenter :MainContract.Presenter {
    private var mainView :MainContract.View? = null

    override fun onAttach(view: MainContract.View) {
        mainView = view
        mainView!!.showStudents( Model().getStudents() )
    }

    override fun onDetach() {
        mainView = null
    }

}