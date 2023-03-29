package xml;

import java.io.File;

//
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLParser {

	// Get the Document Builder
	// Get Document.
	// Normalize the xml structure
	// Get all the element by the products.

	public static void main(String[] args) {

		// Creating the document builder.

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();

			// Get Document.
			Document document = builder.parse(new File("laptops.xml"));

			// Normalizind the xml structure.
			document.getDocumentElement().normalize();

			// Get all the element by the tag name
			NodeList laptopList = document.getElementsByTagName("laptop");

			for (int i = 0; i < laptopList.getLength(); i++) {
				// item() returns the collection of list.
				Node laptop = laptopList.item(i);
				if (laptop.getNodeType() == Node.ELEMENT_NODE) {
					Element laptopElement = (Element) laptop;
					System.out.println("Laptop Name : " + laptopElement.getAttribute("name"));
					// to get the child nodes as well.
					NodeList laptopDetails = laptop.getChildNodes();
					for (int j = 0; j < laptopDetails.getLength(); j++) {
						Node detail = laptopDetails.item(j);

						if (detail.getNodeType() == Node.ELEMENT_NODE) {
							Element detailElement = (Element) detail;
							System.out.println("	" + detailElement.getTagName() + ":"
									+ detailElement.getAttribute("value"));
						}
					}
				}
			}

		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
