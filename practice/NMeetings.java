package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NMeetings {
    public static int maxMeetings(int start[], int end[], int n) {
        List<Meeting> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Meeting(start[i], end[i]));
        }
        Collections.sort(list, new Comparator<Meeting>() {
            @Override
            public int compare(Meeting m1, Meeting m2) {
                return m1.end - m2.end;
            }
        });
        int meet = 1;
        int e = list.get(0).end;
        for (int i = 1; i < list.size(); i++) {
            int curStart = list.get(i).start;
            if (curStart <= e) {
                meet++;
                e = list.get(i).end;
            }

        }
        return meet;
    }
}

class Meeting {
    int start;
    int end;

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
