package br.com.italooliveira.infrastructure;

import br.com.italooliveira.application.UseCase;

public class InfrastructureApplication {

    public static void main(String[] args) {
        System.out.println("InfrastructureApplication.main()");
        System.out.println(new UseCase().execute());
    }

}
