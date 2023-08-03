package br.com.servlets;

import javax.servlet.ServletException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Banco {

    private static List<Empresa> lista = new ArrayList<>();

    static {

        Empresa empresa1 = new Empresa();
        empresa1.setNome("JBS");
        empresa1.setDataAbertura(new Date("01/01/2023"));

        Empresa empresa2 = new Empresa();
        empresa2.setNome("Flex");
        empresa2.setDataAbertura(new Date( "01/08/2012"));

        lista.add(empresa1);
        lista.add(empresa2);

    }
    public void adiciona(Empresa empresa) {
        lista.add(empresa);
    }

    public List<Empresa> getEmpresas(){
        return Banco.lista;
    }
}
