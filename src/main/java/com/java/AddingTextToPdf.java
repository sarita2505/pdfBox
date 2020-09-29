package com.java;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

public class AddingTextToPdf {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\SourabhaPatra\\Documents\\root\\code\\document\\pdf_doc_two.pdf");
        PDDocument document = PDDocument.load(file);

        //Retrieving the pages of the document
        PDPage page=document.getPage(5);
        PDPageContentStream contentStream = new PDPageContentStream(document, page);

        //Begin the Content stream
        contentStream.beginText();

        //Setting the font to the Content stream
        contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);

        contentStream.setLeading(14.5f);

        //Setting the position for the line
        contentStream.newLineAtOffset(10, 500);

        String text = "This is the sample document and we are adding content to it." +
                "There is no more content should be displayed as part of this line";
        String text2 = "as we want like this using the ShowText()  method of the " +
                "ContentStream class";

        //Adding text in the form of string
        contentStream.showText(text);
        contentStream.newLine();
        contentStream.showText(text2);

        //Ending the content stream
        contentStream.endText();

        System.out.println("Content added");

        //Closing the content stream
        contentStream.close();

        //Saving the document
        document.save(new File("C:\\Users\\SourabhaPatra\\Documents\\root\\code\\document\\my_doc_four.pdf"));
        PDFTextStripper stripper=new PDFTextStripper();
        String text1=stripper.getText(document);
        System.out.println(text1);

        //Closing the document
        document.close();
    }

}

