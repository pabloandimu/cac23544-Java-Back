package ar.com.codoacodo.entity;

import java.time.LocalDate;

public class MainOrador {

	public static void main(String[] args) {
		//crear un objeto de la Clase Orador, que luego se enviara a la db
		Orador nuevoOrador = new Orador("carlos", "lopez", "email@email.com", "Java", LocalDate.now());
		//comentario nuevo no agregado
		System.out.println(nuevoOrador);
		
	}

}
