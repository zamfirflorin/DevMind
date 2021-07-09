package com.florin.Curs13_Clase_si_obiecte.ex2;

public class TestareProfilUtilizator {

	public static void main(String[] args) {
		
		ProfilUtilizator florin = new ProfilUtilizator();
		ProfilUtilizator andrei = new ProfilUtilizator();

		florin.initializeazaProfil();
		florin.actualizareEmail("florin@devmind.com");
		florin.actualizareNumarTelefon("1823719");
		florin.afisareStareInterna();
		florin.afisareVarsta(2021);
		
		andrei.initializeazaProfil();
		andrei.actualizareEmail("andrei@devmind.com");
		andrei.actualizareNumarTelefon("13874923");
		andrei.afisareStareInterna();
		andrei.afisareVarsta(2021);
	}

}
