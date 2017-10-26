package aps02;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeituraArquivoTextoJava {

	private static Scanner reader;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
File arquivoCSV = new File("participantes.csv"); // Caminho do arquivo
		
		try	{
			
			String lineArquivo = new String();//Guarda linha do arquivo
			reader = new Scanner(arquivoCSV);
			
			//hasNext percorre todo arquivo
			while(reader.hasNext())
			{
				lineArquivo = reader.nextLine(); // armazena na variavel lineArquivo	
				System.out.println(lineArquivo); // mostra arquivos
			}
		
		}catch (FileNotFoundException e) {
			// TODO: handle exception
		

	}

}
}
