package br.com.italooliveira.domain.validation;

import java.util.List;

public interface ValidationHandler {

    ValidationHandler append(NewError anError);

    ValidationHandler append(ValidationHandler anHandler);

    ValidationHandler validate(Validation aValidation);

    List<NewError> getErrors();

    default boolean hasErrors() {
        return getErrors() != null && !getErrors().isEmpty();
    }

    public interface Validation {
        void validate();
    }
}
