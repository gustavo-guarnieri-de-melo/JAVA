
class Frontend extends TecnologiaDesenvolvimento {
    private boolean compativelWeb;
    private boolean compativelMobile;

    public Frontend(String linguagemProgramacao, String principalFramework, String descricaoLinguagem, String descricaoFramework, boolean compativelWeb, boolean compativelMobile) {
        super(linguagemProgramacao, principalFramework, descricaoLinguagem, descricaoFramework);
        this.compativelWeb = compativelWeb;
        this.compativelMobile = compativelMobile;
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