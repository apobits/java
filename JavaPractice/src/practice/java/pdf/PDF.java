/**
 * 
 */
package practice.java.pdf;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

/**
 * @author apobits@gmail.com
 *
 */
public class PDF {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		StringBuilder sb = new StringBuilder("where x = y and ");
		System.out.println(sb.substring(0, sb.length() - 5));

		PDDocument document = new PDDocument();
		PDPage page = new PDPage();
		document.addPage(page);

		PDFont font = PDType1Font.HELVETICA_OBLIQUE;
		PDImageXObject image = PDImageXObject
				.createFromFile("C:/Users/Administrador/Desktop/tigo-logo-F189442F6A-seeklogo.com.png", document);

		PDPageContentStream pageContentStream = new PDPageContentStream(document, page);
		pageContentStream.setFont(font, 11);
		pageContentStream.beginText();
		pageContentStream.newLineAtOffset(50, 600);
		pageContentStream.showText("Testing pdf creation");
		pageContentStream.newLineAtOffset(20, 600);
		pageContentStream.showText("Testing pdf creation");
		pageContentStream.endText();
		pageContentStream.drawImage(image, 470, 700, 100, 70);
		pageContentStream.close();
		document.save(new File("C:\\Users\\Administrador\\Desktop\\PDFExample.pdf"));
		document.close();

	}

}
