package com.java;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

import java.io.File;
import java.io.IOException;

public class UploadPdf {
    public static void main(String[] args) throws IOException {
        File file=new File("C:/Users/SourabhaPatra/Documents/root/code/document/my_doc.pdf");
        System.out.println(file.getName());
        PDDocument document=PDDocument.load(file);
        System.out.println("file is loaded");
        document.addPage(new PDPage());

        System.out.println("file saved");
        int pageSize=document.getNumberOfPages();
        System.out.println("page size is: "+pageSize);
        document.removePage(4);
        System.out.println("removing page 2: ");
        System.out.println("page size is :"+document.getNumberOfPages());
        document.save("C:\\Users\\SourabhaPatra\\Documents\\root\\code\\document\\pdf_doc_two.pdf");
        document.close();
    }
}
