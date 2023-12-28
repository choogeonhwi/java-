package com.lgy.test;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class test {
	public static void main(String[] args) {
		try {
			// html객체
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			// xml 해석 객체
			DocumentBuilder parser = dbf.newDocumentBuilder();

			Document xmlDoc = null;
			String url = "xml\\book.xml"; // xml 파일 경로
			xmlDoc = parser.parse(url);

			Element root = xmlDoc.getDocumentElement(); // index에 접근(요소)

			Node bookNode = root.getElementsByTagName("book").item(0); // 하위 index 접근 후 첫 index 선택
			Node authorNode = ((Element)bookNode).getElementsByTagName("author").item(0);
			String author = authorNode.getTextContent(); //index의 값 
			int length = root.getElementsByTagName("book").getLength(); // book 요소의 전체 크기
			
			for (int i = 0; i < length; i++) {
				Node bookNode2 =  root.getElementsByTagName("book").item(i);
				String kind = ((Element)bookNode2).getAttribute("kind");
				System.out.println("@# kind ===>"+kind);
				Node tNode = ((Element)bookNode2).getElementsByTagName("title").item(0);
				System.out.println("@# tNode getTagName ===>"+((Element)bookNode2).getTagName());
				System.out.println("@# tNode getTextContent ===>"+((Element)bookNode2).getTextContent());
				
				Node aNode = ((Element)bookNode2).getElementsByTagName("author").item(0);
				System.out.println("@# aNode getTagName ===>"+((Element)aNode).getTagName());
				System.out.println("@# aNode getTextContent ===>"+((Element)aNode).getTextContent());
				
				Node pNode = ((Element)bookNode2).getElementsByTagName("price").item(0);
				System.out.println("@# pNode getTagName ===>"+((Element)pNode).getTagName());
				System.out.println("@# pNode getTextContent ===>"+((Element)pNode).getTextContent());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
