package com.douzone.crawling.test;

import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class test {

	public static void main(String[] args) throws Exception {
		String url = "http://www.cgv.co.kr/movies/";
		Document doc = null;

		try {
			doc = Jsoup.connect(url).get();
			Elements elements = doc.select("div.sect-movie-chart");
			Iterator<Element> rank = elements.select("strong.rank").iterator();
			Iterator<Element> title = elements.select("strong.title").iterator();
			while(rank.hasNext()) {
				System.out.println(rank.next().text() + " " + title.next().text());
			}
		} catch(Exception e) {
			throw e;
		}
	}

}
