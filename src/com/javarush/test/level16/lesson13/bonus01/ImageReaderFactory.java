package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by SERGE on 30.06.2014.
 */
public class ImageReaderFactory {
    public static ImageReader getReader(ImageTypes type) throws IllegalArgumentException{
        if(type == null){
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }

        switch (type){
            case BMP:
                return new BmpReader();
            case PNG:
                return new PngReader();
            case JPG:
                return new JpgReader();
            default:
                throw new IllegalArgumentException("Неизвестный тип картинки");
        }
    }
}
