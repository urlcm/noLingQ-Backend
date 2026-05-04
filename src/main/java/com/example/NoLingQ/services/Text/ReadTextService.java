package com.example.NoLingQ.services.Text;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.io.RandomAccessReadBufferedFile;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ReadTextService implements IReadTextService {

    @Override
    public String ExtractText(String path) {
        try (PDDocument document = Loader.loadPDF(new RandomAccessReadBufferedFile(path))){
            PDFTextStripper stripper = new PDFTextStripper();
            stripper.setStartPage(5);
            stripper.setEndPage(6);
            String partialText = stripper.getText(document);
            return partialText;
        } catch (IOException e) {
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Se presento el siguiente error: "+e);
        }
        return null;
    }
}
