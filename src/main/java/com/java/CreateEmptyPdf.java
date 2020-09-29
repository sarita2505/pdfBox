package com.java;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.encryption.AccessPermission;
import org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy;

import java.io.IOException;

public class CreateEmptyPdf {
    public static void main(String[] args) {
        PDDocument document=new PDDocument();
        try {

           for (int i=0;i<10;i++){
               PDPage page=new PDPage();
               document.addPage(page);
           }

            AccessPermission ap = new AccessPermission();
            StandardProtectionPolicy spp = new StandardProtectionPolicy("1234", "1234", ap);
            spp.setEncryptionKeyLength(128);
            spp.setPermissions(ap);
            document.protect(spp);
            System.out.println("document protected");

            document.save("C:/Users/SourabhaPatra/Documents/root/code/document/my_doc_four.pdf");
            System.out.println("pdf created");
            document.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
