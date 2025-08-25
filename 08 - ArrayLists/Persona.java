class Persona {
    private String nombre;
 
    public Persona(String n) { 
        this.nombre = n; 
    }
    
    public String getNombre() { 
        return nombre; 
    }
    
    @Override 
    public String toString() { 
        return nombre; 
    }
}