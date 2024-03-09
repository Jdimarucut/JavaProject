 import java.util.Scanner;
 public class CurrencyConverter {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 final double USD_TO_PHP = 43.33089;
 final double EURO_TO_USD = 0.734719;
 final double YUAN_TO_USD = 6.346934;
 final double KORUNA_TO_USD = 18.77263;
 final double KRONE_TO_USD = 5.449007;
 final double SHEQEL_TO_USD = 3.726334;
 final double DINAR_TO_USD = 0.274588;

 // Get amount in Philippine Pesos
 System.out.print("\nEnter Philippine peso: ");
 double philippinePeso = input.nextDouble();

 // Calculate conversions using fixed rates
 double usd = philippinePeso / USD_TO_PHP;
double euro = usd * EURO_TO_USD;
 double yuan = usd * YUAN_TO_USD;
 double koruna = usd * KORUNA_TO_USD;
 double krone = usd * KRONE_TO_USD;
 double sheqel = usd * SHEQEL_TO_USD;
 double dinar = usd * DINAR_TO_USD;

 // Display the results
 System.out.println("\nThe amount's equivalent to:");
 System.out.printf("US Dollar is: %.2f\n", usd);
 System.out.printf("Euro: %.2f\n", euro);
 System.out.printf("Yuan: %.2f\n", yuan);
 System.out.printf("Koruna: %.2f\n", koruna);
 System.out.printf("Krone: %.2f\n", krone);
 System.out.printf("Sheqel: %.2f\n", sheqel);
 System.out.printf("Dinar: %.2f\n", dinar);
 }
 }
