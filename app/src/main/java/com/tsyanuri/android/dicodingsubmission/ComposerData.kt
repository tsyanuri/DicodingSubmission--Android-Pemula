package com.tsyanuri.android.dicodingsubmission


object ComposerData {
    private val composerName = arrayOf("Frédéric Chopin",
        "Franz Schubert",
        "Sergei Vasilyevich Rachmaninoff",
        "Antonio Vivaldi",
        "Wolfgang Amadeus Mozart",
        "Ludwig van Beethoven",
        "Claude Debussy",
        "Johann Sebastian Bach",
        "Niccolò Paganini",
        "Felix Mendelssohn")

    private val composerDetails = arrayOf("Fryderyk Franciszek Chopin (1 March 1810 – 17 October 1849), was a Polish composer and virtuoso pianist of the Romantic era who wrote primarily for solo piano. He has maintained worldwide renown as a leading musician of his era, one whose poetic genius was based on a professional technique that was without equal in his generation",
        "Franz Peter Schubert (31 January 1797 – 19 November 1828) was an Austrian composer of the late Classical and early Romantic eras. Despite his short lifetime, Schubert left behind a vast oeuvre, including more than 600 secular vocal works (mainly lieder), seven complete symphonies, sacred music, operas, incidental music and a large body of piano and chamber music. His major works include the Piano Quintet in A major, D. 667 (Trout Quintet), the Symphony No. 8 in B minor, D. 759 (Unfinished Symphony), the ”Great” Symphony No. 9 in C major, D. 944, the String Quintet (D. 956), the three last piano sonatas (D. 958–960), the opera Fierrabras (D. 796), the incidental music to the play Rosamunde (D. 797), and the song cycles Die schöne Müllerin (D. 795) and Winterreise (D. 911).",
        "Sergei Vasilyevich Rachmaninoff (1 April 1873 – 28 March 1943) was a Russian composer, virtuoso pianist, and conductor of the late Romantic period. The influence of Tchaikovsky, Rimsky-Korsakov, Balakirev, Mussorgsky, and other Russian composers is seen in his early works, later giving way to a personal style notable for song-like melodicism, expressiveness and rich orchestral colors",
        "Antonio Lucio Vivaldi (4 March 1678 – 28 July 1741) was an Italian[6] Baroque musical composer, virtuoso violinist, teacher, and Roman Catholic priest. Born in Venice, the capital of the Venetian Republic, he is regarded as one of the greatest Baroque composers, and his influence during his lifetime was widespread across Europe. He composed many instrumental concertos, for the violin and a variety of other musical instruments, as well as sacred choral works and more than forty operas. His best-known work is a series of violin concertos known as the Four Seasons.",
        "Wolfgang Amadeus Mozart (27 January 1756 – 5 December 1791), baptised as Johannes Chrysostomus Wolfgangus Theophilus Mozart,[b] was a prolific and influential composer of the Classical period. Born in Salzburg, Mozart showed prodigious ability from his earliest childhood. Already competent on keyboard and violin, he composed from the age of five and performed before European royalty. At 17, Mozart was engaged as a musician at the Salzburg court but grew restless and travelled in search of a better position.",
        "Ludwig van Beethoven baptised 17 December 1770 – 26 March 1827) was a German composer and pianist; his music is amongst the most performed of the classical music repertoire, and he is one of the most admired composers in the history of Western music. His works span the transition from the classical period to the romantic era in classical music. His career has conventionally been divided into early, middle, and late periods. The early period in which he forged his craft is typically seen to last until 1802.",
        "(Achille) Claude Debussy (22 August 1862 – 25 March 1918) was a French composer. He is sometimes seen as the first Impressionist composer, although he vigorously rejected the term. He was among the most influential composers of the late 19th and early 20th centuries.",
        "Johann Sebastian Bach (31 March 1685 – 28 July 1750) was a German composer and musician of the Baroque period. He is known for instrumental compositions such as the Brandenburg Concertos and the Goldberg Variations, and for vocal music such as the St Matthew Passion and the Mass in B minor. Since the 19th-century Bach Revival he is generally regarded as one of the greatest composers of all time.",
        "Niccolò (or Nicolò) Paganini (27 October 1782 – 27 May 1840) was an Italian violinist, violist, guitarist, and composer. He was the most celebrated violin virtuoso of his time, and left his mark as one of the pillars of modern violin technique. His 24 Caprices for Solo Violin Op. 1 are among the best known of his compositions, and have served as an inspiration for many prominent composers.",
        "Jakob Ludwig Felix Mendelssohn Bartholdy (3 February 1809 – 4 November 1847), born and widely known as Felix Mendelssohn, was a German composer, pianist, organist and conductor of the early Romantic period. Mendelssohn's compositions include symphonies, concertos, piano music and chamber music. His best-known works include his overture and incidental music for A Midsummer Night's Dream, the Italian Symphony, the Scottish Symphony, the oratorio Elijah, the overture The Hebrides, his mature Violin Concerto, and his String Octet. The melody for the Christmas carol Hark! The Herald Angels Sing is also his. Mendelssohn's Songs Without Words are his most famous solo piano compositions."
        )

    private val composerImages = intArrayOf(R.drawable.chopin,
        R.drawable.schubert,
        R.drawable.rachmaninov,
        R.drawable.vivaldi,
        R.drawable.mozart,
        R.drawable.beethoven,
        R.drawable.debussy,
        R.drawable.bach,
        R.drawable.paganini,
        R.drawable.mendelssohn)

    val listData: ArrayList<Composer>
        get() {
            val list = arrayListOf<Composer>()
            for (position in composerName.indices) {
                val composer = Composer()
                composer.name = composerName[position]
                composer.detail = composerDetails[position]
                composer.photo = composerImages[position]
                list.add(composer)
            }
            return list
        }
}
