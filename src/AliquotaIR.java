public enum AliquotaIR {
        //FAIXA (LIMITE INFERIOR, LIMITE SUPERIOR, TAXA)
        FAIXA_1(0f, 1903.98f, 0f),
        FAIXA_2(1903.99f, 2826.65f, 0.075f),
        FAIXA_3(2826.66f, 3751.05f, 0.15f),
        FAIXA_4(3751.06f, 4664.68f, 0.225f),
        FAIXA_5(4664.69f, Float.MAX_VALUE, 0.275f);

        float LimiteInferior;
        float LimiteSuperior;
        float Aliquota;

        AliquotaIR(float LimiteInferior, float LimiteSuperior, float Aliquota) {
            this.LimiteInferior = LimiteInferior;
            this.LimiteSuperior = LimiteSuperior;
            this.Aliquota = Aliquota;
        }
}
