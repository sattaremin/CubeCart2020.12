package com.unitedcoder.classconcept;

import java.util.ArrayList;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class ScopeOfVariables {
    int x=200;
    public static void main(String[] args) {
        ScopeOfVariables s=new ScopeOfVariables();
        System.out.println(s.x);
        ArrayList<Integer> a=new ArrayList<>();
        a.add(200);
        a.add(400);
        sort(a);
        reverse(a);
        min(10,20);
        max(10,50);

    }
}
