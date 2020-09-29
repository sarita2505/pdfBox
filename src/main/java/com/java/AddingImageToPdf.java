package com.java;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

import java.io.File;
import java.io.IOException;

public class AddingImageToPdf {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\SourabhaPatra\\Documents\\root\\code\\document\\pdf_doc_three.pdf");
        PDDocument document = PDDocument.load(file);
        PDPage page=document.getPage(0);
        PDImageXObject imageXObject=PDImageXObject.createFromFile("C:\\Users\\SourabhaPatra\\Downloads\\image001.png",document);
        PDPageContentStream contents = new PDPageContentStream(document, page);
        contents.drawImage(imageXObject,70,250);
        System.out.println("image inserted");
        contents.close();
        document.save("C:\\Users\\SourabhaPatra\\Documents\\root\\code\\document\\pdf_doc_three.pdf");
        document.close();


    }
}
