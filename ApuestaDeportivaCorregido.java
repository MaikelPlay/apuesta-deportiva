package PqUd8;

public class ApuestaDeportivaCorregido extends ApuestaCorregido
{
    //ATRIBUTOS
    private String equipo;

    //CONSTRUCTOR
    public ApuestaDeportivaCorregido(int pImporte, int pPremio,  String pEquipo)
    {
        super (pImporte, pPremio);
        this.equipo = pEquipo;
    }

    public void setEquipo(String pEquipo)
    {
        this.equipo = pEquipo;
    }

    public String getEquipo()
    {
        return this.equipo;
    }

    @Override
    public void muestraDatos()
    {
        super.muestraDatos();
        System.out.println("Equipo: " + this.getEquipo());
    }

}
