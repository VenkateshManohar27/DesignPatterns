package com.vm.abstractfactory;

public class AbstractFactoryTest {

	public AbstractFactoryTest() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		XMLParserFactory parserFactory = XMLAbstractFactory.getXmlParserFactory("NYXML");
		XMLParser parser = parserFactory.getXMLParser(XMLType.ERROR);
		String msg="";
		parser.parse(msg);
		
		parser = parserFactory.getXMLParser(XMLType.FEEDBACK);
		parser.parse(msg);
		
		parser = parserFactory.getXMLParser(XMLType.ORDER);
		parser.parse(msg);
		
		System.out.println("************************************");

		parserFactory = XMLAbstractFactory.getXmlParserFactory("TWXML");
		parser = parserFactory.getXMLParser(XMLType.ERROR);
		
		parser.parse(msg);
		
		parser = parserFactory.getXMLParser(XMLType.FEEDBACK);
		parser.parse(msg);
		
		parser = parserFactory.getXMLParser(XMLType.ORDER);
		parser.parse(msg);
	}
}
