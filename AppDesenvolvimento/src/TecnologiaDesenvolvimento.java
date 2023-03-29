
abstract class TecnologiaDesenvolvimento implements Tecnologia {
    protected String linguagemProgramacao;
    protected String principalFramework;
    protected String descricaoLinguagem;
    protected String descricaoFramework;

    public TecnologiaDesenvolvimento(String linguagemProgramacao, String principalFramework, String descricaoLinguagem, String descricaoFramework) {
        this.linguagemProgramacao = linguagemProgramacao;
        this.principalFramework = principalFramework;
        this.descricaoLinguagem = descricaoLinguagem;
        this.descricaoFramework = descricaoFramework;
    }
}