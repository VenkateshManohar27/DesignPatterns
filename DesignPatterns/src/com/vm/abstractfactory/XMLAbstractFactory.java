package com.vm.abstractfactory;

public final class XMLAbstractFactory {

	private XMLAbstractFactory() {
		throw new AssertionError();
	}

	public static XMLParserFactory getXmlParserFactory(String type) {

		switch (type) {
			case "NYXML":
				return new NYXMLParserFactory();
			case "TWXML":
				return new TWXMLPaserFactory();
		}
		return null;
	}

}
