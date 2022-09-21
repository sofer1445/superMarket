import jdk.jshell.SourceCodeAnalysis;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.net.ssl.HttpsURLConnection;
import javax.print.DocFlavor;
import javax.swing.*;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.http.HttpClient;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class ProductPrices {
    private TreeMap<String, Double> shufersalPrices = new TreeMap<>();
    private TreeMap<String, Double> ramiLeviPrices = new TreeMap<>();
    private TreeMap<String, Double> quikPrices = new TreeMap<>();
    private TreeMap<String, Double> mckPrices = new TreeMap<>();
    private List<String> products;

    public ProductPrices() {
        this.products = new ArrayList<>();
    }


    public void shufersalPriceComparison(String value) {
        new Thread(() -> {
            double price = 999;
            try {
                Document doc = Jsoup.connect(Final.URL_SHUFERSAL + value).get();
                Elements elementHead = doc.getElementsByClass("middleContainer");
                Element element = elementHead.get(0).getElementsByClass("number").first();
                assert element != null;
                price = Double.parseDouble(element.text());
                System.out.println(price);
            } catch (Exception e) {
                System.out.println(e + "price error");
                JOptionPane.showMessageDialog(null, "no such product in shufersal");
            }
            this.shufersalPrices.put(value, price);
        }).start();
    }

    public void ramiLeviPriceComparison(String value) {
        System.out.println("rami");
        new Thread(() -> {
            double price = 999;
            try {
                Document doc = Jsoup.connect(Final.URL_RAMI_LEVI + value).get();
                System.out.println("find url");
                System.out.println(doc.title());
                Element elementHead = doc.getElementById("__layout");//לא עובד
                Elements element = elementHead.getElementsByClass("bg-gray-100 nuxt-wrap");
                System.out.println(element.size());
                Elements element1 = element.get(0).getElementsByAttribute("data-v-11a263d2");
                System.out.println(element1);
                price = Double.parseDouble(element.text());
                System.out.println(price);
            } catch (Exception e) {
                System.out.println(e + "error");
            }
            this.ramiLeviPrices.put(value, price);

        }).start();
    } //לא עובד

    public void quikPriceComparison(String value) {
        new Thread(() -> {
            double price = 999;
            try {
                Document doc = Jsoup.connect(Final.URL_QUIK + value).get();
                System.out.println("find url");
                System.out.println(Final.URL_QUIK + value);
                String title = doc.title();
                System.out.println(title);
                Elements elementId = doc.getElementsByAttribute("id");
                System.out.println(elementId.size() + "," + elementId.text());
                Element elementHead = doc.getElementById("root");
                System.out.println(elementHead);

                System.out.println(price);
            } catch (Exception e) {
                System.out.println("error");
            }
            this.quikPrices.put(value, price);
        }).start();
    }//לא עובד

    public void mckPriceComparison(String value) {
        new Thread(() -> {
            double price = 999;
            try {
                Document doc = Jsoup.connect(Final.URL_MCK).get();
                System.out.println("find url");
                System.out.println(Final.URL_MCK);
                Elements elementHead = doc.getElementsByTag("Sale");
                System.out.println(elementHead.size());

                price = Float.parseFloat(elementHead.text());
                System.out.println(price);
            } catch (Exception e) {
                System.out.println(e + "error");
            }
            this.mckPrices.put(value, price);
        }).start();
    }

    public List<String> shoppingCart() {
        try {
            if (!shufersalPrices.isEmpty()) {
                System.out.println("shufersal");
                for (String key : shufersalPrices.keySet()) {
                    this.products.add(key + " " + shufersalPrices.get(key));
                    System.out.println(key + " " + shufersalPrices.get(key));
                }
            }
            if (!ramiLeviPrices.isEmpty()) {
                System.out.println("rami");
                for (String key : ramiLeviPrices.keySet()) {
                    System.out.println(key + " " + ramiLeviPrices.get(key));
                }
            }
            if (!quikPrices.isEmpty()) {
                System.out.println("quik");
                for (String key : quikPrices.keySet()) {
                    System.out.println(key + " " + quikPrices.get(key));
                }
            }
            if (!mckPrices.isEmpty()) {
                System.out.println("mck");
                for (String key : mckPrices.keySet()) {
                    System.out.println(key + " " + mckPrices.get(key));
                }
            }
        } catch (Exception e) {
            System.out.println(e + " error");
        }
        return this.products;
    }
}
