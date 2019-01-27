package designpatterns.exercises.decorator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.HashSet;

public class RequireDigitValidatorTest {

    RequiredDigitValidator validator;

    @Before
    public void setUp(){
        validator = new RequiredDigitValidator(basicValidator);
        Mockito.when(basicValidator.isValid(Mockito.anyString())).thenReturn(true);
    }

    BasicPasswordValidator basicValidator = Mockito.mock(BasicPasswordValidator.class);

    @Test
    public void testValidatorTestsPasswordWithDigit(){
        //WHEN
        boolean result = validator.isValid("1234");

        //THEN
        assertTrue(result);
    }

    @Test
    public void testValidatorTestsPasswordWithoutDigit(){
        //WHEN
        boolean result = validator.isValid("asbc");

        //THEN
        assertFalse(result);
    }

    @Test
    public void testValidatorIsDecorating(){
        //WHEN
        boolean result = validator.isValid("asbc");

        //THEN
        assertFalse(result);
        Mockito.verify(basicValidator, Mockito.times(1)).isValid(Mockito.anyString());
    }
}
