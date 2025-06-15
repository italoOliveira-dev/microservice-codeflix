package br.com.italooliveira.domain.validation.handler;

import br.com.italooliveira.domain.exceptions.DomainException;
import br.com.italooliveira.domain.validation.NewError;
import br.com.italooliveira.domain.validation.ValidationHandler;

import java.util.List;

public class ThrowsValidationHandler implements ValidationHandler {
    @Override
    public ValidationHandler append(final NewError anError) {
        throw DomainException.with(anError);
    }

    @Override
    public ValidationHandler append(final ValidationHandler anHandler) {
        throw DomainException.with(anHandler.getErrors());
    }

    @Override
    public ValidationHandler validate(final Validation aValidation) {
        try {
            aValidation.validate();
        } catch (Exception ex) {
            throw DomainException.with(new NewError(ex.getMessage()));
        }
        return this;
    }

    @Override
    public List<NewError> getErrors() {
        return List.of();
    }
}
