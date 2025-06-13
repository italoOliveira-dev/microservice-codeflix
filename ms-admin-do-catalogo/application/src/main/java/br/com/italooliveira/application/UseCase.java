package br.com.italooliveira.application;

import br.com.italooliveira.domain.category.Category;

public class UseCase {

    public Category execute() {
        return Category.newCategory("Filme", "Melhores filmes", true);
    }
}
