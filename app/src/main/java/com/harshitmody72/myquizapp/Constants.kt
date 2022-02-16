package com.harshitmody72.myquizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answer"


    fun getQuestions() : ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,"What country does this flag belong to?.",
            R.drawable.ic_argentina,
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            1
        )
        questionsList.add(que1)

        val que2 = Question(
            2,"What country does this flag belong to?.",
            R.drawable.ic_australia,
            "Angola",
            "Armenia",
            "Australia",
            "Armenia",
            3
        )
        questionsList.add(que2)



        val que3 = Question(
            3,"What country does this flag belong to?.",
            R.drawable.ic_brazil,
            "Belarus",
            "Belize",
            "Brunei",
            "Brazil",
            4
        )
        questionsList.add(que3)

        //4
        val que4 = Question(
            4,"What country does this flag belong to?.",
            R.drawable.ic_belgium,
            "Bahamas",
            "Belgium",
            "Barbados",
            "Belize",
            2
        )
        questionsList.add(que4)

        //5
        val que5 = Question(
            5,"What country does this flag belong to?.",
            R.drawable.ic_fiji,
            "Gabon",
            "France",
            "Fiji",
            "Finland",
            3
        )
        questionsList.add(que5)

        //6
        val que6 = Question(
            6,"What country does this flag belong to?.",
            R.drawable.ic_denmark,
            "Dominica",
            "Egypt",
            "Denmark",
            "Austria",
            3
        )
        questionsList.add(que6)

        //7
        val que7 = Question(
            7,"What country does this flag belong to?.",
            R.drawable.ic_germany,
            "Georgia",
            "Germany",
            "Greece",
            "none of these",
            2

        )
        questionsList.add(que7)

        //8
        val que8 = Question(
            8,"What country does this flag belong to?.",
            R.drawable.ic_india,
            "Ireland",
            "Iran",
            "Hungary",
            "India",
            4
        )
        questionsList.add(que8)

        // 9
        val que9 = Question(
            9,"What country does this flag belong to?.",
            R.drawable.ic_kuwait,
            "kuwait",
            "Jordan",
            "Sudan",
            "Palestine",
            1
        )
        questionsList.add(que9)






        return questionsList
    }

}