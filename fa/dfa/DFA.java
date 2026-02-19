package fa.dfa;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * Models a Deterministic Finite Automaton (DFA).
 * @author Aeagleton
 */
public class DFA implements DFAInterface {

    private Map<String, DFAState> states;
    private Set<Character> sigma;
    private Set<DFAState> finalStates;
    private DFAState startState;

    /**
     * Initializes an empty DFA.
     */
    public DFA() {
        this.states = new LinkedHashMap<>();
        this.sigma = new LinkedHashSet<>();
        this.finalStates = new LinkedHashSet<>();
        this.startState = null;
    }

    @Override
    public boolean addState(String name) {
        if (states.containsKey(name)) {
            return false;
        }
        states.put(name, new DFAState(name));
        return true;
    }

    @Override
    public boolean setFinal(String name) {
        DFAState state = states.get(name);
        if (state != null) {
            finalStates.add(state);
            return true;
        }
        return false;
    }

    @Override
    public boolean setStart(String name) {
        DFAState state = states.get(name);
        if (state != null) {
            startState = state;
            return true;
        }
        return false;
    }

    @Override
    public void addSigma(char symbol) {
        sigma.add(symbol);
    }

    @Override
    public boolean accepts(String s) {
        if (startState == null) return false;
        
        DFAState current = startState;
        
        // "e" represents the empty string [cite: 84]
        if (!s.equals("e")) {
            for (char c : s.toCharArray()) {
                current = current.getTransition(c);
                if (current == null) return false;
            }
        }
        
        return finalStates.contains(current);
    }

    @Override
    public Set<Character> getSigma() {
        return sigma;
    }

    @Override
    public fa.State getState(String name) {
        return states.get(name);
    }

    @Override
    public boolean isFinal(String name) {
        DFAState state = states.get(name);
        return state != null && finalStates.contains(state);
    }

    @Override
    public boolean isStart(String name) {
        DFAState state = states.get(name);
        return state != null && state == startState;
    }

    @Override
    public boolean addTransition(String fromState, String toState, char onSymb) {
        DFAState from = states.get(fromState);
        DFAState to = states.get(toState);
        
        if (from == null || to == null || !sigma.contains(onSymb)) {
            return false;
        }
        
        from.addTransition(onSymb, to);
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Q = { ");
        for (String name : states.keySet()) {
            sb.append(name).append(" ");
        }
        sb.append("}\n");
        
        sb.append("Sigma = { ");
        for (char c : sigma) {
            sb.append(c).append(" ");
        }
        sb.append("}\n");
        
        sb.append("delta =\n\t\t");
        for (char c : sigma) {
            sb.append(c).append("\t");
        }
        sb.append("\n");
        
        for (DFAState state : states.values()) {
            sb.append("\t").append(state.getName());
            for (char c : sigma) {
                DFAState to = state.getTransition(c);
                sb.append("\t").append(to != null ? to.getName() : "");
            }
            sb.append("\n");
        }
        
        sb.append("q0 = ").append(startState != null ? startState.getName() : "").append("\n");
        
        sb.append("F = { ");
        for (DFAState state : finalStates) {
            sb.append(state.getName()).append(" ");
        }
        sb.append("}\n");
        
        return sb.toString();
    }

    @Override
    public fa.dfa.DFA swap(char symb1, char symb2) {
        DFA swappedDFA = new DFA();
        
        for (char c : sigma) {
            swappedDFA.addSigma(c);
        }
        for (String name : states.keySet()) {
            swappedDFA.addState(name);
        }
        if (startState != null) {
            swappedDFA.setStart(startState.getName());
        }
        for (DFAState fs : finalStates) {
            swappedDFA.setFinal(fs.getName());
        }
        
        for (DFAState state : states.values()) {
            for (char c : sigma) {
                DFAState to = state.getTransition(c);
                if (to != null) {
                    char transitionChar = c;
                    if (c == symb1) {
                        transitionChar = symb2; 
                    } else if (c == symb2) {
                        transitionChar = symb1; 
                    }
                    swappedDFA.addTransition(state.getName(), to.getName(), transitionChar);
                }
            }
        }
        
        return swappedDFA;
    }
}