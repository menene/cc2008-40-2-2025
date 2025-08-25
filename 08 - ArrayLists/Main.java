import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        // ArrayList<String> frutas = new ArrayList<>();
        // String[] frutasArr = new String[10];

        // frutasArr[0] = "Uva";
        // frutasArr[1] = "Melon";
        // frutasArr[2] = "Sandía";
        
        // frutas.add("Manzana");
        // frutas.add("Pera");
        // frutas.add(0, "Sandía");

        // boolean frutasArrayFound = false;
        // for (int i = 0; i < frutasArr.length; i++) {
        //     if (frutasArr[i] == "Sandía") {
        //         frutasArrayFound = true;
        //     }
        // }

        // if (frutasArrayFound) {
        //     System.out.println("LA SANDIA EXISTE EN EL ARRAY");
        // } else {
        //     System.out.println("LA SANDIA NO EXISTE EN EL ARRAY :(");
        // }

        // frutas.remove(0);
        // frutas.remove("Pera");
        // frutas.remove("P");
        
        // System.out.println(frutas.get(0));
        // System.out.println(frutas.get(1));

        // if (frutas.contains("Sandía")) {
        //     System.out.println("LA SANDIA EXISTE EN EL ARRAY LIST");
        // } else {
        //     System.out.println("LA SANDIA NO EXISTE EN EL ARRAY LIST :(");
        // }

        // for (int i = 0; i < frutas.size(); i++) {
        //     System.out.println(frutas.get(i));
        // }

        // for (int i = 0; i < frutasArr.length; i++) {
        //     if (frutasArr[i] != null) {
        //         System.out.println(frutasArr[i]);
        //     }
        // }


        ArrayList<Persona> personas = new ArrayList<>();

        Persona erick = new Persona("Erick");

        personas.add(erick);
        personas.add(new Persona("Ana"));
        personas.add(new Persona("Pedro"));
        personas.add(new Persona("Luisa"));

        System.out.println(personas);

        if (personas.contains(erick)) {
            System.out.println("Erick existe en la lista");
        } else {
            System.out.println("Erick NO existe en la lista :(");
        }

        Persona ana = personas.get(1);

        String nombre = personas.get(1).getNombre();

        System.out.println(ana);
        
        System.out.println(nombre);
    }
}