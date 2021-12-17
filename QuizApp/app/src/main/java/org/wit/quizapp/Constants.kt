package org.wit.quizapp

object Constants
{
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "What is the third word connected?",
            R.drawable.q_1,
            "ONE", "TWO",
            "THREE", "KEY", 4
        )
        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "What is the third word connected?",
            R.drawable.q_2,
            "ONE", "TWO",
            "THREE", "DECK", 4
        )
        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "What is the third word connected?",
            R.drawable.q_3,
            "ONE", "TWO",
            "THREE", "TRUNK", 4
        )
        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "What is the third word connected?",
            R.drawable.q_4,
            "ONE", "TWO",
            "THREE", "PUPIL", 4
        )
        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "What is the third word connected?",
            R.drawable.q_5,
            "ONE", "TWO",
            "THREE", "CASE", 4
        )
        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "What is the third word connected?",
            R.drawable.q_6,
            "ONE", "TWO",
            "THREE", "BANK", 4
        )
        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "What is the third word connected?",
            R.drawable.q_7,
            "ONE", "TWO",
            "THREE", "SHEET", 4
        )
        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "What is the third word connected?",
            R.drawable.q_8,
            "ONE", "TWO",
            "THREE", "TANK", 4
        )
        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "What is the third word connected?",
            R.drawable.q_9,
            "ONE", "TWO",
            "THREE", "RACQUET", 4
        )
        questionsList.add(que9)

        // 10
        val que10 = Question(
            9, "What is the third word connected?",
            R.drawable.q_10,
            "ONE", "TWO",
            "THREE", "MUMMY", 4
        )
        questionsList.add(que10)

        return questionsList
    }
}