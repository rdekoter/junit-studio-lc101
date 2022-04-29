package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyStringValid() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void simpleBracketsValid() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void nonBracketCharactersValid() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[a[b]]"));
    }

    @Test
    public void specialCharactersValid() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[\n[\t]]\u202D"));
    }

    @Test
    public void tooManyOpensInvalid() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }

    @Test
    public void tooManyClosesInvalid() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

    @Test
    public void outOfOrderInvalid() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void nestedOutOfOrderInvalid() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]]][[]"));
    }

    @Test
    public void onlyOpenInvalid() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void onlyCloseInvalid() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void multiNestValid() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void separateGroupsValid() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[] [[]]"));
    }
}
