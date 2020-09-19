package com.java;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

import java.io.IOException;

public class AddPage {
    public static void main(String[] args) throws IOException {
        PDDocument document=new PDDocument();
        for (int i=0;i<10;i++){
            PDPage page=new PDPage();
            document.addPage(page);
            System.out.println("adding pages :"+i);
        }
        document.save("C:/Users/SourabhaPatra/Documents/root/code/document/my_doc.pdf");
        System.out.println("pages created");
        document.close();
    }
}
