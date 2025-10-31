import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

        Estudiante e1 = new Estudiante("Erick", "Compu", 123);
        e1.addNota("Ejercicio 1", 100);
        e1.addNota("Ejercicio 2", 100);
        e1.addNota("Lab 1", 100);

        Estudiante e2 = new Estudiante("Ana", "Compu", 567);
        e2.addNota("Ejercicio 1", 100);
        e2.addNota("Ejercicio 2", 95);
        e2.addNota("Lab 1", 90);

        Estudiante e3 = new Estudiante("Pedro", "Compu", 908);
        e3.addNota("Ejercicio 1", 0);
        e3.addNota("Ejercicio 2", 10);
        e3.addNota("Lab 1", 0);

        estudiantes.add(e1);
        estudiantes.add(e2);
        estudiantes.add(e3);

        Collections.sort(estudiantes);

        for (Estudiante e: estudiantes) {
            System.out.println(e);
        }
    }
}