package br.com.italooliveira.domain.category;

import br.com.italooliveira.domain.pagination.Pagination;

import java.util.Optional;

public interface CategoryGateway {

    Category create(Category aCategory);

    void deleteById(CategoryId anId);

    Optional<Category> findById(CategoryId anId);

    Pagination<Category> findAll(CategorySearchQuery aQuery);

    Category update(Category aCategory);
}
