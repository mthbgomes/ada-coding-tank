public class CalcularDescontoIR {
    public static float calcularDesconto(float salario) {
        float desconto = 0;

        // Verifica a faixa de salário e calcula o desconto
        if (salario >= AliquotaIR.FAIXA_1.LimiteInferior && salario <= AliquotaIR.FAIXA_1.LimiteSuperior) {
            desconto = salario * AliquotaIR.FAIXA_1.Aliquota;
        } else if (salario >= AliquotaIR.FAIXA_2.LimiteInferior && salario <= AliquotaIR.FAIXA_2.LimiteSuperior) {
            desconto = salario * AliquotaIR.FAIXA_2.Aliquota;
        } else if (salario >= AliquotaIR.FAIXA_3.LimiteInferior && salario <= AliquotaIR.FAIXA_3.LimiteSuperior) {
            desconto = salario * AliquotaIR.FAIXA_3.Aliquota;
        } else if (salario >= AliquotaIR.FAIXA_4.LimiteInferior && salario <= AliquotaIR.FAIXA_4.LimiteSuperior) {
            desconto = salario * AliquotaIR.FAIXA_4.Aliquota;
        } else if (salario >= AliquotaIR.FAIXA_5.LimiteInferior) {
            desconto = salario * AliquotaIR.FAIXA_5.Aliquota;
        }

        return desconto;
    }
}