package com.example.kabir

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.kabir.databinding.ActivityDetailBinding


class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    private var imagevalue=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_detail)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_detail)

        with(binding){
            val bundle = intent.extras


            if (bundle != null) {
                imagevalue = bundle.getInt("image")
            }
            image.setImageResource(imagevalue)
            val name=intent.getStringExtra("name")
            if (name=="ajay"){
                Discription.text="Vishal Veeru Devgan (born 2 April 1969), known professionally as Ajay Devgn, is an Indian actor, film director and producer who works in Hindi cinema. Devgn has appeared in over a hundred films and has won numerous accolades, including four National Film Awards and four Filmfare Awards. In 2016, he was honoured by the Government of India with the Padma Shri, the fourth-highest civilian honour of the country.[2]\n" +
                        "\n" +
                        "Devgn began his professional career with Phool Aur Kaante in 1991.[3][4] He then rose to prominence as an action hero starring in successful films such as Jigar (1992), Sangram (1993), Dilwale (1994), Diljale (1996) and Kachche Dhaage (1999). He went on to give critically acclaimed performances in Zakhm (1998), Hum Dil De Chuke Sanam (1999), Company (2002), Deewangee (2002), and The Legend of Bhagat Singh (2002). After the success of Golmaal: Fun Unlimited (2006), he went on to collaborate with Rohit Shetty on a number of action-comedies including Golmaal Returns (2008), All the Best: Fun Begins (2009), Golmaal 3 (2010), Singham (2011), Bol Bachchan (2012), Singham Returns (2014), and Golmaal Again (2017). His highest-grossing movies include Total Dhamaal (2019) and Tanhaji (2020).[5]\n" +
                        "\n" +
                        "In addition, Devgn owns a production company Ajay Devgn FFilms, which was established in 2000. In 2008, he debuted as a film director with U Me Aur Hum. He has been married to film actress Kajol since 1999."

            }
            if (name=="akshy"){
                Discription.text="Rajiv Hari Om Bhatia (born 9 September 1967),[4] known professionally as Akshay Kumar (pronounced [əkˈʂəj kʊˈmɑːɾ]), is an Indian-born naturalised Canadian[1][2][3] actor and film producer who works in Hindi cinema. In over 30 years of acting, Kumar has appeared in over 100 films and has won several awards, including two National Film Awards and two Filmfare Awards. He received the Padma Shri, India's fourth-highest civilian honour, from the Government of India in 2009.[5][6] Forbes included Kumar in their lists of both highest-paid celebrities and highest-paid actors in the world from 2015 to 2020.[7][8] Between 2019-2020, he was the only Indian on both lists.[9][10][11]\n" +
                        "\n" +
                        "Kumar began his career in 1991 with Saugandh and had his first commercial success a year later with the action thriller Khiladi. The film established him as an action star in the 1990s and spawned several films starring Kumar commonly known as the Khiladi film series, in addition to a string of other action films such as Mohra (1994) and Jaanwar (1999). Although his early tryst with romance in Yeh Dillagi (1994) was positively received, it was in the next decade that Kumar expanded his range of roles. He gained recognition for the romantic films Dhadkan (2000), Andaaz (2003), Namastey London (2007), and for his comic performances in Hera Pheri (2000), Mujhse Shaadi Karogi (2004), Phir Hera Pheri (2006), Bhool Bhulaiyaa (2007), and Singh Is Kinng (2008). Kumar won Filmfare Awards for his negative role in Ajnabee (2001) and his comic performance in Garam Masala (2005).\n" +
                        "\n" +
                        "While his career had fluctuated commercially, his mainstream success soared in 2007 with four consecutive box-office hits; it was consistent until a short period of professional setbacks between 2009 and 2011, after which he reinforced his status with several films, including Rowdy Rathore (2012) and Holiday (2014). Moreover, around this time the critical response to several of his films improved; after critical appreciation came his way for his work in Special 26 (2013), Baby (2015) and Airlift (2016), he won the National Film Award for Best Actor for his performance in the crime thriller Rustom (2016). He earned further notice for his self-produced social films Toilet: Ek Prem Katha (2017) and Pad Man (2018), and the war film Kesari (2019), and set box-office records in 2019 with Mission Mangal, Housefull 4, Good Newwz, and the 2021 action film Sooryavanshi. In addition to acting, Kumar has worked as a stunt actor.[a] In 2014, Kumar launched the TV reality show Dare 2 Dance. He owns the team Khalsa Warriors in the World Kabaddi League.\n" +
                        "\n" +
                        "Sometime during or after the 2011 Canadian federal election, the Conservative government granted Canadian citizenship to Kumar by invoking a little-known law which allowed circumventing the usual residency requirement for Canadian immigrants.[1] According to a former Conservative Party minister, Tony Clement, the citizenship was awarded in return for Kumar's offer of putting his \"star power to use to advance Canada-Indian relations\", and Canada's \"trade relations, commercial relations, in the movie sector, in the tourism sector\".[1]"
            }
            if (name=="Salman"){
                Discription.text="Abdul Rashid Salim Salman Khan (Hindi: [səlˈmɑːn xɑːn]; 27 December 1965)[2] is an Indian actor, film producer, and television personality who works in Hindi films. In a film career spanning over thirty years, Khan has received numerous awards, including two National Film Awards as a film producer, and two Filmfare Awards as an actor.[3] He is cited in the media as one of the most commercially successful actors of Indian cinema.[4][5] Forbes has included Khan in listings of the highest-paid celebrities in the world, in 2015 and 2018, with him being the highest-ranked Indian in the latter year.[6][7][8][9]\n" +
                        "\n" +
                        "The eldest son of screenwriter Salim Khan, Khan began his acting career with a supporting role in Biwi Ho To Aisi (1988), followed by his breakthrough with a leading role in Maine Pyar Kiya (1989). He established himself in Bollywood in the 1990s, with several commercially successful films, including the romantic drama Hum Aapke Hain Koun..! (1994), the action thriller Karan Arjun (1995), the comedy Biwi No.1 (1999), and the family drama Hum Saath-Saath Hain (1999). After a brief period of decline in the 2000s, Khan achieved greater stardom in the 2010s by starring in top-grossing action films like Dabangg (2010), Ready (2011), Bodyguard (2011), Ek Tha Tiger (2012), Dabangg 2 (2012), Kick (2014), and Tiger Zinda Hai (2017), and dramas such as Bajrangi Bhaijaan (2015) and Sultan (2016). Khan has starred in 10 of the highest-grossing Hindi films of the year, the highest for any actor.[10]\n" +
                        "\n" +
                        "In addition to his acting career, Khan is a television presenter and promotes humanitarian causes through his charity, Being Human Foundation.[11] He has been hosting the reality show Bigg Boss since 2010.[12] Khan's off-screen life is marred by controversy and legal troubles. In 2015, he was convicted of culpable homicide for a negligent driving case in which he ran over five people with his car, killing one, but his conviction was set aside on appeal.[13][14][15][16] On 5 April 2018, Khan was convicted in a blackbuck poaching case and sentenced to five years imprisonment.[17][18] He is currently out on bail while an appeal is being heard.[19]"
            }
            if (name=="Sahrukh"){
                Discription.text="Shah Rukh Khan (pronounced [ˈʃɑːɦɾʊx xɑːn]; born 2 November 1965), also known by the initialism SRK, is an Indian actor, film producer, and television personality who works in Hindi films. Referred to in the media as the \"Baadshah of Bollywood\" (in reference to his 1999 film Baadshah), \"King of Bollywood\" and \"King Khan\", he has appeared in more than 80 films, and earned numerous accolades, including 14 Filmfare Awards. The Government of India has awarded him the Padma Shri, and the Government of France has awarded him the Ordre des Arts et des Lettres and the Legion of Honour. Khan has a significant following in Asia and the Indian diaspora worldwide. In terms of audience size and income, he has been described as one of the most successful film stars in the world.\n" +
                        "\n" +
                        "Khan began his career with appearances in several television series in the late 1980s. He made his Bollywood debut in 1992 with Deewana. Early in his career, Khan was recognised for portraying villainous roles in the films Baazigar (1993), Darr (1993), and Anjaam (1994). He then rose to prominence after starring in a series of romantic films, including Dilwale Dulhania Le Jayenge (1995), Dil To Pagal Hai (1997), Kuch Kuch Hota Hai (1998), Mohabbatein (2000) and Kabhi Khushi Kabhie Gham... (2001). Khan went on to earn critical acclaim for his portrayal of an alcoholic in Devdas (2002), a NASA scientist in Swades (2004), a hockey coach in Chak De! India (2007) and a man with Asperger syndrome in My Name Is Khan (2010). His highest-grossing films include the comedies Chennai Express (2013), Happy New Year (2014), Dilwale (2015), and the crime film Raees (2017). Many of his films display themes of Indian national identity and connections with diaspora communities, or gender, racial, social and religious differences and grievances.\n" +
                        "\n" +
                        "As of 2015, Khan is co-chairman of the motion picture production company Red Chillies Entertainment and its subsidiaries and is the co-owner of the Indian Premier League cricket team Kolkata Knight Riders and the Caribbean Premier League team Trinbago Knight Riders. He is a frequent television presenter and stage show performer. The media often label him as \"Brand SRK\" because of his many endorsement and entrepreneurship ventures. Khan's philanthropic endeavours have provided health care and disaster relief, and he was honoured with UNESCO's Pyramide con Marni award in 2011 for his support of children's education and the World Economic Forum's Crystal Award in 2018 for his leadership in championing women's and children's rights in India. He regularly features in listings of the most influential people in Indian culture, and in 2008, Newsweek named him one of their fifty most powerful people in the world."
            }
        }
    }
}