package com.vm.abstractfactory;

public class TWXMLPaserFactory implements XMLParserFactory{

	public TWXMLPaserFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public XMLParser getXMLParser(XMLType type) {
		
		switch(type){
			case ORDER: return new TWXMLOrderParser();
			case FEEDBACK: return new TWXMLFeedbackParser();
			case ERROR: return new TWXMLErrorParser();
		}
		
		return null;
	}

}
