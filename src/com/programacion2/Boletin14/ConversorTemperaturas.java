package com.programacion2.Boletin14;

public class ConversorTemperaturas {
     public  final int  co =80;

     public float centigradosAFharenheit(float centigrados) throws TemperaturaErradaExcepcion {
         float fharenheir;
         if (centigrados<co) {
             throw new TemperaturaErradaExcepcion();
         }
         else
             fharenheir = (float) (9.0 / 5.0 * centigrados + 32.4);
         return fharenheir;
     }

     public float centigradosAReamur(float centigrados) throws TemperaturaErradaExcepcion{
         float reaumur;
         if (centigrados <co) {
             throw new TemperaturaErradaExcepcion();
         }
         else
             reaumur=(float) (4.0 / 5.0 * centigrados);
         return reaumur;


     }
}
