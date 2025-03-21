package ArquivoBinario;

import java.io.IOException;

public class RodarBinario {
    public final int N = 10;
    long tini, tfim, ttotalO;
    int compO, movO;
    double tseg;
    Registro registro = new Registro();
    Arquivo arqOrd = new Arquivo("Ordenado");
    Arquivo arqRev = new Arquivo("ReversamenteOrdenado");
    Arquivo arqRand = new Arquivo("Aleatorio");
    Arquivo arqCopRand = new Arquivo("CopiaRand");
    //...

    private void comecar(Arquivo arquivo){
        arquivo.initComp();
        arquivo.initMov();
        tini = System.currentTimeMillis();
    }

    private void finaliza(Arquivo arquivo) {
        tfim = System.currentTimeMillis();
        compO = arquivo.getComp();
        movO = arquivo.getMov();
        ttotalO = tfim - tini;
        tseg = (double) ttotalO / 1000.0; //converter os millisegundos para segundos
    }

    private void exibirInfo(Arquivo arquivo) throws IOException {
        arquivo.exibirArquivo();
        System.out.println("Tempo inicial: " + tini);
        System.out.println("Tempo final: " + tfim);
        System.out.println("Tempo total (millis): " + ttotalO);
        System.out.println("Tempo total (segundos): " + tseg);
        System.out.println("Quantidade de comparacoes (ainda nao implementado): "+ compO);
        System.out.println("Quantidade de movimentacoes (ainda nao implementado): " + movO);
        System.out.println();
    }

    private void geraArquivos() throws IOException {
        arqOrd.truncate(0);
        arqOrd.geraArquivoOrdenado(N);
        arqRev.truncate(0);
        arqRev.geraArquivoReverso(N);
        arqCopRand.copiaArquivo(arqRand.getArquivo());
    }

    private void geraArquivoAleatorio() throws IOException {
        arqRand.truncate(0);
        arqRand.geraArquivoRandomico(N);
    }

    public void geraTabela() throws IOException {
        this.geraArquivoAleatorio();
        for(int i=1; i<=16; i++){
            // O switch eh para chamar metodos diferentes em cada iteracao
            switch(i){
                case 1:{
                    //bubble sort

                    System.out.println("Bubble Sort");
                    this.geraArquivos();

                    this.comecar(arqOrd);
                    arqOrd.bubbleSort();
                    this.finaliza(arqOrd);
                    System.out.println("Arquivo Ordenado: ");
                    this.exibirInfo(arqOrd);//fim
                    this.comecar(arqRev);
                    arqRev.bubbleSort();
                    this.finaliza(arqRev);
                    System.out.println("Arquivo Reverso: ");
                    this.exibirInfo(arqRev);//fim
                    this.comecar(arqCopRand);
                    arqCopRand.bubbleSort();
                    this.finaliza(arqCopRand);
                    System.out.println("Arquivo Aleatorio: ");
                    this.exibirInfo(arqCopRand);//fim
                    break;
                } /*bubble Sort*/
                case 2:{
                    //insercao binaria

                    System.out.println("Insercao Binaria");
                    this.geraArquivos();

                    this.comecar(arqOrd);
                    arqOrd.insercaoBinaria();
                    this.finaliza(arqOrd);
                    System.out.println("Arquivo Ordenado: ");
                    this.exibirInfo(arqOrd);//fim
                    this.comecar(arqRev);
                    arqRev.insercaoBinaria();
                    this.finaliza(arqRev);
                    System.out.println("Arquivo Reverso: ");
                    this.exibirInfo(arqRev);//fim
                    this.comecar(arqCopRand);
                    arqCopRand.insercaoBinaria();
                    this.finaliza(arqCopRand);
                    System.out.println("Arquivo Aleatorio: ");
                    this.exibirInfo(arqCopRand);//fim
                    break;
                } /*insercao Binaria*/
                case 3:{
                    //insercao direta

                    System.out.println("Insercao Direta");
                    this.geraArquivos();

                    this.comecar(arqOrd);
                    arqOrd.insercaoDireta();
                    this.finaliza(arqOrd);
                    System.out.println("Arquivo Ordenado: ");
                    this.exibirInfo(arqOrd);//fim
                    this.comecar(arqRev);
                    arqRev.insercaoDireta();
                    this.finaliza(arqRev);
                    System.out.println("Arquivo Reverso: ");
                    this.exibirInfo(arqRev);//fim
                    this.comecar(arqCopRand);
                    arqCopRand.insercaoDireta();
                    this.finaliza(arqCopRand);
                    System.out.println("Arquivo Aleatorio: ");
                    this.exibirInfo(arqCopRand);//fim
                    break;
                } /*insercao Direta*/
                case 4:{
                    //shake sort

                    System.out.println("Shake Sort");
                    this.geraArquivos();

                    this.comecar(arqOrd);
                    arqOrd.shakesort();
                    this.finaliza(arqOrd);
                    System.out.println("Arquivo Ordenado: ");
                    this.exibirInfo(arqOrd);//fim
                    this.comecar(arqRev);
                    arqRev.shakesort();
                    this.finaliza(arqRev);
                    System.out.println("Arquivo Reverso: ");
                    this.exibirInfo(arqRev);//fim
                    this.comecar(arqCopRand);
                    arqCopRand.shakesort();
                    this.finaliza(arqCopRand);
                    System.out.println("Arquivo Aleatorio: ");
                    this.exibirInfo(arqCopRand);//fim
                    break;
                } /*shake Sort*/
                case 5:{
                    //selecao direta

                    System.out.println("Selecao Direta");
                    this.geraArquivos();

                    this.comecar(arqOrd);
                    arqOrd.selecaoDireta();
                    this.finaliza(arqOrd);
                    System.out.println("Arquivo Ordenado: ");
                    this.exibirInfo(arqOrd);//fim
                    this.comecar(arqRev);
                    arqRev.selecaoDireta();
                    this.finaliza(arqRev);
                    System.out.println("Arquivo Reverso: ");
                    this.exibirInfo(arqRev);//fim
                    this.comecar(arqCopRand);
                    arqCopRand.selecaoDireta();
                    this.finaliza(arqCopRand);
                    System.out.println("Arquivo Aleatorio: ");
                    this.exibirInfo(arqCopRand);//fim
                    break;
                } /*selecao direta*/
                case 6:{
                    //shell sort

                    System.out.println("Shell sort");
                    this.geraArquivos();

                    this.comecar(arqOrd);
                    arqOrd.shellSort();
                    this.finaliza(arqOrd);
                    System.out.println("Arquivo Ordenado: ");
                    this.exibirInfo(arqOrd);//fim
                    this.comecar(arqRev);
                    arqRev.shellSort();
                    this.finaliza(arqRev);
                    System.out.println("Arquivo Reverso: ");
                    this.exibirInfo(arqRev);//fim
                    this.comecar(arqCopRand);
                    arqCopRand.shellSort();
                    this.finaliza(arqCopRand);
                    System.out.println("Arquivo Aleatorio: ");
                    this.exibirInfo(arqCopRand);//fim
                    break;
                } /*shell sort*/
                case 7:{
                    //heap sort

                    System.out.println("Heap Sort");
                    this.geraArquivos();

                    this.comecar(arqOrd);
                    arqOrd.heapSort();
                    this.finaliza(arqOrd);
                    System.out.println("Arquivo Ordenado: ");
                    this.exibirInfo(arqOrd);//fim
                    this.comecar(arqRev);
                    arqRev.heapSort();
                    this.finaliza(arqRev);
                    System.out.println("Arquivo Reverso: ");
                    this.exibirInfo(arqRev);//fim
                    this.comecar(arqCopRand);
                    arqCopRand.heapSort();
                    this.finaliza(arqCopRand);
                    System.out.println("Arquivo Aleatorio: ");
                    this.exibirInfo(arqCopRand);//fim
                    break;
                } /*heap sort*/
                case 8:{
                    //comb sort

                    System.out.println("Comb Sort");
                    this.geraArquivos();

                    this.comecar(arqOrd);
                    arqOrd.combSort();
                    this.finaliza(arqOrd);
                    System.out.println("Arquivo Ordenado: ");
                    this.exibirInfo(arqOrd);//fim
                    this.comecar(arqRev);
                    arqRev.combSort();
                    this.finaliza(arqRev);
                    System.out.println("Arquivo Reverso: ");
                    this.exibirInfo(arqRev);//fim
                    this.comecar(arqCopRand);
                    arqCopRand.combSort();
                    this.finaliza(arqCopRand);
                    System.out.println("Arquivo Aleatorio: ");
                    this.exibirInfo(arqCopRand);//fim
                    break;
                } /*comb sort*/
                case 9:{
                    //quick sort sem pivo

                    System.out.println("Quick Sort SEM pivo");
                    this.geraArquivos();

                    this.comecar(arqOrd);
                    arqOrd.quickSortSemPivo();
                    this.finaliza(arqOrd);
                    System.out.println("Arquivo Ordenado: ");
                    this.exibirInfo(arqOrd);//fim
                    this.comecar(arqRev);
                    arqRev.quickSortSemPivo();
                    this.finaliza(arqRev);
                    System.out.println("Arquivo Reverso: ");
                    this.exibirInfo(arqRev);//fim
                    this.comecar(arqCopRand);
                    arqCopRand.quickSortSemPivo();
                    this.finaliza(arqCopRand);
                    System.out.println("Arquivo Aleatorio: ");
                    this.exibirInfo(arqCopRand);//fim
                    break;
                } /*quick sort sem pivo*/
                case 10:{
                    //quick sort com pivo

                    System.out.println("Quick Sort COM pivo");
                    this.geraArquivos();

                    this.comecar(arqOrd);
                    arqOrd.quickSortComPivo();
                    this.finaliza(arqOrd);
                    System.out.println("Arquivo Ordenado: ");
                    this.exibirInfo(arqOrd);//fim
                    this.comecar(arqRev);
                    arqRev.quickSortComPivo();
                    this.finaliza(arqRev);
                    System.out.println("Arquivo Reverso: ");
                    this.exibirInfo(arqRev);//fim
                    this.comecar(arqCopRand);
                    arqCopRand.quickSortComPivo();
                    this.finaliza(arqCopRand);
                    System.out.println("Arquivo Aleatorio: ");
                    this.exibirInfo(arqCopRand);//fim
                    break;
                } /*quick sort com pivo*/
                case 11:{
                    //count sort

                    System.out.println("Count Sort");
                    this.geraArquivos();

                    this.comecar(arqOrd);
                    arqOrd.countSort();
                    this.finaliza(arqOrd);
                    System.out.println("Arquivo Ordenado: ");
                    this.exibirInfo(arqOrd);//fim
                    this.comecar(arqRev);
                    arqRev.countSort();
                    this.finaliza(arqRev);
                    System.out.println("Arquivo Reverso: ");
                    this.exibirInfo(arqRev);//fim
                    this.comecar(arqCopRand);
                    arqCopRand.countSort();
                    this.finaliza(arqCopRand);
                    System.out.println("Arquivo Aleatorio: ");
                    this.exibirInfo(arqCopRand);//fim
                    break;
                } /*count sort*/
            }
        }

//        //grava na tabela informacoes os dados extraídos das execucoes do metodo
//        //Insercao Direta
//        gravaLinhaTabela(compO,
//                calculaCompInsDir(filesize()),
//                movO,
//                calculaMovInsDir(filesize()),
//                ttotalO //tempo execução no arquivo Ordenado já convertido para segundos
//                //...
//        );
//        //... fim Insercao Direta
//        //e assim continua para os outros métodos de ordenacao!!!
    }

    public static void rodar() throws IOException {
        RodarBinario p = new RodarBinario();
        p.geraTabela();
    }
}
