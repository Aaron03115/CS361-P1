package fa.dfa;

import fa.State;
import java.util.HashMap;
import java.util.Map;

/**
 * Represents a single state in a Deterministic Finite Automaton.
 * + maps its own transitions to other states based on input symbols.
 * @author Aeagleton
 */
public class DFAState extends State {
    
    private Map<Character, DFAState> transitions;

    /**
     * Constructs a new DFAState.
     * @param name The states lable.
     */
    public DFAState(String name) {
        super(name); 
        this.transitions = new HashMap<>();
    }

    /**
     * Adds a transition from this state to another state.
     * @param onSymb The symbol triggering the transition.
     * @param toState The to state.
     */
    public void addTransition(char onSymb, DFAState toState) {
        transitions.put(onSymb, toState);
    }

    /**
     * Retrieves the destination state for a given symbol.
     * @param onSymb The alphabet symbol.
     * @return The destination DFAState, or null if no transition exists or can be made.
     */
    public DFAState getTransition(char onSymb) {
        return transitions.get(onSymb);
    }
}