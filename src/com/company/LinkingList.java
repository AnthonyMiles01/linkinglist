package com.company;

import sun.security.util.Length;

public class LinkingList<T> {
    private node head = new node(1);
    private int length2 = 0;

    public int length() {
        return length2;
    }

    public void add(T value) {
        node newnode = new node(value);
        length2 += 1;
//     if(head == null){
//         head = newnode;
//     }
//     else {
        node run = head;
        while (run.next != null) {
            run = run.next;
        }
        run.next = newnode;
//     }
    }

    public void trace() {
        node run = head.next;
        while (run != null) {
            System.out.println(run.value);
            run = run.next;
        }
    }

    public boolean ctrlf(T find) {
        node run = head.next;
        while (run != null) {
            if (run.value == find) {
                return true;
            }
            run = run.next;
        }
        return false;

    }

    public int count(T count) {
        int answer = 0;
        node run = head.next;
        while (run != null) {
            if (run.value == count) {
                answer += 1;
            }
            run = run.next;
        }
        return answer;
    }

    public void remove(T value) {
        length2 -= 1;
        remove(value, false);
    }

    //    public int length() {
//        int length = 0;
//        node run = head.next;
//        while (run != null) {
//            length += 1;
//            run = run.next;
//        }
//        return length;
//    }
    public void remove(T remove, boolean deleteallsame) {
        node run = head.next;
        while (run != null && run.next != null) {
            if (run.next.value == remove) {
                run.next = run.next.next;
                if (!deleteallsame) {
                    return;
                }
            } else {
                run = run.next;
            }
        }
    }

}