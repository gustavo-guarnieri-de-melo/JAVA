
class Backend extends TecnologiaDesenvolvimento {
    private boolean conteinerizavel;

    public Backend(String linguagemProgramacao, String principalFramework, String descricaoLinguagem, String descricaoFramework, boolean conteinerizavel) {
        super(linguagemProgramacao, principalFramework, descricaoLinguagem, descricaoFramework);
        this.conteinerizavel = conteinerizavel;
    }

    @Override
    public void descricaoLinguagem() {
        System.out.println("Descrição da linguagem de programação: " + descricaoLinguagem);
    }

    @Override
    public void descricaoFramework() {
        System.out.println("Descrição do framework: " + descricaoFramework);
    }
}