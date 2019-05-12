package pe.cibertec.t5am_clase06b.modelo;

public class Empleado {

    private String nombreEmpleado;
    private String cargoEmpleado;
    private String direccionEmpleado;
    private String celularEmpleado;

    public Empleado(String nombreEmpleado, String cargoEmpleado, String direccionEmpleado, String celularEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.cargoEmpleado = cargoEmpleado;
        this.direccionEmpleado = direccionEmpleado;
        this.celularEmpleado = celularEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCargoEmpleado() {
        return cargoEmpleado;
    }

    public void setCargoEmpleado(String cargoEmpleado) {
        this.cargoEmpleado = cargoEmpleado;
    }

    public String getDireccionEmpleado() {
        return direccionEmpleado;
    }

    public void setDireccionEmpleado(String direccionEmpleado) {
        this.direccionEmpleado = direccionEmpleado;
    }

    public String getCelularEmpleado() {
        return celularEmpleado;
    }

    public void setCelularEmpleado(String celularEmpleado) {
        this.celularEmpleado = celularEmpleado;
    }
}
