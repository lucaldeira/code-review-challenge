package org.example;

import org.javatuples.Pair;

import java.time.ZonedDateTime;
import java.util.*;

public class Utils {

    public static List<Pair<ZonedDateTime, ZonedDateTime>> handledates(ZonedDateTime x, ZonedDateTime y) {
        List<Pair<ZonedDateTime, ZonedDateTime>> p = new ArrayList<>();
        ZonedDateTime a = x;
        while (a.isBefore(y)) {
            ZonedDateTime b = a.plusDays(1);
            if (b.isAfter(y)) { b = y; }
            p.add(new Pair<>(a, b));
            a = b;
        }
        return p;
    }
}