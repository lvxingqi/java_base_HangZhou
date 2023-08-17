/*
package com.lzlgdx.myPersonal;



import com.sun.net.httpserver.HttpContext;
import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.ClassicHttpRequests;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.Closeable;

*/
/**
 * @className: SimpleCrawler.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/05 下午 03:47
 * @Description: 一个简单的爬虫程序
 *//*

public class SimpleCrawler {
    public static void main(String[] args) throws Exception {
        String url = "https://movie.douban.com/";
        System.out.println(url);
        CloseableHttpClient httpClient=HttpClients.createDefault();
        try (httpClient) {
            HttpGet httpGet = new HttpGet(url);
            try (httpGet) {
                Document document = Jsoup.parse(httpClient.getEntity().getContent(), "UTF-8", url);

                // 提取链接
                Elements links = document.select("a[href]");
                for (Element link : links) {
                    System.out.println("Link: " + link.attr("abs:href"));
                }

                // 提取文本内容
                String text = document.text();
                System.out.println("Text: " + text);
            }
        }
    }
}
*/
