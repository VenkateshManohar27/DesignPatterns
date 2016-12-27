package com.vm.abstractfactory;

public interface XMLParserFactory {
	public XMLParser getXMLParser(XMLType type);
}
