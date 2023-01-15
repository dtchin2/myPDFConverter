package com.dtchin2.pdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreatePDFFile {

    private String fileName = "test.pdf";

    public Document createPDFDocument(){
        Document newpdfDoc = new Document();

        try {
            // create a pdf document
            PdfWriter.getInstance(newpdfDoc, new FileOutputStream(new File(fileName)));
            newpdfDoc.open();

            // now write to the document
            Paragraph p = new Paragraph();
            p.setAlignment(Element.ALIGN_CENTER);
            p.add("Paragraph Text from David");

            newpdfDoc.add(p);

            System.out.println("Done");

        }catch(DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            newpdfDoc.close();
        }

        return newpdfDoc;
    }
}
