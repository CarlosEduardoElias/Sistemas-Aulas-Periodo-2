package exemploarquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivoTexto {
	public static void main(String[] args) {
		ManipularArquivo arquivo = new ManipularArquivo();
		arquivo.gravarArquivo();
		
		arquivo.gravarArquivo();
	}

}
