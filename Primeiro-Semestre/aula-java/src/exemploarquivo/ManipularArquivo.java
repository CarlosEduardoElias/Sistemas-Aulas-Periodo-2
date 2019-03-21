package exemploarquivo;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FilterReader;
import java.io.IOException;

public class ManipularArquivo {
	public void gravarArquivo() {
		FileWriter writer;
		try {
			writer = new FileWriter("MeuTxt.txt", true);
			BufferedWriter buffer = new BufferedWriter(writer);
			
			buffer.write("Lula Condenado");
			buffer.newLine();
			buffer.write("Brasil Libertado");
			buffer.newLine();
			
			buffer.close();
			System.out.println("Arquivo escrito com Sucesso!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void lerArquivo() throws IOException{
		FileReader reader = null;
		try {
				reader = new FileReader("MeuTxt.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BufferedReader breader = new BufferedReader(reader);
		String linha;
		
		while((linha = breader.readLine()) != null){
				System.out.ptintln(linha);
		}
		reader.close();
	}
}
