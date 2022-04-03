package com.example.androidproject.Models

import java.util.ArrayList

object Constants {

    public val currentquestion = "Current question"
    public val currentscore="Score";

    val USERNAME: String?="NO_NAME";

    val HIGH_SCORE: Int?=0;
    val HIGH_SCORE_USER: String?="USER";
    val TOP_CATEGORY: String?="CATEGORY";







    fun getQuestionsOne(): ArrayList<Question> {

        val questionsList1 = ArrayList<Question>()



        //Category One
        val que1=Question(
            id= 1,
            category=1,
            question = "What happened over the skies of Nuremberg in 1561 CE?",
            optionOne = "A massive aerial battle taking place between numerous strange shapes",
            optionTwo="Strange stars began falling to earth",
            optionThree="A Christian cross manifested over the church",
            optionFour="Flying saucers danced over the city",
        )
        questionsList1.add(que1)

        val que2=Question(
            id= 2,
            category=1,
            question = "The Utsoro-Bune or “Hollow Ship” was discovered by whom?",
            optionOne = "A group of Japanese fishermen",
            optionTwo="A government official",
            optionThree="A troupe of Samurai",
            optionFour="Christian Missionaries",
        )
        questionsList1.add(que2)
        val que3=Question(
            id= 3,
            category=1,
            question = "What destroyed an alien airship and its occupant in Texas 1897?",
            optionOne = "A windmill",
            optionTwo="Anti-aircraft fire",
            optionThree="Local militia",
            optionFour="A skyscraper",
        )
        questionsList1.add(que3)
        val que4=Question(
            id= 4,
            category=1,
            question = "Vespasian’s destruction of the Jewish temple in 70AD was preceeded by what omens?",
            optionOne = "Chariots and armoured soldiers in the sky surrounding the city",
            optionTwo="Multiple stars fell to earth",
            optionThree="A solar eclipse",
            optionFour="The sun began to set in the middle of the day",
        )
        questionsList1.add(que4)
        val que5=Question(
            id= 5,
            category=1,
            question = "What phenomenon interrupted the Roman attack on King Mithridates VI in 74AD?",
            optionOne = "A giant, silver “wine jar” falling between the armies",
            optionTwo="The sun began 'moving backwards'",
            optionThree="Silver soldiers appeared in the sky",
            optionFour="An unrecognized constellation appeared",
        )
        questionsList1.add(que5)

        val que15=Question(
            id= 15,
            category=1,
            question = "What is considered the oldest known reference to UFOs?",
            optionOne = "10 000 year old Bastar Rock Paintings",
            optionTwo="The writings of Pliny the Elder",
            optionThree="Leviticus 17:3",
            optionFour="Hieroglyphs found in Tutankhamun's tomb",
        )
        questionsList1.add(que15)


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
            optionTwo="Seven lights appeared in a 'V' formation and hovered for hours",
            optionThree="Multiple unexplained meteor strikes hit the ocean near the city",
            optionFour="Emergency lines were overwhelmed by UFO reports",
        )
        questionsList2.add(que6)

        val que7=Question(
            id= 7,
            category=2,
            question = "What was the military's initial explanation for the Roswell incident?",
            optionOne = "The capture of a 'flying disc'",
            optionTwo="A routine training exercise",
            optionThree="A weather balloon malfunctioned",
            optionFour="A Soviet attack",
        )
        questionsList2.add(que7)
        val que8=Question(
            id= 8,
            category=2,
            question = "'Mothman' supposedly appeared to warn of what tragic event?",
            optionOne = "Ohio Silver Bridge Collapse",
            optionTwo="September 11",
            optionThree="The Mt. St. Helens Eruption",
            optionFour="The Edington Fire",
        )
        questionsList2.add(que8)
        val que9=Question(
            id= 9,
            category=2,
            question = "What aerial phenomenon was witnessed by over 10 000 people and has been officially recognised by the Catholic Church?",
            optionOne = "The Fatima miracle",
            optionTwo="The ascension of Christ",
            optionThree="St Paul's Good Friday Miracle",
            optionFour="The Guiding Star",
        )
        questionsList2.add(que9)
        val que10=Question(
            id= 10,
            category=2,
            question = "Which US president claimed to have observed a UFO?",
            optionOne = "Jimmy Carter",
            optionTwo="Donald Trump",
            optionThree="Barack Obama",
            optionFour="James Garfield",
        )
        questionsList2.add(que10)
        val que21=Question(
            id= 21,
            category=2,
            question = "When was the first 'flying saucer' sighting?",
            optionOne = "1947CE",
            optionTwo="1000CE",
            optionThree="152BCE",
            optionFour="1463BCE",
        )
        questionsList2.add(que21)
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
            optionTwo="Scientology",
            optionThree="Mormonism",
            optionFour="Seventh Day Adventism",
        )
        questionsList3.add(que11)

        val que12=Question(
            id= 12,
            category=3,
            question = "What were the last known words of pilot Frederick Valentich, before he disappeared in 1978?",
            optionOne = "'It’s not an aircraft'",
            optionTwo="'It's a saucer'",
            optionThree="'Is there another flight scheduled for tonight?'",
            optionFour="'The equipment appears to be malfunctioning'",
        )
        questionsList3.add(que12)
        val que13=Question(
            id= 13,
            category=3,
            question = "Following her and her husband’s reported abduction, what did Betty Hill begin to experience?",
            optionOne = "Vivid dreams of the abduction and examination",
            optionTwo="Repeated Alien Visitations",
            optionThree="An unexplained pregnancy",
            optionFour="Prophetic visions",
        )
        questionsList3.add(que13)
        val que14=Question(
            id= 14,
            category=3,
            question = "What is Elizbeth Klarer’s claim to fame?",
            optionOne = "The first woman to claim sexual contact with an extra terrestrial",
            optionTwo="First reported abduction in South Africa",
            optionThree="A Pioneer in the field of UFOlogy",
            optionFour="A comprehensive report documenting abduction reports",
        )
        questionsList3.add(que14)
        val que15=Question(
            id= 15,
            category=3,
            question = "Who was the first person to publicly claim to have been abducted?",
            optionOne = "Antônio Villas Boas",
            optionTwo="Betty Hill",
            optionThree="Ben Kennedy",
            optionFour="Li Bai",
        )
        questionsList3.add(que15)
        val que31=Question(
            id= 31,
            category=3,
            question = "What type of alien appears most often in abduction accounts?",
            optionOne = "Greys",
            optionTwo="Men in Black",
            optionThree="Pale men",
            optionFour="There is no coherent description",
        )
        questionsList3.add(que31)

        return questionsList3
    }
}