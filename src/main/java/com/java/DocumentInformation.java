package com.java;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.apache.pdfbox.pdmodel.PDPage;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DocumentInformation {
    public static void main(String[] args) throws IOException {
        PDDocument document=new PDDocument();
        document.addPage(new PDPage());
        PDDocumentInformation information=document.getDocumentInformation();
        information.setAuthor("Sarita");
        information.setSubject("pdfBox");
        information.setTitle("title");
        Calendar calendar=new GregorianCalendar();
        information.setCreationDate(calendar);
        information.setKeywords("sample, first example, my pdf");
        document.save("C:\\Users\\SourabhaPatra\\Documents\\root\\code\\document\\pdf_doc_three.pdf");
        System.out.println("file saved");
    }
}
