public class CEO implements AbstractDepartamento{

    @Override
    public void DepaPrincipal() {
        System.out.println("Solo yo puedo comunicarme contigo");
    }

    @Override
    public void DepaSecundario() {
        System.out.println("Solo se puede comunicar con el Depa Principal conmigo");
    }
}
