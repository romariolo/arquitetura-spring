package io.github.arquitetura_spring.montadora;


public class Motor {
    private String modelo;
    private Integer cavalos;
    private Integer cilindros;
    private Double liragem;
    private TipoMotor motor;


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getCavalos() {
        return cavalos;
    }

    public void setCavalos(Integer cavalos) {
        this.cavalos = cavalos;
    }

    public Integer getCilindros() {
        return cilindros;
    }

    public void setCilindros(Integer cilindros) {
        this.cilindros = cilindros;
    }

    public Double getLiragem() {
        return liragem;
    }

    public void setLiragem(Double liragem) {
        this.liragem = liragem;
    }

    public TipoMotor getMotor() {
        return motor;
    }

    public void setMotor(TipoMotor motor) {
        this.motor = motor;
    }
}

