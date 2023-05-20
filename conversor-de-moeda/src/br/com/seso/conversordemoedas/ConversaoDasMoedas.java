package br.com.seso.conversordemoedas;

import javax.swing.JOptionPane;

public class ConversaoDasMoedas {

   Converte moedas = new Converte();
   ConverteMoedaParaReal reais = new ConverteMoedaParaReal();

   public void converterMoeda(double valorAConverter) {
       String opcao = (JOptionPane.showInputDialog(null,
               "Escolha para que tipo de moeda deseja transformar seu dinheiro ", "Moedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Reais para Dólares", "De Reais para Euros", "De Reais para Libras", "De Reais para Peso Argentino", "De Reais para Peso Chileno", "De Dólares paraa Reais", "De Euros para Reais", "De Libras para Reais", "De Peso Argentino para Reais", "De Peso Chileno para Reais"}, "Opção")).toString();

       switch (opcao) {
           case "De Reais para Dólares":
               moedas.converterRealEmDolar(valorAConverter);
               break;
           case "De Reais para Euros":
               moedas.converterRealEmEuros(valorAConverter);
               break;
           case "De Reais para Libras":
               moedas.converterRealEmLibras(valorAConverter);
               break;
           case "De Reais para Peso Argentino":
               moedas.converterRealEmPesoArgentino(valorAConverter);
               break;
           case "De Reais para Peso Chileno":
               moedas.converterRealEmPesoChileno(valorAConverter);
               break;
           case "De Dólares para Reais":
               reais.converterDolarEmReal(valorAConverter);
               break;
           case "De Euros para Reais":
               reais.converterEuroEmReal(valorAConverter);
               break;
           case "De Libras para Reais":
               reais.converterLibrasEmReal(valorAConverter);
               break;
           case "De Peso Argentino para Reais":
               reais.converterPesoArgentinoEmReal(valorAConverter);
               break;
           case "De Peso Chileno para Reais":
               reais.converterPesoChilenoEmReal(valorAConverter);
               break;
       }
   }
   
}
