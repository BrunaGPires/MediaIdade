package Tarefas;

public class MediaArray {
    public static void main(String[] args) {
        int [] iAlunos = {6,8,6,5,6,7,6,6,6,8,8};
        double mediaAlunos = calculoMedia(iAlunos);
        int quantidadeAcimaMedia = quantidadeAcimaMedia(iAlunos, mediaAlunos);
        System.out.println("A media é " + mediaAlunos + " e tem " + quantidadeAcimaMedia + " acima da media.");
    }
    public static double calculoMedia (int[] iAlunos){
        int total = 0;
        int media = 0;
        for (int i = 0; i < iAlunos.length; i++){
            total += iAlunos[i];
            media = total/iAlunos.length;
        }
        return media;
    }
    public static int quantidadeAcimaMedia(int[] iAlunos, double mediaAlunos) {
        int mediaQuantidade = 0;
        for(int i = 0; i < iAlunos.length; i++) {
            if(iAlunos[i] > mediaAlunos) {
                mediaQuantidade++;
            }
        }
        return mediaQuantidade;
    }
}
