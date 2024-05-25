public class ConcreteSecundario implements AbstractDepartamento{

    @Override
    public void DepaPrincipal() {
        System.out.println("Me comunicare con el Depa Secundario");
    }

    @Override
    public void DepaSecundario() {
        System.out.println("El Depa principal se comunicara conmigo");
    }
}
