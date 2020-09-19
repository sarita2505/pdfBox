package com.java;

import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.IOException;

public class CreateEmptyPdf {
    public static void main(String[] args) {
        PDDocument document=new PDDocument();
        try {
            document.save("C:/Users/SourabhaPatra/Documents/root/code/document/my_doc.pdf");
            System.out.println("pdf created");
            document.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
