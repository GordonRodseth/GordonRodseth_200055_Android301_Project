package com.example.androidproject.Models

import java.util.ArrayList

object Constants {

    public val currentquestion = "Current question"
    public val score="0"

    fun getQuestionsOne(): ArrayList<Question> {

        val questionsList1 = ArrayList<Question>()



        //Category One
        val que1=Question(
            id= 1,
            category=1,
            question = "What happened over the skies of Nuremberg in 1561 CE?",
            optionOne = "A massive aerial battle taking place between numerous strange shapes",
            optionTwo="Wrong Answer",
            optionThree="Wrong Answer",
            optionFour="Wrong Answer",
        )
        questionsList1.add(que1)

        val que2=Question(
            id= 2,
            category=1,
            question = "The Utsoro-Bune or “Hollow Ship” was discovered by whom?",
            optionOne = "A group of Japanese fishermen",
            optionTwo="Wrong Answer",
            optionThree="Wrong Answer",
            optionFour="Wrong Answer",
        )
        questionsList1.add(que2)
        val que3=Question(
            id= 3,
            category=1,
            question = "What destroyed an alien airship and its occupant in Texas 1897?",
            optionOne = "A windmill",
            optionTwo="Wrong Answer",
            optionThree="Wrong Answer",
            optionFour="Wrong Answer",
        )
        questionsList1.add(que3)
        val que4=Question(
            id= 4,
            category=1,
            question = "Vespasian’s destruction of the Jewish temple in 70AD was preceeded by what omens?",
            optionOne = "Chariots and armoured soldiers in the sky surrounding the city",
            optionTwo="Wrong Answer",
            optionThree="Wrong Answer",
            optionFour="Wrong Answer",
        )
        questionsList1.add(que4)
        val que5=Question(
            id= 5,
            category=1,
            question = "What phenomenon interrupted the Roman attack on King Mithridates VI in 74AD?",
            optionOne = "A giant, silver “wine jar” falling between the armies",
            optionTwo="Wrong Answer",
            optionThree="Wrong Answer",
            optionFour="Wrong Answer",
        )
        questionsList1.add(que5)


        return questionsList1
    }


    fun getQuestionsTwo(): ArrayList<Question> {

        val questionsList2 = ArrayList<Question>()

//Category Two
        val que6=Question(
            id= 6,
            category=2,
            question = "What happened in the infamous Battle of Los Angeles?",
            optionOne = "Unidentified airship sightings triggered a significant military response",
            optionTwo="Wrong Answer",
            optionThree="Wrong Answer",
            optionFour="Wrong Answer",
        )
        questionsList2.add(que6)

        val que7=Question(
            id= 7,
            category=2,
            question = "What was the military's initial explanation for the Roswell incident?",
            optionOne = "The military claimed it had captured a 'flying disc'",
            optionTwo="Wrong Answer",
            optionThree="Wrong Answer",
            optionFour="Wrong Answer",
        )
        questionsList2.add(que7)
        val que8=Question(
            id= 8,
            category=2,
            question = "'Mothman' supposedly appeared to warn of what tragic event?",
            optionOne = "Ohio Silver Bridge Collapse",
            optionTwo="Wrong Answer",
            optionThree="Wrong Answer",
            optionFour="Wrong Answer",
        )
        questionsList2.add(que8)
        val que9=Question(
            id= 9,
            category=2,
            question = "What aerial phenomenon was witnessed by over 10 000 people and has been officially recognised by the Catholic Church?",
            optionOne = "The Fatima miracle",
            optionTwo="Wrong Answer",
            optionThree="Wrong Answer",
            optionFour="Wrong Answer",
        )
        questionsList2.add(que9)
        val que10=Question(
            id= 10,
            category=2,
            question = "Which US president claimed to have observed a UFO?",
            optionOne = "Jimmy Carter",
            optionTwo="Wrong Answer",
            optionThree="Wrong Answer",
            optionFour="Wrong Answer",
        )
        questionsList2.add(que10)

        return questionsList2
    }


    fun getQuestionsThree(): ArrayList<Question> {

        val questionsList3 = ArrayList<Question>()

        //Category Three
        val que11=Question(
            id= 11,
            category=3,
            question = "Claude Vorilhon’s alleged contact with alien lifeforms led to the founding of what religion?",
            optionOne = "Raelianism",
            optionTwo="Wrong Answer",
            optionThree="Wrong Answer",
            optionFour="Wrong Answer",
        )
        questionsList3.add(que11)

        val que12=Question(
            id= 12,
            category=3,
            question = "What were the last known words of pilot Frederick Valentich, before he disappeared in 1978?",
            optionOne = "'It’s not an aircraft'",
            optionTwo="Wrong Answer",
            optionThree="Wrong Answer",
            optionFour="Wrong Answer",
        )
        questionsList3.add(que12)
        val que13=Question(
            id= 13,
            category=3,
            question = "Following her and her husband’s reported abduction, what did Betty Hill begin to experience?",
            optionOne = "Vivid dreams of the abduction and examination",
            optionTwo="Wrong Answer",
            optionThree="Wrong Answer",
            optionFour="Wrong Answer",
        )
        questionsList3.add(que13)
        val que14=Question(
            id= 14,
            category=3,
            question = "What is Elizbeth Klarer’s claim to fame?",
            optionOne = "The first woman to claim sexual contact with an extra terrestrial",
            optionTwo="Wrong Answer",
            optionThree="Wrong Answer",
            optionFour="Wrong Answer",
        )
        questionsList3.add(que14)
        val que15=Question(
            id= 15,
            category=3,
            question = "Who was the first person to publicly claim to have been abducted?",
            optionOne = "Antônio Villas Boas",
            optionTwo="Wrong Answer",
            optionThree="Wrong Answer",
            optionFour="Wrong Answer",
        )
        questionsList3.add(que15)

        return questionsList3
    }
}