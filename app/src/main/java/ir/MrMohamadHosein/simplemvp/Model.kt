package ir.MrMohamadHosein.simplemvp

class Model {

    fun getStudents() :List<Student> {

        val fakeData = listOf<Student>(
            Student("mohamad hosein" , "kazemi") ,
            Student("sajad" , "taheri") ,
            Student("setare" , "etebarzade") ,
            Student("ahmad" , "jamali") ,
            Student("parisa" , "mehdi zade") ,
        )

        return fakeData
    }

}