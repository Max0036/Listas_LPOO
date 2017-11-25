
package controller;

import model.AluguelAutomovel;
import model.Automovel;
import model.Diaria;
import model.Mensal;
import model.Pessoa;

public class GerarAluguel{
        public AluguelAutomovel calcularAluguel(Pessoa p , Automovel automovel, String Aluguel){
            if("Diaria".equals(Aluguel)){
                Diaria d = new Diaria(automovel,p);
                d.setAutomovel(automovel);
                d.setPessoa(p);
                return d;
            }else if("Mensal".equals(Aluguel)){
                Mensal m = new Mensal(automovel,p);
                m.setAutomovel(automovel);
                m.setPessoa(p);
                return m;
            }
            return null;
}

    public GerarAluguel() {
    }
}
