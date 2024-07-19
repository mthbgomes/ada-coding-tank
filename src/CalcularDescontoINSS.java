public class CalcularDescontoINSS {
    public static float calcularDesconto(float salario) {
        float desconto = 0;

        if (salario >= AliquotaINSS.FAIXA_1.LimiteInferior && salario <= AliquotaINSS.FAIXA_1.LimiteSuperior) {
            desconto = salario * AliquotaINSS.FAIXA_1.Aliquota;
        } else if (salario >= AliquotaINSS.FAIXA_2.LimiteInferior && salario <= AliquotaINSS.FAIXA_2.LimiteSuperior) {
            desconto = salario * AliquotaINSS.FAIXA_2.Aliquota;
        } else if (salario >= AliquotaINSS.FAIXA_3.LimiteInferior && salario <= AliquotaINSS.FAIXA_3.LimiteSuperior) {
            desconto = salario * AliquotaINSS.FAIXA_3.Aliquota;
        } else if (salario >= AliquotaINSS.FAIXA_4.LimiteInferior && salario <= AliquotaINSS.FAIXA_4.LimiteSuperior) {
            desconto = salario * AliquotaINSS.FAIXA_4.Aliquota;
        } else if (salario >= AliquotaINSS.FAIXA_5.LimiteInferior) {
            desconto = salario * AliquotaINSS.FAIXA_5.Aliquota;
        }

        return desconto;
    }
}
