import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Main
{
    public static void main(String args[])
    {
//        MetaMindResults sample = new MetaMindResults("Matthew Hoare");
//        System.out.println(sample.toString());

        Game halo = new Game("");

        try {
            Document doc = Jsoup.connect("http://www.ign.com/articles/2007/09/25/halo-3-collectors-edition-review?page=5").get();
            Elements newsHeadlines = doc.select(".scorebox_breakdownBoxComment");

            System.out.println(newsHeadlines.text().toString());
        }
        catch (Exception e)
        {

        }

    }

}
