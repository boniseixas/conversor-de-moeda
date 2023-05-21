package br.com.seso.conversordemoedas;

import javax.swing.JOptionPane;

public class Converte {

   public void converterRealEmDolar(double valorAConverter) {
      double dolar = valorAConverter / 4.93;
      dolar = (double) Math.round(dolar * 100d) / 100;
      JOptionPane.showMessageDialog(null, "O valor em Dolares é $ " + dolar);
   }

   public void converterRealEmEuros(double valorAConverter) {
      double euro = valorAConverter / 5.34;
      euro = (double) Math.round(euro * 100d) / 100;
      JOptionPane.showMessageDialog(null, "O valor em euros é EUR " + euro);
   }

   public void converterRealEmLibras(double valorAConverter) {
      double Libras = valorAConverter / 6.16;
      Libras = (double) Math.round(Libras * 100d) / 100;
      JOptionPane.showMessageDialog(null, "O valor em Libras é GBP " + Libras);
   }

   public void converterRealEmPesoArgentino(double valorAConverter) {
      double pesoArgentino = valorAConverter / 0.021;
      pesoArgentino = (double) Math.round(pesoArgentino * 100d) / 100;
      JOptionPane.showMessageDialog(null, "O valor em Peso Argentino é " + pesoArgentino);
   }

   public void converterRealEmPesoChileno(double valorAConverter) {
      double pesoChileno = valorAConverter / 0.0062;
      pesoChileno = (double) Math.round(pesoChileno * 100d) / 100;
      JOptionPane.showMessageDialog(null, "O valor em Peso Chileno é " + pesoChileno);
   }

}
