package org.example.Wrapper;

import org.jsoup.Jsoup;

import java.io.IOException;

/*
    Proszę wybrać sobie jeden wzorzec strukturalny napisać jego kod oraz opisać jakie
    zastosowanie ma to co Państwo napisali (np. korzystamy z jednego API XML a potem
    odsyłamy te dane w inne miejsce za pomocą JSON to wykorzystany zostanie adapter aby
    przekonwertować jeden format na drugi).
 */
public class Main {
    static final String URL ="https://www.w3schools.com/xml/simple.xml";
    public static void main(String[] args) {
        try {
            String xml = Jsoup.connect(URL).get().html();
            String json = XmlToJsonAdapter.convertXmlToJson(xml);

            System.out.println("XML: \n" + xml);
            System.out.println("JSON: \n" + json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
