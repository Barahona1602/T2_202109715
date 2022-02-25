public class Datosuser {
    private String id;
    private String nombre;
    private String apellido;
    private String user;
    private String rol;
    private String contraseña;
    private String confirmarcc;
    
    public Datosuser(String id, String nombre, String apellido, String user, String rol, String contraseña, String confirmarcc){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.user = user;
        this.rol = rol;
        this.contraseña = contraseña;
        this.confirmarcc = confirmarcc;              
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the rol
     */
    public String getRol() {
        return rol;
    }

    /**
     * @param rol the rol to set
     */
    public void setRol(String rol) {
        this.rol = rol;
    }

    /**
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * @return the confirmarcc
     */
    public String getConfirmarcc() {
        return confirmarcc;
    }

    /**
     * @param confirmarcc the confirmarcc to set
     */
    public void setConfirmarcc(String confirmarcc) {
        this.confirmarcc = confirmarcc;
    }

    class Integer {

        public Integer() {
        }
    }
}
