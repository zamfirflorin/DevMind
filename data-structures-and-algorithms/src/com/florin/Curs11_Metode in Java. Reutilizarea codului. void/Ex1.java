

/**
 * @author fszamfi
 *1. (Ex. 4.x. - Numere prime, divizori, descompunere) Scrie un algoritm care citeste de la tastatura un numar n si afiseaza toate numerele prime pana la n (inclusiv), incepand cu 2. Modularizeaza implementarea algoritmului folosind doua metode:

una care indica daca un numar este prim sau nu
Hint: returneaza true daca numarul este prim si false altfel
alta care afiseaza toate numerele prime pana la n (primit ca argument la apel)
Hint: metoda va apela functia definita anterior
 */
public class Ex1 {

	public static void main(String[] args) {
	
		showPrimeNumbers(22);
		
	}
	
	public static void showPrimeNumbers(int n) {

		for (int i = 1; i <= n; i ++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static boolean isPrime(int n) {
		
		if (n == 1) {
			return true;
		} 
		
		if (n == 2) {
			return true;
		}
		
		for (int i = 2; i <= n; i++) {
			
			if (n % i == 0) {
				return false;
			} else {
				return true;
			}
		}
		return false;
	}

}
