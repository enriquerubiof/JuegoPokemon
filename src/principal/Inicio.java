package principal;

import java.util.ArrayList;
import java.util.Scanner;

import funciones.Funciones;

public class Inicio
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		// TODO Auto-generated method stub
        String separador = "  ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  ";
        System.out.println(separador);
        System.out.println("    Bienvenido al mundo pokemon.");
        sc.nextLine();
        System.out.println(separador);
        System.out.println("    Por favor, responde a las siguientes preguntas.");
        System.out.println(separador);
        ArrayList<ArrayList> basicsData = Funciones.createBasicsData();
	}
}