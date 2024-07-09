package tests;

import classes.Calc;
import classes.Checker;
import org.junit.Test;
import org.assertj.core.api.Assertions;
import org.mockito.Mockito;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CalcTest {
    @Test
    public void divideZeroTest() {
        Checker check = Mockito.mock(Checker.class);

        Mockito.when(check.zeroArgument(Mockito.anyDouble())).thenReturn(true);
        Calc calc = new Calc(check);

        Assertions.assertThat(calc.divide(6.0, 3.0)).isEqualTo(2.0);
    }

    @Test
    public void sqrtTest() {
        Checker check = Mockito.mock(Checker.class);

        Mockito.when(check.sqrt(Mockito.anyDouble())).thenReturn(2.0);
        Calc calc = new Calc(check);

        Assertions.assertThat(calc.sqrt(4.0)).isEqualTo(2.0);
    }

    @Test
    public void countTests() {
        Checker check = Mockito.mock(Checker.class);

        Mockito.when(check.sqrt(Mockito.anyDouble())).thenReturn(2.0);
        Mockito.when(check.zeroArgument(Mockito.anyDouble())).thenReturn(true);
        Calc calc = new Calc(check);

        calc.divide(6.0, 5.5);
        calc.sqrt(4.0);
        calc.sqrt(9.0);


        Mockito.verify(check, Mockito.times(2)).sqrt(Mockito.anyDouble());
        Mockito.verify(check, Mockito.times(1)).zeroArgument(Mockito.anyDouble());
    }

    @Test
    public void sqrtExceptionTest() {
        Calc calc = new Calc(new Checker());

        Assertions.assertThatThrownBy(()-> {
            calc.divide(9.0, 0.0);
        }).isInstanceOf(ArithmeticException.class);
    }

    @Test
    public void privateTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Calc calc = new Calc(new Checker());

        Method method = calc.getClass().getDeclaredMethod("lg", double.class);
        method.setAccessible(true);
        Assertions.assertThat(method.invoke(calc,100.0)).isEqualTo(2.0);
    }
}

