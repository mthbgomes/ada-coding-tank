public enum AliquotaINSS {
    //FAIXA (LIMITE INFERIOR, LIMITE SUPERIOR, TAXA)
    FAIXA_1(0f, 1212.00f, 0.075f),
    FAIXA_2(1212.01f, 2427.35f, 0.09f),
    FAIXA_3(2427.36f, 3641.03f, 0.12f),
    FAIXA_4(3641.04f, 7087.22f, 0.14f),
    FAIXA_5(7087.23f, Float.MAX_VALUE, 0.14f);

    float LimiteInferior;
    float LimiteSuperior;
    float Aliquota;

    AliquotaINSS(float LimiteInferior, float LimiteSuperior, float Aliquota) {
        this.LimiteInferior = LimiteInferior;
        this.LimiteSuperior = LimiteSuperior;
        this.Aliquota = Aliquota;

    }
}
