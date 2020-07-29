package practice.java.practice;

import com.sun.xml.bind.marshaller.CharacterEscapeHandler;

import java.io.IOException;
import java.io.Writer;

public class NoEscapeHandler implements CharacterEscapeHandler {
    @Override
    public void escape(char[] chars, int i, int i1, boolean b, Writer writer) throws IOException {
	writer.write(chars, i, i1);
    }
}
