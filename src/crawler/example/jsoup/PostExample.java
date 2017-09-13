package crawler.example.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class PostExample {


    public static void main(String[] args) throws Exception{
        Document jsoup =
            Jsoup.connect("http://mops.twse.com.tw/mops/web/ajax_t05st03?encodeURIComponent=1&step=1&firstin=ture&off=1&keyword4=&code1=&TYPEK2=&checkbtn=&queryName=co_id&inpuType=co_id&TYPEK=all&co_id=2330")
                .post();

        String capital = jsoup.select("tr:contains(實收資本額) > td").get(0).text();


        String taxNumber = jsoup.select("th:contains(營利事業統一編號) + td").text();


        System.out.println("實收資本額:" + capital);
        System.out.println("營利事業統一編號:" + taxNumber);
    }
}
