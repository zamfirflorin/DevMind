package com.florin.ifuri;

import java.util.Scanner;

/**
 * @author fszamfi
 *3. Realizeaza un modul simplu pentru un bancomat, care sa asiste utilizatorul in efectuarea unei operatiuni de eliberare numerar. Se vor implementa urmatoarele etape:

Verificarea codului PIN: Se citeste 1 numar de la tastatura reprezentand pinClient - codul PIN introdus de client si se compara cu un numar stocat intern (i.e. intr-o variabila) 
de aplicatie pinCorect - codul PIN real al cardului. In cazul in care cele doua numere coincid, se va afisa mesajul PIN corect si se va trece la etapa urmatoare. 
Altfel, bancomatul va afisa mesajul PIN gresit si se va termina.
Verificarea sumei cerute: In cazul in care PIN-ul introdus este corect, se va trece la etapa urmatoare. In cadrul acesteia, se citeste de la tastatura 1 numar intreg, suma, 
ce reprezinta suma pe care clientul doreste sa o scoata de la bancomat. In cadrul algoritmului trebuie sa existe si soldCont, ce reprezinta suma totala pe care clientul o are in cont.
 Aceasta poate fi stocata intern (i.e. intr-o variabila). Programul va afisa mesajul Tranzactie in curs de procesare daca suma dorita nu depaseste fondurile si apoi se trece la pasul urmator. 
 In caz contrar, programul va afisa mesajul „Fonduri insuficiente pentru realizarea tranzactiei“ si apoi se va termina.
Afisarea sumei ramase: Daca operatiunea s-a realizat cu succes, utilizatorul este intrebat daca doreste afisarea sumei de bani ramase in cont: „Doriti afisarea noii balante a contului curent? 
Raspundeti cu 0 (NU) sau 1 (DA).“ In caz afirmativ, se va afisa un mesaj relevant cu noua valoare. Altfel, programul va afisa un mesaj de ramas bun (ex: Multumim pentru ca ati ales Banca DevBank) 
si se va termina.
 */
public class Exercitiu3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		int pinClient = sc.nextInt();
		int pinCorect = 1234;
		int soldCont = 10000;
		
		boolean pinCheckOk = pinClient == pinCorect;
		
		if(pinCheckOk){
			System.out.println("PIN corect");
			
			System.out.println("Introduceti suma pe care doriti sa o retrageti: ");
			int sumaRetrasa = sc.nextInt();
			
			if(sumaRetrasa <= soldCont){
				System.out.println("Tranzactie in curs de procesare...");
				soldCont -= sumaRetrasa;
				System.out.println("Doriti afisarea noii balante a contului curent? Raspundeti cu 0 (NU) sau 1 (DA).");
				String raspuns = sc.next();
				if(raspuns.equalsIgnoreCase("DA")){
					System.out.println("Soldul curent este : " + soldCont);
				} else {
					System.out.println("Multumim pentru ca ati ales Banca DevBank");
				}
			} else {
				System.out.println("Fonduri insuficiente pentru realizarea tranzactiei");
			}
			
		} else {
			System.out.println("PIN gresit");
		}
		
	}

}
