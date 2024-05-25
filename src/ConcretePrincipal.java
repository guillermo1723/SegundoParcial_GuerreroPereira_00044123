public class ConcretePrincipal implements AbstractDepartamento{


    @Override
    public void DepaPrincipal() {
        System.out.println("Soy el departamento pricipal");
    }

    @Override
    public void DepaSecundario() {
        System.out.println("Yo me voy a comunicar contigo");

    }
}
