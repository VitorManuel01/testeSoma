public class Soma {
    private int INDICE;
    private int K;
    private int SOMA;

    public int getINDICE() {
        return INDICE;
    }

    public void setINDICE(int iNDICE) {
        INDICE = iNDICE;
    }

    public int getK() {
        return K;
    }

    public void setK(int k) {
        K = k;
    }

    public int getSOMA() {
        return SOMA;
    }

    public void setSOMA(int sOMA) {
        SOMA = sOMA;
    }


    public int realizarSoma() {
        setINDICE(13);
        setK(0);
        setSOMA(0);

        do{
            setK(getK()+1);
            System.out.println(getK()); 
            setSOMA(getSOMA() + getK());
            System.out.println(getSOMA());
        }while(getK() < getINDICE());
        
        return getSOMA();
    }

}