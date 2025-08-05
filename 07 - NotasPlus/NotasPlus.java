import java.util.Random;

public class NotasPlus 
{
    private Estudiante[] estudiantes;
    private Curso[] cursos;
    private int[][] calificaciones; // [estudiante][curso]

    public NotasPlus()
    {
        Random rand = new Random();

        this.cursos = new Curso[3];
        this.cursos[0] = new Curso("Matemática", "MAT101");
        this.cursos[1] = new Curso("Física", "FIS102");
        this.cursos[2] = new Curso("Programación", "CC2008");

        this.estudiantes = new Estudiante[5];
        this.estudiantes[0] = new Estudiante("Ana López", "2023001", "Ing. Comput");
        this.estudiantes[1] = new Estudiante("Luis Gómez", "2023002", "Ing. Electrónica");
        this.estudiantes[2] = new Estudiante("María Ruiz", "2023003", "Ing. Mecánica");
        this.estudiantes[3] = new Estudiante("Carlos Díaz", "2023004", "Ing. Compu");
        this.estudiantes[4] = new Estudiante("Sofía Pérez", "2023005", "Ing. Compu");

        this.calificaciones = new int[this.estudiantes.length][this.cursos.length];

        for (int i = 0; i < this.estudiantes.length; i++) {
            for (int j = 0; j < this.cursos.length; j++) {
                calificaciones[i][j] = rand.nextInt(0, 101);
            }
        }
    }

    public void iniciar()
    {
        System.out.println("\n=== NOTAS PLUS ===\n");

        System.out.println("Estudiantes: \n");
        for (Estudiante e : this.estudiantes) {
            System.out.println(e.getCarnet() + " - " + e.getNombre() + " de " + e.getCarrera());
        }

        System.out.println("\nCursos: \n");
        for (Curso c : this.cursos) {
            System.out.println(c.getCodigo() + " - " + c.getNombre());
        }

        System.out.println("\nNotas: \n");

        for (int i = 0; i < this.estudiantes.length; i++) {
            System.out.println("Estudiante " + this.estudiantes[i].getNombre() + ":");
            for (int j = 0; j < this.cursos.length; j++) {
                System.out.print(this.calificaciones[i][j] + ", ");
            }
            
            System.out.println("\n");
        }
    }

    public double calcularPromedioGeneral() 
    {
        return 0;
    }

    public double calcularPromedioEstudiante(int indiceEstudiante) 
    {
        return 0;
    }

    public double calcularPromedioCurso(int indiceCurso) 
    {
        return 0;
    }
}
