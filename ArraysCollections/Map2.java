package ArraysCollections;

// Map representa uma coleção de pares chave-valor, onde cada chave é associada a um valor.

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map2 {
	
	public static void main(String[] args) {
		
		/* Principais Características da Interface Map:
		 * 
		 * 1 - Pares Chave-Valor: Os elementos em um Map são armazenados como pares chave-valor, onde cada chave é única e mapeada para um único valor.
		 * 
		 * 
		 * 2 - Sem Duplicatas de Chaves: Não pode haver duas chaves iguais em um Map.
		 * 	   Se você tentar adicionar um valor com uma chave que já existe, o valor associado à chave será substituído pelo novo valor.
		 * 
		 * 
		 * 3 - Permite Nulos: Tanto chaves quanto valores podem ser null.
		 * 	   No entanto, é importante notar que uma chave null só pode ocorrer uma vez em um Map, pois não pode haver duplicatas de chaves.
		 * 
		 */
	
		Map<Integer, String> usuarios = new HashMap<>();
		
		// put(K chave, V valor): Adiciona um par chave-valor ao mapa.
		
		usuarios.put(1, "Roberto");
		usuarios.put(1, "Renato");
		usuarios.put(20, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		System.out.println(usuarios.size() + "\n" );
		System.out.println(usuarios.isEmpty() + "\n");
		
		// keySet(): Retorna um conjunto contendo todas as chaves no mapa.
		
		System.out.println(usuarios.keySet() + "\n");
		
		// values(): Retorna uma coleção contendo todos os valores no mapa.
		
		System.out.println(usuarios.values() + "\n");
		
		// entrySet(): Retorna um conjunto contendo todos os pares chave-valor no mapa.
		
		System.out.println(usuarios.entrySet() + "\n");
		
		// containsKey(Object chave): Verifica se o mapa contém a chave especificada.
		
		System.out.println(usuarios.containsKey(20) + "\n");
		
		// containsValue(Object valor): Verifica se o mapa contém o valor especificado.
		
		System.out.println(usuarios.containsValue("Rebeca") + "\n");
		
		// get(Object chave): Retorna o valor associado à chave especificada.
		
		System.out.println(usuarios.get(4) + "\n");
		System.out.println(usuarios.remove(1) + "\n");
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave + "\n");
		}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor + "\n");
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() +  " → ");
			System.out.println(registro.getValue());
		}
		
	}

}
