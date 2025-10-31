public class Persona
{
    private int edad;

    public void setEdad(String edad) throws EdadInvalidaException
    {
        int entero = -1;

        try {
            entero = Integer.parseInt(edad);
        } catch(Exception e) {
            throw new EdadInvalidaException("Valor de edad no numérico");
        }

        if (entero < 0) {
            throw new EdadInvalidaException("La edad no puede ser negativa");
        }

        if (entero > 135) {
            throw new EdadInvalidaException("La edad no puede sobrepasar los 135 años");
        }

        this.edad = entero;
    }
}