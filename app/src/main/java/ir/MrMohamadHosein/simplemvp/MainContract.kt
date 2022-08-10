package ir.MrMohamadHosein.simplemvp

interface MainContract {

    interface Presenter {

        fun onAttach(view :View)
        fun onDetach()

    }

    interface View {

        fun showStudents(data :List<Student>)

    }

}