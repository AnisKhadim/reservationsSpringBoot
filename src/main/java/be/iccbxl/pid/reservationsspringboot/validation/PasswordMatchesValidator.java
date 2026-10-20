package be.iccbxl.pid.reservationsspringboot.validation;

import org.springframework.beans.BeanWrapperImpl;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {

    @Override
    public boolean isValid(Object dto, ConstraintValidatorContext context) {
        BeanWrapperImpl wrapper = new BeanWrapperImpl(dto);
        String pwd = (String) wrapper.getPropertyValue("password");
        String confirm = (String) wrapper.getPropertyValue("confirmPassword");

        // Si les deux champs sont vides, on considère que le mot de passe n'est pas modifié => OK
        if ((pwd == null || pwd.isBlank()) && (confirm == null || confirm.isBlank())) {
            return true;
        }
        // Sinon, il faut qu'ils soient identiques
        if (pwd == null) return false;
        return pwd.equals(confirm);
    }
}