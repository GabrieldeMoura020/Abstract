public class Presidente extends Funcionario{

    @Override
    public Double getBonificacao() {
        return getBonificacao() * 1.10;
    }
}
