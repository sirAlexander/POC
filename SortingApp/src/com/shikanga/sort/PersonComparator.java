/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.shikanga.sort;

import java.util.Comparator;

/**
 *
 * @author sir
 */
enum PersonComparator implements Comparator<Person> {
    ID_SORT {
        @Override
        public int compare(Person o1, Person o2) {
            return Integer.valueOf(o1.getId()).compareTo(o2.getId());
        }},
    NAME_SORT {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }};

    public static Comparator<Person> decending(final Comparator<Person> other) {
        return new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return -1 * other.compare(o1, o2);
            }
        };
    }

    public static Comparator<Person> getComparator(final PersonComparator... multipleOptions) {
        return new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                for (PersonComparator option : multipleOptions) {
                    int result = option.compare(o1, o2);
                    if (result != 0) {
                        return result;
                    }
                }
                return 0;
            }
        };
    }
}
