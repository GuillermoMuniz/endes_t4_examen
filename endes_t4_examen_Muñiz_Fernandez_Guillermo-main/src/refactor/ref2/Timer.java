package refactor.ref2;

/*
Tarea: Reemplazar el número mágico 86400 con una constante descriptiva.
 */

public class Timer {

    public static final int SEGUNDOS_EN_24_HORAS = 86400;

    void startTimer() {
          try{
            Thread.sleep(SEGUNDOS_EN_24_HORAS * 1000);}
          catch
            (InterruptedException e) {

            e.printStackTrace();
        }


 

    }

}







