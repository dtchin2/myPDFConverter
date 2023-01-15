package com.dtchin2.pdf;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

import java.io.IOException;

public class ReadPDFFile {

    private String fileName = "test.pdf";

    public String getPDFFileText(){
        return readPDFFile().toString();
    }

    private StringBuilder readPDFFile(){
        StringBuilder pdfText = new StringBuilder();
        PdfReader pdfReader = null;

        try {
            pdfReader = new PdfReader(fileName);

            // get text from page 1
            String text = PdfTextExtractor.getTextFromPage(pdfReader,1);

            pdfText.append(text);

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            pdfReader.close();
        }
        return pdfText;
    }
}
