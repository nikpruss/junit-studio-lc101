package test;

import org.junit.Test;
import main.BalancedBrackets;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void noBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Code"));
    }

    @Test
    public void  oneBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[") || BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void textWithSingleBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void bracketsWithinTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void multipleBracketsWithinTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode\", \"\", \"[]"));
    }

    @Test
    public void singleBracketTextReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void incorrectOrderReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code[\""));
    }

    @Test
    public void unmatchedBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[\", \"]["));
    }

    @Test
    public void missingOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode]]"));
    }

    @Test
    public void missingClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[LaunchCode]]"));
    }

}
