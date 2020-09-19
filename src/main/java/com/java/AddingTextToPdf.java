package com.java;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.File;
import java.io.IOException;

public class AddingTextToPdf {
    public static void main(String[] args) throws IOException {
        PDDocument document = PDDocument.load(new File("C:\\Users\\SourabhaPatra\\Documents\\root\\code\\document\\my_doc.pdf"));
        PDPage page =document.getPage(1);
        PDPageContentStream stream = new PDPageContentStream(document, page);

        stream.beginText();

        stream.setFont(PDType1Font.TIMES_ROMAN, 12);
        //Setting the position for the line
        stream.newLineAtOffset(25, 500);
        String text = "i am Sarita Panda";
        stream.showText(text);

        stream.endText();
        stream.close();
        document.save(new File("C:\\Users\\SourabhaPatra\\Documents\\root\\code\\document\\my_doc_four.pdf"));
        System.out.println("file saved");
        document.close();

    }
}
