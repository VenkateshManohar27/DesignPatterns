package com.vm.abstractfactory;

public class NYXMLParserFactory implements XMLParserFactory {

	public NYXMLParserFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public XMLParser getXMLParser(XMLType type) {
		switch(type){
			case ORDER: return new NYXMLOrderParser();
			case FEEDBACK: return new NYXMLFeedbackParser();
			case ERROR: return new NYXMLErrorParser();
		}
		
		return null;
	}

}
