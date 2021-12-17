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
            "FURNITURE", "KEY",
            "APPLE", "SHINE", 2
        )
        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "What is the third word connected?",
            R.drawable.q_2,
            "SQUARE", "KING",
            "WOOD", "DECK", 4
        )
        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "What is the third word connected?",
            R.drawable.q_3,
            "STRONG", "CLEAN",
            "TRUNK", "CHILL", 3
        )
        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "What is the third word connected?",
            R.drawable.q_4,
            "PUPIL", "TEACHER",
            "KID", "ROCK", 1
        )
        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "What is the third word connected?",
            R.drawable.q_5,
            "JUSTICE", "CASE",
            "BORING", "SHAPE", 2
        )
        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "What is the third word connected?",
            R.drawable.q_6,
            "WOLF", "FLOW",
            "DENSE", "BANK", 4
        )
        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "What is the third word connected?",
            R.drawable.q_7,
            "IMAGINATION", "SLEEP",
            "SHEET", "THIN", 3
        )
        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "What is the third word connected?",
            R.drawable.q_8,
            "BANANA", "POTABLE",
            "TREE", "TANK", 4
        )
        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "What is the third word connected?",
            R.drawable.q_9,
            "RACQUET", "MUSIC",
            "ANNOYING", "SPORT", 1
        )
        questionsList.add(que9)

        // 10
        val que10 = Question(
            9, "What is the third word connected?",
            R.drawable.q_10,
            "OLD", "MUMMY",
            "DRY", "RESPECTED", 2
        )
        questionsList.add(que10)

        return questionsList
    }
}