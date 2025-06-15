package br.com.italooliveira.domain.category;

import br.com.italooliveira.domain.validation.NewError;
import br.com.italooliveira.domain.validation.ValidationHandler;
import br.com.italooliveira.domain.validation.Validator;

public class CategoryValidator extends Validator {

    public static final int NAME_MAX_LENGTH = 255;
    public static final int NAME_MIN_LENGTH = 3;
    private final Category category;

    public CategoryValidator(final Category aCategory, final ValidationHandler aHandler) {
        super(aHandler);
        this.category = aCategory;
    }

    @Override
    public void validate() {
        checkNameConstraints();
    }

    private void checkNameConstraints() {
        final var name = this.category.getName();

        if (name == null) {
            this.validationHandler().append(new NewError("'name' should not be null"));
            return;
        }

        final var nameWithoutSpaces = name.trim();
        if (nameWithoutSpaces.isEmpty()) {
            this.validationHandler().append(new NewError("'name' should not be empty"));
            return;
        }

        final var lengthName = nameWithoutSpaces.length();
        if (lengthName > NAME_MAX_LENGTH || lengthName < NAME_MIN_LENGTH) {
            this.validationHandler().append(new NewError("'name' should be between 3 and 255 character"));
        }
    }
}
