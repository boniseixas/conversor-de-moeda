package br.com.seso.conversorDeTemperatura;

import javax.swing.JOptionPane;

public class ConverteTemperatura {
   
   public double converterCelsiusParaKelvin(double temperaturaAConverter) {
      double celsiusParaKelvin = temperaturaAConverter + 273.15;
      celsiusParaKelvin = (double) Math.round(celsiusParaKelvin * 100d) / 100;
      JOptionPane.showMessageDialog(null, temperaturaAConverter + " Graus Celsius são " + celsiusParaKelvin + " em Kelvin");
      return celsiusParaKelvin;
  }

   public double converterCelsiusParaFahrenheit(double temperaturaAConverter) {
      double celsiusParaFahrenheit = temperaturaAConverter * 1.8 + 32;
      celsiusParaFahrenheit = (double) Math.round(celsiusParaFahrenheit * 100d) / 100;
      JOptionPane.showMessageDialog(null, temperaturaAConverter + " Graus Celsius são " + celsiusParaFahrenheit + " Graus Fahrenheit");
      return celsiusParaFahrenheit;
  }

  public double converterFahrenheitParaCelsius(double temperaturaAConverter) {
      double fahrenheitParaCelsius = (temperaturaAConverter - 32) / 1.8;
      fahrenheitParaCelsius = (double) Math.round(fahrenheitParaCelsius * 100d) / 100;
      JOptionPane.showMessageDialog(null, temperaturaAConverter + " Graus Fahrenheit são " + fahrenheitParaCelsius + " Graus Celsius");
      return fahrenheitParaCelsius;
  }

  public double converterKelvinParaFahrenheit(double temperaturaAConverter) {
   double kelvinParaFahrenheit = (temperaturaAConverter - 273.15) * 9 / 5 + 32;
   kelvinParaFahrenheit = (double) Math.round(kelvinParaFahrenheit * 100d) / 100;
   JOptionPane.showMessageDialog(null, temperaturaAConverter + " Kelvin são " + kelvinParaFahrenheit + " Graus Fahrenheit");
   return kelvinParaFahrenheit;
}

  public double converterKelvinParaCelsius(double temperaturaAConverter) {
      double kelvinParaCelcius = temperaturaAConverter - 273.15;
      kelvinParaCelcius = (double) Math.round(kelvinParaCelcius * 100d) / 100;
      JOptionPane.showMessageDialog(null, temperaturaAConverter + " Kelvin são " + kelvinParaCelcius + " Graus Celsius");
      return kelvinParaCelcius;
  }
}
