package io.github.arquitetura_spring.montadora;

import java.awt.*;

public class HondaHRV extends Carro{
    /*Carro recebe motor como parâmetro*/
    public HondaHRV(Motor motor) {
        super(motor);
        setModelo("HRV");
        setCor(Color.BLUE);
        setMontadora(Montadora.HONDA);
    }
}
