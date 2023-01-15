package com.dtchin2;

import com.dtchin2.pdf.CreatePDFFile;
import com.dtchin2.pdf.ReadPDFFile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CreatePDFFile c = new CreatePDFFile();
        c.createPDFDocument();

        // Read the PDF File Next
        ReadPDFFile readPDFFile = new ReadPDFFile();
        System.out.println(readPDFFile.getPDFFileText());
    }
}
