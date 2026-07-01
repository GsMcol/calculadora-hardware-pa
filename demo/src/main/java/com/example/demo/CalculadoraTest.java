package com.example.demo;
public class CalculadoraTest {

    public static void main(String[] args) {
        System.out.println("--- INICIANDO CICLO TDD ---");
        CalculadoraHardware calc = new CalculadoraHardware();
        
        // KATA 1: Prueba de GPU al límite
        System.out.println("Ejecutando testCuelloBotellaGPU...");
        String resultado1 = calc.evaluarRendimiento(30, 99);
        String esperado1 = "Rendimiento Optimo: GPU trabajando al maximo.";
        
        if (resultado1.equals(esperado1)) {
            System.out.println("✅ [VERDE] PASÓ: La GPU rinde correctamente.\n");
        } else {
            System.out.println("❌ [ROJO] FALLÓ: Se obtuvo '" + resultado1 + "'\n");
        }

        // KATA 2: Prueba de CPU limitante
        System.out.println("Ejecutando testCuelloBotellaCPU...");
        String resultado2 = calc.evaluarRendimiento(100, 50);
        String esperado2 = "Alerta de Cuello de Botella: CPU limitando a la tarjeta grafica.";
        
        if (resultado2.equals(esperado2)) {
            System.out.println("✅ [VERDE] PASÓ: El cuello de botella fue detectado.\n");
        } else {
            System.out.println("❌ [ROJO] FALLÓ: Se obtuvo '" + resultado2 + "'\n");
        }
        
        System.out.println("--- PRUEBAS FINALIZADAS ---");
    }
}