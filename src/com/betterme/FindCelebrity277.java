package com.betterme;

public class FindCelebrity277 extends Relation{
    // A candidate: !know others; known by every other one
    // The hint is that first pass, we select a possible candidate
    // Then second pass, we handle two situations, as he already doesn't know the person behind,
    // we check if everyone knows him
    // The people before, we don't know either condition, so check both
    // An important clarification if n == 0 or n < 0
    public int findCelebrity(int n) {
        int candidate = 0;
        for (int i = 1; i < n; i++) {
            if (knows(candidate, i)) candidate = i;
        }
        for (int i = 0; i < n; i++) {
            if (i < candidate) {
                if (knows(candidate, i)) return -1;
                if (!knows(i, candidate)) return -1;
            }
            if (i > candidate) {
                if (!knows(i, candidate)) return -1;
            }
        }
        return candidate;

    }
}
